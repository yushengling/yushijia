package com.example.winner.yueshijia.adpter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.winner.yueshijia.R;
import com.example.winner.yueshijia.activity.GoodsDetailsActivity;
import com.example.winner.yueshijia.base.MyBaseAdapter;
import com.example.winner.yueshijia.beans.snacksBean;
import com.example.winner.yueshijia.utils.ActivityUtils;


import java.util.ArrayList;

/**
 * Created by hasee on 2016/11/10.
 */
public class snacksAdapter extends MyBaseAdapter<snacksBean.snacks.snackslist> {

    private ArrayList<snacksBean.snacks.snackslist> snackslists;
    private Context mContext;

    public snacksAdapter(Context mContext,ArrayList<snacksBean.snacks.snackslist> snackslists) {
        this.mContext = mContext;
        this.snackslists = snackslists;
    }
    @Override
    public int getCount() {
        return snackslists != null ? snackslists.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return snackslists.get(position-1);
    }
 /*    @Override
      public int getViewTypeCount() {
        return 10;
    }*/
    @Override
    public View getView(int position, View convertView, final ViewGroup parent) {
        ViewHolder holder=null;
        if (convertView==null){
            convertView= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_goods_list_big,parent,false);
            holder=new ViewHolder();
           /* holder.good_snacks_iv= (ImageView) convertView.findViewById(R.id.good_snacks_iv);
            holder.good_snacks_tv= (TextView) convertView.findViewById(R.id.good_snacks_tv);
            holder.good_list_tv= (TextView) convertView.findViewById(R.id.good_list_tv);
            holder.marpaice_tv= (TextView) convertView.findViewById(R.id.marpaice_tv);
            holder.good_price_tv= (TextView) convertView.findViewById(R.id.good_price_tv);
            holder.slaes_tv= (TextView) convertView.findViewById(R.id.slaes_tv);*/
            holder.ll_goods_list_big= (LinearLayout) convertView.findViewById(R.id.ll_goods_list_big);
            holder.iv_goods_list_img= (ImageView) convertView.findViewById(R.id.iv_goods_list_img);
            holder.tv_goods_list_full_price = (TextView) convertView.findViewById(R.id.tv_goods_list_full_price);
            holder.tv_goods_list_name = (TextView) convertView.findViewById(R.id.tv_goods_list_name);
            holder.tv_goods_list_summary = (TextView) convertView.findViewById(R.id.tv_goods_list_summary);
            holder.tv_goods_list_price = (TextView) convertView.findViewById(R.id.tv_goods_list_price);
            holder.tv_goods_list_sold = (TextView) convertView.findViewById(R.id.tv_goods_list_sold);
            convertView.setTag(holder);
        }
        else{
            holder= (ViewHolder) convertView.getTag();
        }
        snacksBean.snacks.snackslist bean = snackslists.get(position);
        String  name =bean.getGoods_name();
        holder.tv_goods_list_full_price.setText("¥ "+bean.getGoods_price());
        holder.tv_goods_list_name.setText(bean.getGoods_name());
        holder.tv_goods_list_summary.setText(bean.getGoods_jingle());
        holder.tv_goods_list_price.setText("原价 ¥ " +bean.getGoods_marketprice());
        holder.tv_goods_list_sold.setText("已售:"+bean.getGoods_salenum()+"件");
        Glide.with(parent.getContext()).load(bean.getGoods_image()).into(holder.iv_goods_list_img);
        holder.ll_goods_list_big.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
       /* holder.good_snacks_tv.setText(bean.getGoods_name());
        holder.good_list_tv.setText(bean.getGoods_jingle());
        holder.good_price_tv.setText("¥ "+bean.getGoods_price());
        holder.marpaice_tv.setText("原价 ¥ " +bean.getGoods_marketprice());
        holder.slaes_tv.setText("已售:"+bean.getGoods_salenum()+"件");
        Glide.with(parent.getContext()).load(bean.getGoods_image()).into(holder.good_snacks_iv);*/
        return convertView;
    }

    class ViewHolder{
        /*ImageView good_snacks_iv;
        TextView good_snacks_tv;
        TextView good_list_tv;
        TextView marpaice_tv;
        TextView good_price_tv;
        TextView slaes_tv;*/
        LinearLayout ll_goods_list_big;
        ImageView iv_goods_list_img;
        TextView  tv_goods_list_name;
        TextView  tv_goods_list_summary;
        TextView  tv_goods_list_price;
        TextView  tv_goods_list_full_price;
        TextView  tv_goods_list_sold;
    }
}
