package com.example.winner.yueshijia.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.winner.yueshijia.R;
import com.example.winner.yueshijia.adpter.shopAdapter.ShopAdapter;
import com.example.winner.yueshijia.base.BaseFragment;
import com.example.winner.yueshijia.beans.shopBeans.ShopBean;
import com.example.winner.yueshijia.conf.IDiyMessage;
import com.example.winner.yueshijia.control.ShopControl;

/**
 * Created by winner on 2016/11/6
 */

public class ShopFragment extends BaseFragment<ShopBean> {

    private RecyclerView mRecycle_view;
    private ShopControl mControl;
    private int mIndex = 1;
    private ShopAdapter mShopAdapter;
    private View mTopView;

    @Override
    public void handlerMessage(int action, ShopBean shopBean, boolean isFirst) {
        if (shopBean.getCode() == 200) {
            mShopAdapter.setData(shopBean.getDatas());
        }
    }

    @Override
    protected View initFragmentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_shop, container, false);
        mRecycle_view = (RecyclerView) view.findViewById(R.id.recycle_view);
        mTopView = view.findViewById(R.id.view);
        mTopView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, getStatusHeight(getActivity())));
        return view;
    }

    @Override
    protected void initControl() {
        mControl = new ShopControl(getActivity());
        mControl.setHandleMessageListener(this);
    }

    @Override
    protected void initData() {
        mControl.doGet(IDiyMessage.SHOP_ACTION, getIndex(), true);
        mRecycle_view.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        mShopAdapter = new ShopAdapter(getActivity());
        mRecycle_view.setAdapter(mShopAdapter);
    }
    public int getIndex() {
        return mIndex;
    }
}
