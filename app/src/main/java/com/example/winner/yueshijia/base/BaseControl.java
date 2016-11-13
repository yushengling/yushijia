package com.example.winner.yueshijia.base;

import android.content.Context;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.winner.yueshijia.listeners.IHandleMessageListener;
import com.example.winner.yueshijia.utils.LogUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用volley进行网络的get和post请求
 * Created by winner on 2016/11/7.
 */

public abstract class BaseControl {

    private Context mContext;

    protected IHandleMessageListener mListener;

    public BaseControl(Context context) {
        mContext = context;
    }

    public void setHandleMessageListener(IHandleMessageListener listener) {
        mListener = listener;
    }

    /**
     * @param action  标记为加载哪种数据
     * @param index   分页加载需要的index
     * @param isFirst 标识是否是第一次加载，下拉刷新和加载更多时可以使用
     */
    public void doGet(final int action, int index, final boolean isFirst,Object...params) {
        String urlPath = getUrlPath(action, index,params);
        StringRequest request = new StringRequest(Request.Method.GET, urlPath,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        handlerJson(response, action, isFirst);
                        LogUtils.v("YueShiJiaYueShiJia", response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                LogUtils.v("YueShiJiaYueShiJia", "error:" + error.toString());
            }
        });
        Volley.newRequestQueue(mContext).add(request);
    }


    /**
     * @param action  标记为加载哪种数据
     * @param isFirst 标识是否是第一次加载，下拉刷新和加载更多时可以使用
     */
    public void doPost(final int action, final boolean isFirst) {
        String urlPath = getUrlPath(action, 0);

        StringRequest request = new StringRequest(Request.Method.POST, urlPath,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        handlerJson(response, action, isFirst);
                        LogUtils.v(response);
                    }
                }, null) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                return BaseControl.this.getPostParams(action);
            }
        };
        Volley.newRequestQueue(mContext).add(request);
    }

    /**
     * 获取url路径
     */
    protected abstract String getUrlPath(int action, int index,Object...params);

    /**
     * 从网络获取的json数据
     */
    protected abstract void handlerJson(String response, int action, boolean isFirst);


    /**
     * post方式请求网络的参数
     */
    protected Map<String, String> getPostParams(int action) {
        return new HashMap<>();
    }

}
