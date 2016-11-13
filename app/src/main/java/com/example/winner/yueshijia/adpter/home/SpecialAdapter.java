package com.example.winner.yueshijia.adpter.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.winner.yueshijia.R;
import com.example.winner.yueshijia.base.MyBaseAdapter;
import com.example.winner.yueshijia.beans.homeBean.HomeBean;

/**
 * Created by winner on 2016/11/8.
 */

public class SpecialAdapter extends MyBaseAdapter<HomeBean.DatasBean.DataTypeBean.GoodsSpecialListBean> {
    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item__home_special_food, viewGroup, false);
            holder = new ViewHolder(convertView);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        HomeBean.DatasBean.DataTypeBean.GoodsSpecialListBean goodsSpecialListBean = mList.get(position);
        holder.tv_prize.setText("￥ " + goodsSpecialListBean.getGoods_price());
        holder.tv_name.setText(goodsSpecialListBean.getGoods_name());
        Glide.with(viewGroup.getContext()).load(goodsSpecialListBean.getGoods_img()).into(holder.iv_food);
        return convertView;
    }

    public static class ViewHolder {
        public View rootView;
        public ImageView iv_food;
        public TextView tv_name;
        public TextView tv_prize;

        public ViewHolder(View rootView) {
            this.rootView = rootView;
            this.iv_food = (ImageView) rootView.findViewById(R.id.iv_food);
            this.tv_name = (TextView) rootView.findViewById(R.id.tv_name);
            this.tv_prize = (TextView) rootView.findViewById(R.id.tv_prize);
            rootView.setTag(this);
        }

    }
}
