package com.example.winner.yueshijia.control;

import android.content.Context;

import com.example.winner.yueshijia.base.BaseControl;
import com.example.winner.yueshijia.beans.clubBean.ActivityBean;
import com.example.winner.yueshijia.beans.clubBean.CultureBean;
import com.example.winner.yueshijia.beans.clubBean.TopBean;
import com.example.winner.yueshijia.beans.clubBean.KnowledgeBean;
import com.example.winner.yueshijia.beans.clubBean.MapBean;
import com.example.winner.yueshijia.beans.clubBean.VideoBean;
import com.example.winner.yueshijia.conf.NetworkConst;
import com.example.winner.yueshijia.utils.JsonUtil;
import com.google.gson.Gson;

import static com.example.winner.yueshijia.conf.IDiyMessage.ACTIVITY_ACTION;
import static com.example.winner.yueshijia.conf.IDiyMessage.CLUB_VIDEO_ACTION;
import static com.example.winner.yueshijia.conf.IDiyMessage.CULTURE_ACTION;
import static com.example.winner.yueshijia.conf.IDiyMessage.KNOWLEDGE_ACTION;
import static com.example.winner.yueshijia.conf.IDiyMessage.MAP_ACTION;
import static com.example.winner.yueshijia.conf.IDiyMessage.TOP_ACTION;

/**
 * Created by winner on 2016/11/8.
 */

public class ClubControl extends BaseControl {
    public ClubControl(Context context) {
        super(context);
    }

    @Override
    protected String getUrlPath(int action, int index,Object...params) {
        String url = "";
        switch (action) {
            case CLUB_VIDEO_ACTION:
                url = NetworkConst.CLUB_VIDEO_URL + index;
                break;
            case TOP_ACTION:
                url = NetworkConst.TOP_URL + index;
                break;
            case KNOWLEDGE_ACTION:
                url = NetworkConst.KNOWLEDGE_URL + index;
                break;
            case CULTURE_ACTION:
                url = NetworkConst.CULTURE_URL + index;
                break;
            case MAP_ACTION:
                url = NetworkConst.MAP_URL + index;
                break;
            case ACTIVITY_ACTION:
                url = NetworkConst.ACTIVITY_URL;
                break;
        }
        return url;
    }


    @Override
    protected void handlerJson(String response, int action, boolean isFirst) {
        switch (action) {
            case CLUB_VIDEO_ACTION:
                handlerVideo(response, action, isFirst);
                break;
            case TOP_ACTION:
                handlerHot(response, action, isFirst);
                break;
            case KNOWLEDGE_ACTION:
                handlerKnowledge(response, action, isFirst);
                break;
            case CULTURE_ACTION:
                handlerCulture(response, action, isFirst);
                break;
            case MAP_ACTION:
                MapKnowledge(response, action, isFirst);
                break;
            case ACTIVITY_ACTION:
                handlerActivity(response, action, isFirst);
                break;
        }
    }

    private void handlerActivity(String response, int action, boolean isFirst) {
        ActivityBean bean = JsonUtil.parseJson(response, ActivityBean.class);
        if (mListener != null) {
            mListener.handlerMessage(action, bean, isFirst);
        }


    }

    private void MapKnowledge(String response, int action, boolean isFirst) {
        MapBean bean = JsonUtil.parseJson(response, MapBean.class);
        if (mListener != null) {
            mListener.handlerMessage(action, bean, isFirst);
        }

    }

    private void handlerCulture(String response, int action, boolean isFirst) {
        CultureBean bean = JsonUtil.parseJson(response, CultureBean.class);
        if (mListener != null) {
            mListener.handlerMessage(action, bean, isFirst);
        }
    }

    private void handlerKnowledge(String response, int action, boolean isFirst) {
        KnowledgeBean bean = JsonUtil.parseJson(response, KnowledgeBean.class);
        if (mListener != null) {
            mListener.handlerMessage(action, bean, isFirst);
        }

    }

    private void handlerHot(String response, int action, boolean isFirst) {
        TopBean bean = JsonUtil.parseJson(response, TopBean.class);
        if (mListener != null) {
            mListener.handlerMessage(action, bean, isFirst);
        }

    }

    private void handlerVideo(String response, int action, boolean isFirst) {
        Gson gson = new Gson();
        VideoBean videoBean = gson.fromJson(response, VideoBean.class);
        if (mListener != null) {
            mListener.handlerMessage(action, videoBean, isFirst);
        }
    }
}
