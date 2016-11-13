package com.example.winner.yueshijia.control;

import android.content.Context;

import com.example.winner.yueshijia.base.BaseControl;
import com.example.winner.yueshijia.beans.myorder.OrderGoodsInfo;
import com.example.winner.yueshijia.beans.myorder.ROrderResult;
import com.example.winner.yueshijia.conf.IDiyMessage;
import com.example.winner.yueshijia.conf.NetworkConst;
import com.example.winner.yueshijia.utils.JsonUtil;

import java.util.List;

/**
 * @author seventoto
 * @time 2016/11/10  16:13
 * @desc ${TODD}
 */
public class UserControl extends BaseControl{
    public UserControl(Context context) {
        super(context);
    }

    @Override
    protected String getUrlPath(int action, int index, Object... params) {
        switch (action) {
            case IDiyMessage.MY_ORDER_ACTION :
                return NetworkConst.MY_ORDER_URL;
        }
        return null;
    }


    @Override
    protected void handlerJson(String response, int action, boolean isFirst) {
        switch (action) {
            case IDiyMessage.MY_ORDER_ACTION:
                ROrderResult rOrderResult = JsonUtil.parseJson(response, ROrderResult.class);
                if(rOrderResult.getCode()==200) {
                    List<OrderGoodsInfo> goods_list = rOrderResult.getDatas().getGoods_list();
                    mListener.handlerMessage(action,goods_list,true);
                }
                break;
        }
    }
}
