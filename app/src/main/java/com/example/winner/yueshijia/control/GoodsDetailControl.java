package com.example.winner.yueshijia.control;

import android.content.Context;

import com.example.winner.yueshijia.base.BaseControl;
import com.example.winner.yueshijia.beans.GoodsDetailBeans;
import com.example.winner.yueshijia.conf.IDiyMessage;
import com.example.winner.yueshijia.conf.NetworkConst;
import com.google.gson.Gson;

/**
 * Created by winner on 2016/11/11.
 */
public class GoodsDetailControl extends BaseControl {
    public GoodsDetailControl(Context context) {
        super(context);
    }

    @Override
    protected String getUrlPath(int action, int index, Object... params) {
        switch (action) {
            case IDiyMessage.GOODS_DETAIL_ACTION:
                String goods_id = (String) params[0];
                String urlPath = NetworkConst.GOODS_DETAIL_URL;
                urlPath = urlPath.replace("%%%d", goods_id);
                return urlPath;
        }

        return null;
    }

    @Override
    protected void handlerJson(String response, int action, boolean isFirst) {
        switch (action) {
            case IDiyMessage.GOODS_DETAIL_ACTION:
                Gson gson = new Gson();
                GoodsDetailBeans goodsDetailBeans = gson.fromJson(response, GoodsDetailBeans.class);
                if (mListener != null) {
                    mListener.handlerMessage(action, goodsDetailBeans, isFirst);
                }
                break;
        }
    }
}
