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
import com.example.winner.yueshijia.activity.KnowledgeActivity;
import com.example.winner.yueshijia.adpter.club.KnowledgeAdapter;
import com.example.winner.yueshijia.base.BaseFragment;
import com.example.winner.yueshijia.beans.clubBean.KnowledgeBean;
import com.example.winner.yueshijia.control.ClubControl;
import com.example.winner.yueshijia.listeners.OnItemClickListener;

import java.util.List;

import static com.example.winner.yueshijia.conf.IDiyMessage.KNOWLEDGE_ACTION;
import static com.example.winner.yueshijia.conf.IntentConst.KNOWLEDGE_WEB;

/**
 * Created by winner on 2016/11/6.
 */

public class KnowledgeFragment extends BaseFragment<KnowledgeBean>  implements OnItemClickListener {

    private RecyclerView mRecyclerView;
    private KnowledgeAdapter mAdapter;

    @Override
    protected View initFragmentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_knowledge, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycle_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }

    @Override
    protected void initControl() {
        mControl =new ClubControl(getActivity());
        mControl.setHandleMessageListener(this);
        mControl.doGet(KNOWLEDGE_ACTION,addpage(),true);
    }

    @Override
    protected void initData() {
        mAdapter = new KnowledgeAdapter(getActivity());
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(this);
    }

    @Override
    public void handlerMessage(int action, KnowledgeBean bean, boolean isFirst) {
        switch (action) {
            case KNOWLEDGE_ACTION  :
                if(bean.getCode()==200) {
                    KnowledgeBean.DatasBean datasBean = bean.getDatas();
                    List<KnowledgeBean.DatasBean.ArticleListBean> listBeen = datasBean.getArticle_list();
                    mAdapter.setData(listBeen);
                }
                break;
        }
    }
    @Override
    public void onItemClick(View view, String topid) {
        Toast.makeText(getActivity(), "页面跳转", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getActivity(), KnowledgeActivity.class);
        intent.putExtra(KNOWLEDGE_WEB,topid);
        startActivity(intent);
    }
}