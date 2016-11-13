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
import com.example.winner.yueshijia.activity.MapActivity;
import com.example.winner.yueshijia.adpter.club.MapAdapter;
import com.example.winner.yueshijia.base.BaseFragment;
import com.example.winner.yueshijia.beans.clubBean.MapBean;
import com.example.winner.yueshijia.conf.IDiyMessage;
import com.example.winner.yueshijia.control.ClubControl;
import com.example.winner.yueshijia.listeners.OnItemClickListener;

import static com.example.winner.yueshijia.conf.IntentConst.MAP_WEB;

/**
 * Created by winner on 2016/11/6.
 */

public class MapFragment extends BaseFragment<MapBean>  implements OnItemClickListener {

    private RecyclerView mRecycleView;
    private MapAdapter mAdapter;

    @Override
    protected View initFragmentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_map, container, false);
        mRecycleView = (RecyclerView) view.findViewById(R.id.recycle_view);
        mRecycleView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }

    @Override
    protected void initControl() {
        mControl = new ClubControl(getActivity());
        mControl.setHandleMessageListener(this);
        mControl.doGet(IDiyMessage.MAP_ACTION, addpage(), true);
    }
    @Override
    protected void initData() {
        mAdapter = new MapAdapter(getActivity());
        mRecycleView.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(this);
    }
    @Override
    public void handlerMessage(int action, MapBean bean, boolean isFirst) {
        switch (action) {
            case IDiyMessage.MAP_ACTION:
                if (bean.getCode() == 200) {
                    MapBean.DatasBean datasBean = bean.getDatas();
                    mAdapter.setData(datasBean.getArticle_list());
                }
                break;
        }
    }
    @Override
    public void onItemClick(View view, String topid) {
        Toast.makeText(getActivity(), "页面跳转", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getActivity(), MapActivity.class);
        intent.putExtra(MAP_WEB,topid);
        startActivity(intent);
    }

}

