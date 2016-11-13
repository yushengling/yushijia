package com.example.winner.yueshijia.control;

import android.content.Context;

import com.example.winner.yueshijia.base.BaseControl;
import com.example.winner.yueshijia.beans.clubBean.ActivityDetailBean;
import com.example.winner.yueshijia.beans.clubBean.ClubDetailBean;
import com.example.winner.yueshijia.conf.NetworkConst;
import com.example.winner.yueshijia.utils.JsonUtil;

import static com.example.winner.yueshijia.conf.IDiyMessage.ACTIVITY_DETAIL_ACTION;
import static com.example.winner.yueshijia.conf.IDiyMessage.CULTURE_DETAIL_ACTION;
import static com.example.winner.yueshijia.conf.IDiyMessage.KNOWLEDGE_DETAIL_ACTION;
import static com.example.winner.yueshijia.conf.IDiyMessage.MAP_DETAIL_ACTION;
import static com.example.winner.yueshijia.conf.IDiyMessage.TOP_DETAIL_ACTION;

/**
 * @author ling
 * @version 1.0
 * 2016/11/12 9:18
 */
public class ClubDetailControl extends BaseControl {

    public ClubDetailControl(Context context) {
        super(context);
    }

    @Override
    protected String getUrlPath(int action, int index, Object... params) {

        String url = "";
        switch (action) {
            case TOP_DETAIL_ACTION:
                url = NetworkConst.getTopDetailUrl(TOP_DETAIL_ACTION, (String) params[0]);
                break;
            case KNOWLEDGE_DETAIL_ACTION:
                url = NetworkConst.getTopDetailUrl(KNOWLEDGE_DETAIL_ACTION, (String) params[0]);
                break;
            case CULTURE_DETAIL_ACTION:
                url = NetworkConst.getTopDetailUrl(CULTURE_DETAIL_ACTION, (String) params[0]);
                break;
            case MAP_DETAIL_ACTION:
                url = NetworkConst.getTopDetailUrl(MAP_DETAIL_ACTION, (String) params[0]);
                break;
            case ACTIVITY_DETAIL_ACTION:
                url = NetworkConst.getTopDetailUrl(ACTIVITY_DETAIL_ACTION, (String) params[0]);
                break;
        }
        return url;
    }


    @Override
    protected void handlerJson(String response, int action, boolean isFirst) {
        switch (action) {
            case TOP_DETAIL_ACTION:
                handlerClubDetail(response, action, isFirst);
                break;
            case KNOWLEDGE_DETAIL_ACTION:
                handlerClubDetail(response, action, isFirst);
                break;
            case CULTURE_DETAIL_ACTION:
                handlerClubDetail(response, action, isFirst);
                break;
            case MAP_DETAIL_ACTION:
                handlerClubDetail(response, action, isFirst);
                break;
            case ACTIVITY_DETAIL_ACTION:
                handlerActivityDetail(response, action, isFirst);
                break;
        }
    }

    private void handlerClubDetail(String response, int action, boolean isFirst) {
        ClubDetailBean bean = JsonUtil.parseJson(response, ClubDetailBean.class);
        if (mListener != null) {
            mListener.handlerMessage(action, bean, isFirst);
        }
    }
    private void handlerActivityDetail(String response, int action, boolean isFirst) {
        ActivityDetailBean bean = JsonUtil.parseJson(response, ActivityDetailBean.class);
        if (mListener != null) {
            mListener.handlerMessage(action, bean, isFirst);
        }
    }
}
