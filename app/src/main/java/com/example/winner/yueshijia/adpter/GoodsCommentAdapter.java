package com.example.winner.yueshijia.adpter;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.winner.yueshijia.R;
import com.example.winner.yueshijia.beans.shopBeans.ShopCommentBean;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


/**
 * @author VKEY
 * @since 2016/11/13 9:01
 */

public class GoodsCommentAdapter extends BaseAdapter {
    Context mContext;
    ArrayList<ShopCommentBean.DatasBean.GoodsEvalListBean> mData;

    public GoodsCommentAdapter(List<ShopCommentBean.DatasBean.GoodsEvalListBean> datas, Context context) {
        mContext = context;
        mData = (ArrayList<ShopCommentBean.DatasBean.GoodsEvalListBean>) datas;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = View.inflate(mContext, R.layout.item_goods_comment, null);
            holder = new ViewHolder();
            holder.iv_icon = (CircleImageView) convertView.findViewById(R.id.iv_icon);
            holder.ratingBar = (RatingBar) convertView.findViewById(R.id.ratingBar);
            holder.tv_name = (TextView) convertView.findViewById(R.id.tv_name);
            holder.tv_time = (TextView) convertView.findViewById(R.id.tv_time);
            holder.tv_content = (TextView) convertView.findViewById(R.id.tv_content);
            holder.iv_image = (ImageView) convertView.findViewById(R.id.iv_image);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        ShopCommentBean.DatasBean.GoodsEvalListBean bean = mData.get(position);
        //评论时间
        String addtime = bean.getGeval_addtime();
        long aLong = Long.parseLong(addtime);
        aLong = aLong*1000;
        Log.d("currentTimeMillis", "getView: currentTimeMillis"+System.currentTimeMillis());
        Log.d("currentTimeMillis", "getView: aLong"+aLong);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String startTime = format.format(new Date(aLong));
        holder.tv_time.setText(startTime);

        holder.tv_name.setText(bean.getMember_nick());
        holder.tv_content.setText(bean.getGeval_content());
        int scores = Integer.parseInt(bean.getGeval_scores());
        holder.ratingBar.setProgress(scores);
            // TODO: 2016/11/13

        Glide.with(mContext).load(bean.getMember_avatar()).into(holder.iv_icon);
        List<String> images = bean.getGeval_images();
        if (images.size() != 0) {
            holder.iv_image.setVisibility(View.VISIBLE);
            Glide.with(mContext).load(images.get(0)).placeholder(R.drawable.bg_morentu).into(holder.iv_image);
        }else{
            holder.iv_image.setVisibility(View.GONE);
        }
        return convertView;
    }

    class ViewHolder {
        CircleImageView iv_icon;
        TextView tv_name;
        TextView tv_time;
        RatingBar ratingBar;
        TextView tv_content;
        ImageView iv_image;
    }

}