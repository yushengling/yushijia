package com.example.winner.yueshijia.fragment.club;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.winner.yueshijia.R;
import com.example.winner.yueshijia.activity.ActivityActivity;
import com.example.winner.yueshijia.adpter.club.ActivityAdapter;
import com.example.winner.yueshijia.base.BaseFragment;
import com.example.winner.yueshijia.beans.clubBean.ActivityBean;
import com.example.winner.yueshijia.conf.IDiyMessage;
import com.example.winner.yueshijia.control.ClubControl;
import com.example.winner.yueshijia.listeners.OnItemClickListener;

import static com.example.winner.yueshijia.conf.IntentConst.ACTIVITY_WEB;

/**
 * Created by winner on 2016/11/6.
 */

public class ActivityFragment extends BaseFragment<ActivityBean> implements OnItemClickListener{
    private RecyclerView mRecycleView;

    private ActivityAdapter mAdapter;

    @Override
    protected View initFragmentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hot, container, false);
        mRecycleView = (RecyclerView) view.findViewById(R.id.recycle_view);
        mRecycleView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }

    @Override
    protected void initControl() {
        mControl = new ClubControl(getActivity());
        mControl.setHandleMessageListener(this);
        mControl.doGet(IDiyMessage.ACTIVITY_ACTION, addpage(), true);
    }


    @Override
    protected void initData() {
        mAdapter = new ActivityAdapter(getActivity());
        mRecycleView.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(this);
    }

    @Override
    public void handlerMessage(int action, ActivityBean bean, boolean isFirst) {
        switch (action) {
            case IDiyMessage.ACTIVITY_ACTION:
                if (bean.getCode() == 200) {
                    ActivityBean.DatasBean datasBean = bean.getDatas();
                    mAdapter.setData(datasBean.getVirtual());
                }
                break;
        }
    }

    @Override
    public void onItemClick(View view, String topid) {
        Toast.makeText(getActivity(), "页面跳转", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getActivity(), ActivityActivity.class);
        intent.putExtra(ACTIVITY_WEB,topid);
        startActivity(intent);
    }
}