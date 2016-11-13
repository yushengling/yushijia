package com.example.winner.yueshijia.adpter.shopAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.winner.yueshijia.R;
import com.example.winner.yueshijia.base.MyBaseAdapter;
import com.example.winner.yueshijia.beans.shopBeans.ShopBean;

import java.util.ArrayList;

/**
 * Created by winner on 2016/11/10.
 */
public class ShopTagClassAdapter extends MyBaseAdapter<ShopBean.DatasBean.TagClassBean> {

    public ShopTagClassAdapter(ArrayList<ShopBean.DatasBean.TagClassBean> list) {
        super(list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_shop_grid_item, viewGroup, false);
            holder = new ViewHolder(convertView);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        ShopBean.DatasBean.TagClassBean tagClassBean = mList.get(position);
        holder.tv_shop_banner_name.setText(tagClassBean.getTag_name());
        Glide.with(viewGroup.getContext()).load(tagClassBean.getTag_img()).into(holder.iv_shop_banner_img);
        return convertView;
    }

    public static class ViewHolder {
        public View rootView;
        public ImageView iv_shop_banner_img;
        public TextView tv_shop_banner_name;

        public ViewHolder(View rootView) {
            this.rootView = rootView;
            this.iv_shop_banner_img = (ImageView) rootView.findViewById(R.id.iv_shop_banner_img);
            this.tv_shop_banner_name = (TextView) rootView.findViewById(R.id.tv_shop_banner_name);
            rootView.setTag(this);
        }

    }
}
