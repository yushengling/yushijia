package com.example.winner.yueshijia.control;

import android.content.Context;

import com.example.winner.yueshijia.base.BaseControl;
import com.example.winner.yueshijia.beans.shopBeans.ShopCommentBean;
import com.example.winner.yueshijia.conf.IDiyMessage;
import com.example.winner.yueshijia.conf.NetworkConst;
import com.google.gson.Gson;

/**
 * @author VKEY
 * @since 2016/11/13 11:18
 */

public class GoodsCommentController extends BaseControl {
    public GoodsCommentController(Context context) {
        super(context);
    }

    @Override
    protected String getUrlPath(int action, int index, Object... params) {
        switch (action) {
            case IDiyMessage.GOODS_DETAIL_COMMENT_ACTION:
                return NetworkConst.GOODS_ITEM_COMMENT_URL + index;
        }
        return "";
    }

    @Override
    protected void handlerJson(String response, int action, boolean isFirst) {
        Gson gson = new Gson();
        ShopCommentBean shopCommentBean = gson.fromJson(response, ShopCommentBean.class);
        if (mListener != null) {
            mListener.handlerMessage(action, shopCommentBean, isFirst);
        }
    }
}
