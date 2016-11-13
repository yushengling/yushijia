package com.example.winner.yueshijia.fragment.orderdetail;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.example.winner.yueshijia.R;
import com.example.winner.yueshijia.adpter.orderdetail.AllOrderAdapter;
import com.example.winner.yueshijia.base.BaseFragment;
import com.example.winner.yueshijia.beans.myorder.OrderGoodsInfo;
import com.example.winner.yueshijia.conf.IDiyMessage;
import com.example.winner.yueshijia.control.UserControl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author seventoto
 * @time 2016/11/12  14:49
 * @desc ${TODD}
 */

public class AllOrderFragment extends BaseFragment {

    private ExpandableListView mAllOrderElv;
    private AllOrderAdapter mAdapter;
    private List<OrderGoodsInfo> mGoodsInfos;

    @Override
    protected View initFragmentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_all_order, container, false);
        mAllOrderElv = (ExpandableListView) view.findViewById(R.id.all_order_elv);
        mAllOrderElv.setDividerHeight(0);
        return view;
    }

    @Override
    protected void initControl() {
        mControl = new UserControl(getContext());
        mControl.setHandleMessageListener(this);
    }

    @Override
    protected void initData() {
        mAdapter = new AllOrderAdapter(getContext());
        mAllOrderElv.setAdapter(mAdapter);

        //模拟父listView数据
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("shop", "食巧言味");
        List<HashMap<String, String>> parentDatas = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            parentDatas.add(hashMap);
        }

        //模拟子listView数据
        List<ArrayList<OrderGoodsInfo>> childDatas = new ArrayList<>();
        ArrayList<OrderGoodsInfo> infoList;
        OrderGoodsInfo childA = new OrderGoodsInfo("水果干组合", null, "100", "1", "食巧言味");
        OrderGoodsInfo childB = new OrderGoodsInfo("PABLO抹茶芝士夹心饼干", null, "86.40", "1", "食巧言味");
        OrderGoodsInfo childC = new OrderGoodsInfo("高州桂圆", null, "16", "1", "食巧言味");
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    infoList = new ArrayList<>();
                    infoList.add(childA);
                    childDatas.add(infoList);
                    break;
                case 1:
                    infoList = new ArrayList<>();
                    infoList.add(childB);
                    childDatas.add(infoList);
                    break;
                case 2:
                    infoList = new ArrayList<>();
                    infoList.add(childA);
                    infoList.add(childB);
                    infoList.add(childC);
                    childDatas.add(infoList);
                    break;
                case 3:
                    infoList = new ArrayList<>();
                    infoList.add(childB);
                    infoList.add(childB);
                    infoList.add(childC);
                    infoList.add(childC);
                    childDatas.add(infoList);
                    break;
            }
        }

        mAdapter.setData(parentDatas, childDatas);


    }

    @Override
    protected void initEvent() {
        int groupCount = mAdapter.getGroupCount();
        for (int i = 0; i < groupCount; i++) {
            if (mAllOrderElv != null) {
                mAllOrderElv.expandGroup(i);
            }
        }

        // 去掉系统自带的按钮
        mAllOrderElv.setGroupIndicator(null);
        int width = getActivity().getWindowManager().getDefaultDisplay().getWidth();
        mAllOrderElv.setIndicatorBounds(width - 40, width - 10);

        //去掉group的点击
        mAllOrderElv.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                return true;
            }
        });
        //去掉child的点击
        mAllOrderElv.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {

                return true;
            }
        });

    }

    @Override
    public void handlerMessage(int action, Object obj, boolean isFirst) {
        switch (action) {
            case IDiyMessage.MY_ORDER_ACTION:
              //  handleAllOrder(obj);
                break;
        }
    }

    /*private void handleAllOrder(Object obj) {
        if (obj != null) {
            mGoodsInfos = (ArrayList<OrderGoodsInfo>) obj;
            ArrayList<String> storeNames = new ArrayList<>();
            for (int i = 0; i < mGoodsInfos.size(); i++) {
                String store_name = mGoodsInfos.get(i).getStore_name();
                if (!storeNames.contains(store_name)) {
                    storeNames.add(store_name);
                }

            }
        }
    }*/
}
