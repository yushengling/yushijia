package com.example.winner.yueshijia.fragment.club;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.winner.yueshijia.R;
import com.example.winner.yueshijia.adpter.club.VideoAdapter;
import com.example.winner.yueshijia.base.BaseFragment;
import com.example.winner.yueshijia.beans.clubBean.VideoBean;
import com.example.winner.yueshijia.conf.IDiyMessage;
import com.example.winner.yueshijia.control.ClubControl;

import java.util.ArrayList;

import me.maxwin.view.XListView;

/**
 * Created by winner on 2016/11/6.
 */

public class VideoFragment extends BaseFragment<VideoBean> {

    private XListView mVideo_lv;
    private int index = 1;
    private VideoAdapter mAdapter;
    private ClubControl mControl;
    private ArrayList<VideoBean.DatasBean.ArticleListBean> datas;
    private boolean hasMore = true;

    @Override
    public void handlerMessage(int action, VideoBean videoBean, boolean isFirst) {
        switch (action) {
            case IDiyMessage.CLUB_VIDEO_ACTION:
                handlerVideo(videoBean, isFirst);
                break;
        }
    }

    private void handlerVideo(VideoBean videoBean, boolean isFirst) {
        if (videoBean.getCode() == 200) {
            if (isFirst) {
                datas.clear();
                datas.addAll(videoBean.getDatas().getArticle_list());
                mAdapter.setData(datas);
                mVideo_lv.stopRefresh();
            } else {
                datas.addAll(videoBean.getDatas().getArticle_list());
                mAdapter.setData(datas);
                mVideo_lv.stopLoadMore();
            }

            mVideo_lv.setPullLoadEnable(videoBean.isHasmore() ? true : false);
        }
    }

    @Override
    protected View initFragmentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_video, container, false);
        mVideo_lv = (XListView) view.findViewById(R.id.video_lv);
        mVideo_lv.setPullLoadEnable(true);
        mVideo_lv.setPullRefreshEnable(true);
        return view;
    }

    @Override
    protected void initControl() {
        mControl = new ClubControl(getActivity());
        mControl.setHandleMessageListener(this);
        mControl.doGet(IDiyMessage.CLUB_VIDEO_ACTION, getIndex(), true);
    }

    @Override
    protected void initData() {
        datas = new ArrayList<>();
        mAdapter = new VideoAdapter();
        mVideo_lv.setAdapter(mAdapter);
    }


    private int getIndex() {
        return index++;
    }

    @Override
    protected void initEvent() {
        mVideo_lv.setXListViewListener(new XListView.IXListViewListener() {
            @Override
            public void onRefresh() {
                index = 0;
                mControl.doGet(IDiyMessage.CLUB_VIDEO_ACTION, getIndex(), true);
            }

            @Override
            public void onLoadMore() {
                mControl.doGet(IDiyMessage.CLUB_VIDEO_ACTION, getIndex(), false);
            }
        });
    }
}
