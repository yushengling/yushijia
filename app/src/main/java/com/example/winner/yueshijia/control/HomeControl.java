package com.example.winner.yueshijia.control;

import android.content.Context;

import com.example.winner.yueshijia.base.BaseControl;
import com.example.winner.yueshijia.beans.homeBean.HomeBean;
import com.example.winner.yueshijia.conf.NetworkConst;
import com.example.winner.yueshijia.conf.IDiyMessage;
import com.google.gson.Gson;

/**
 * Created by winner on 2016/11/7.
 */

public class HomeControl extends BaseControl {
    public HomeControl(Context context) {
        super(context);
    }

    @Override
    protected String getUrlPath(int action, int index,Object...params) {
        switch (action) {
            case IDiyMessage.HOME_ACTION:
                return NetworkConst.HOME_URL + index;
        }
        return "";
    }

    @Override
    protected void handlerJson(String response, int action, boolean isFirst) {

        switch (action) {
            case IDiyMessage.HOME_ACTION:
                handlerHome(response, action, isFirst);
                break;
        }
    }

    private void handlerHome(String response, int action, boolean isFirst) {
        Gson gson = new Gson();
        HomeBean homeBean = gson.fromJson(response, HomeBean.class);
        if (mListener != null) {
            mListener.handlerMessage(action, homeBean, isFirst);
        }
    }
}
