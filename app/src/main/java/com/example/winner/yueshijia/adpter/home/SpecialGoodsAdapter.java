package com.example.winner.yueshijia.adpter.home;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.winner.yueshijia.R;
import com.example.winner.yueshijia.activity.GoodsDetailsActivity;
import com.example.winner.yueshijia.beans.homeBean.SpecialGoodsBean;

/**
 * Created by winner on 2016/11/11.
 */

public class SpecialGoodsAdapter extends RecyclerView.Adapter {

    private static final int HEAD_TYPE = 0;
    private static final int NOR_TYPE = 1;
    private SpecialGoodsBean.DatasBean mDatasBean;
    private Context mcontext;
    private SpecialGoodsBean.DatasBean.GoodsListBean mGoodsListBean;

    public SpecialGoodsAdapter(Context mcontext) {
        this.mcontext = mcontext;
    }

    public void setDatasBean(SpecialGoodsBean.DatasBean datasBean) {
        mDatasBean = datasBean;
        notifyDataSetChanged();
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewholder = null;
        if (viewType == HEAD_TYPE) {
            View view = LayoutInflater.from(mcontext).inflate(R.layout.item_special_goods_head, parent, false);
            viewholder = new HeadViewHolder(view);
        } else if (viewType == NOR_TYPE) {
            View view = LayoutInflater.from(mcontext).inflate(R.layout.item_special_goods_nor, parent, false);
            viewholder = new NorViewHolder(view);
        }
        return viewholder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (position == 0) {
            HeadViewHolder viewHolder = (HeadViewHolder) holder;
            viewHolder.tv_head.setText(mDatasBean.getSpecial_stitle());
            Glide.with(mcontext).load(mDatasBean.getSpecial_image()).placeholder(R.drawable.bg_morentu).into(viewHolder.iv_head);
        } else {
            NorViewHolder viewHolder = (NorViewHolder) holder;
            mGoodsListBean = mDatasBean.getGoods_list().get(position - 1);
            viewHolder.tv_goods_list_full_price.setText("原价：￥" + mGoodsListBean.getGoods_marketprice());
            viewHolder.tv_goods_list_full_price.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
            viewHolder.tv_goods_list_price.setText("￥" + mGoodsListBean.getGoods_price());
            viewHolder.tv_goods_list_sold.setText("已售：" + mGoodsListBean.getGoods_salenum() + "件");
            viewHolder.tv_goods_list_name.setText(mGoodsListBean.getGoods_name());
            viewHolder.tv_goods_list_summary.setText(mGoodsListBean.getGoods_jingle());
            Glide.with(mcontext).load(mGoodsListBean.getGoods_image()).into(viewHolder.iv_goods_list_img);
            viewHolder.iv_goods_list_img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String goods_id = mGoodsListBean.getGoods_id();
                    Intent intent = new Intent(mcontext, GoodsDetailsActivity.class);
                    intent.putExtra(GoodsDetailsActivity.INTENT_KEY, goods_id);
                    mcontext.startActivity(intent);
                }
            });
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return HEAD_TYPE;
        } else
            return NOR_TYPE;
    }

    @Override
    public int getItemCount() {
        return (mDatasBean != null && mDatasBean.getGoods_list() != null) ? (mDatasBean.getGoods_list().size() + 1) : 0;
    }

    public class HeadViewHolder extends RecyclerView.ViewHolder {
        public ImageView iv_head;
        public TextView tv_head;


        public HeadViewHolder(View itemView) {
            super(itemView);
            iv_head = (ImageView) itemView.findViewById(R.id.iv_head);
            tv_head = (TextView) itemView.findViewById(R.id.tv_head);
        }
    }

    public class NorViewHolder extends RecyclerView.ViewHolder {

        public ImageView iv_goods_list_img;
        public TextView tv_goods_list_name;
        public TextView tv_goods_list_summary;
        public TextView tv_goods_list_price;
        public TextView tv_goods_list_full_price;
        public TextView tv_goods_list_sold;
        public LinearLayout ll_goods_list_big;

        public NorViewHolder(View itemView) {
            super(itemView);
            this.iv_goods_list_img = (ImageView) itemView.findViewById(R.id.iv_goods_list_img);
            this.tv_goods_list_name = (TextView) itemView.findViewById(R.id.tv_goods_list_name);
            this.tv_goods_list_summary = (TextView) itemView.findViewById(R.id.tv_goods_list_summary);
            this.tv_goods_list_price = (TextView) itemView.findViewById(R.id.tv_goods_list_price);
            this.tv_goods_list_full_price = (TextView) itemView.findViewById(R.id.tv_goods_list_full_price);
            this.tv_goods_list_sold = (TextView) itemView.findViewById(R.id.tv_goods_list_sold);
            this.ll_goods_list_big = (LinearLayout) itemView.findViewById(R.id.ll_goods_list_big);
        }
    }
}
