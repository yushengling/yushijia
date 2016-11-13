package com.example.winner.yueshijia.control;

import android.content.Context;
import android.provider.Settings;

import com.example.winner.yueshijia.base.BaseControl;
import com.example.winner.yueshijia.beans.snacksBean;
import com.example.winner.yueshijia.conf.IDiyMessage;
import com.example.winner.yueshijia.conf.NetworkConst;
import com.google.gson.Gson;

/**
 * Created by hasee on 2016/11/10.
 */

public class snacksControl extends BaseControl {

    public snacksControl(Context context) {
        super(context);
    }

    @Override
    protected String getUrlPath(int action, int index, Object... params) {
        switch (action){
            case IDiyMessage.SNACKS_ACTION:
                return NetworkConst.SNACKS_URL+index+"&tag_id=1";
        }
        return "";
    }


    @Override
    protected void handlerJson(String response, int action, boolean isFirst) {
        switch (action){
            case IDiyMessage.SNACKS_ACTION:
                handlerSnacks(response,action,isFirst);
                break;
        }
    }

    private void handlerSnacks(String response,int action,boolean isFistt){
          //解析json数据
        Gson gson = new Gson();
        snacksBean snacksBean = gson.fromJson(response, snacksBean.class);
        System.out.printf(snacksBean+"");
        if (mListener!=null){
            //第一次加载数据
            mListener.handlerMessage(action,snacksBean,isFistt);
        }
    }
}
