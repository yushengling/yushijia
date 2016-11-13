package com.example.winner.yueshijia.adpter.orderdetail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.winner.yueshijia.R;
import com.example.winner.yueshijia.beans.myorder.OrderGoodsInfo;
import com.loopj.android.image.SmartImageView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author seventoto
 * @time 2016/11/12  20:18
 * @desc ${TODD}
 */

public class AllOrderAdapter extends BaseExpandableListAdapter {
    private List<HashMap<String, String>> mParentDatas;
    private List<ArrayList<OrderGoodsInfo>> mChildDatas;
    private Context mContext;

    public AllOrderAdapter(Context context) {
        mParentDatas = new ArrayList<>();
        mChildDatas = new ArrayList<>();
        mContext = context;
    }

    public void setData(List<HashMap<String, String>> parentDatas,
                        List<ArrayList<OrderGoodsInfo>> childDatas) {
        mParentDatas=parentDatas;
        mChildDatas=childDatas;
        notifyDataSetChanged();
    }


    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        ParentHolder parentHolder;
        if (convertView == null) {
            parentHolder = new ParentHolder();
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_order_parent, parent, false);
            parentHolder.shopNameTv = (TextView) convertView.findViewById(R.id.shop_name_tv);
            convertView.setTag(parentHolder);
        } else {
            parentHolder = (ParentHolder) convertView.getTag();
        }
        HashMap<String, String> group =(HashMap<String, String>)getGroup(groupPosition);
        parentHolder.shopNameTv.setText(group.get("shop"));
        return convertView;
    }

    @Override
    public int getGroupCount() {
        return mParentDatas.size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return mParentDatas.get(groupPosition);
    }


    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        ChildHolder childHolder;
        if (convertView == null) {
            childHolder = new ChildHolder();
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_order_child, parent, false);
            childHolder.iconSiv = (SmartImageView) convertView.findViewById(R.id.icon_product_siv);
            childHolder.desTv = (TextView) convertView.findViewById(R.id.product_des_tv);
            childHolder.priceTv = (TextView) convertView.findViewById(R.id.product_price_tv);
            childHolder.countTv = (TextView) convertView.findViewById(R.id.product_count_tv);
            childHolder.bottomRl = (RelativeLayout) convertView.findViewById(R.id.child_bottom_rl);
            childHolder.totalProTv = (TextView) convertView.findViewById(R.id.total_pro_tv);
            childHolder.totalPriceTv = (TextView) convertView.findViewById(R.id.total_price_tv);


            convertView.setTag(childHolder);

        } else {
            childHolder = (ChildHolder) convertView.getTag();
        }
        OrderGoodsInfo child = (OrderGoodsInfo) getChild(groupPosition, childPosition);
        childHolder.desTv.setText(child.getGoods_name());
        childHolder.priceTv.setText("¥ "+child.getGoods_price());
        childHolder.countTv.setText("x"+child.getGoods_salenum());
        if (isLastChild) {
            childHolder.bottomRl.setVisibility(View.VISIBLE);
            childHolder.totalProTv.setText("共"+getChildrenCount(groupPosition)+"件商品");
        } else {
            childHolder.bottomRl.setVisibility(View.GONE);
        }
        return convertView;
    }


    @Override
    public int getChildrenCount(int groupPosition) {
        return mChildDatas.get(groupPosition).size();
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return mChildDatas.get(groupPosition).get(childPosition);
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }


    class ParentHolder {
        TextView shopNameTv;
    }

    class ChildHolder {
        SmartImageView iconSiv;
        TextView desTv;
        TextView priceTv;
        TextView countTv;
        TextView totalProTv;
        TextView totalPriceTv;
        RelativeLayout bottomRl;
    }
}
