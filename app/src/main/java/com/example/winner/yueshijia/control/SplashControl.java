package com.example.winner.yueshijia.control;

import android.content.Context;

import com.example.winner.yueshijia.base.BaseControl;
import com.example.winner.yueshijia.beans.splash.SplashBean;
import com.example.winner.yueshijia.conf.NetworkConst;
import com.example.winner.yueshijia.utils.JsonUtil;

import static com.example.winner.yueshijia.conf.IDiyMessage.SPLASH_ACTION;

/**
 * @author ling
 * @version 1.0
 * 2016/11/10 14:07
 */
public class SplashControl extends BaseControl {

    public SplashControl(Context context) {
        super(context);
    }

    @Override
    protected String getUrlPath(int action, int index,Object...params) {
        switch (action) {
            case SPLASH_ACTION:
                return NetworkConst.SPLASH_URL;
        }
        return null;
    }

    @Override
    protected void handlerJson(String response, int action, boolean isFirst) {
        switch (action) {
            case SPLASH_ACTION:
                handlerfSplash(response, action, isFirst);
                break;
        }
    }

    //动画处理
    private void handlerfSplash(String response, int action, boolean isFirst) {
        SplashBean bean = JsonUtil.parseJson(response, SplashBean.class);
        if (mListener != null) {
            mListener.handlerMessage(action, bean, isFirst);
        }

    }
}
