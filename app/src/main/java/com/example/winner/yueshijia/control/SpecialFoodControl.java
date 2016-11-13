package com.example.winner.yueshijia.control;

import android.content.Context;

import com.example.winner.yueshijia.base.BaseControl;
import com.example.winner.yueshijia.beans.homeBean.SpecialGoodsBean;
import com.example.winner.yueshijia.conf.IDiyMessage;
import com.example.winner.yueshijia.conf.NetworkConst;
import com.google.gson.Gson;

/**
 * Created by winner on 2016/11/11.
 */

public class SpecialFoodControl extends BaseControl {
    public SpecialFoodControl(Context context) {
        super(context);
    }

    @Override
    protected String getUrlPath(int action, int index, Object... params) {
        switch (action) {
            case IDiyMessage.SPECIAL_GOODS_ACTION:
                String urlPath = NetworkConst.HOME_IMG_URL;
                urlPath = urlPath.replace("%%%d", (String) params[0]) + index;
                return urlPath;
        }
        return null;
    }

    @Override
    protected void handlerJson(String response, int action, boolean isFirst) {
        switch (action) {
            case IDiyMessage.SPECIAL_GOODS_ACTION:
                Gson gson = new Gson();
                SpecialGoodsBean specialGoodsBean = gson.fromJson(response, SpecialGoodsBean.class);
                if (mListener != null) {
                    mListener.handlerMessage(action, specialGoodsBean, isFirst);
                }
                break;
        }
    }
}
