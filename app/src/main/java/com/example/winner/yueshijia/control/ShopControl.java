package com.example.winner.yueshijia.control;

import android.content.Context;

import com.example.winner.yueshijia.base.BaseControl;
import com.example.winner.yueshijia.beans.shopBeans.ShopBean;
import com.example.winner.yueshijia.conf.NetworkConst;
import com.example.winner.yueshijia.conf.IDiyMessage;
import com.google.gson.Gson;

/**
 * 商店fragment的请求网络的控制器
 */
public class ShopControl extends BaseControl {
    public ShopControl(Context context) {
        super(context);
    }

    @Override
    protected String getUrlPath(int action, int index,Object...params) {
        switch (action) {
            case IDiyMessage.SHOP_ACTION:
                return NetworkConst.SHOP_URL + index;
        }
        return "";
    }

    @Override
    protected void handlerJson(String response, int action, boolean isFirst) {
        Gson gson = new Gson();
        ShopBean shopBean = gson.fromJson(response, ShopBean.class);
        if (mListener != null) {
            mListener.handlerMessage(action, shopBean, isFirst);
        }
    }
}
