package com.example.winner.yueshijia.adpter.club;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.winner.yueshijia.R;
import com.example.winner.yueshijia.beans.clubBean.TopBean;

/**
 * @author ling
 * @version 1.0
 * 2016/11/11 10:36
 */
public class TestAdapter extends BaseClubAdapter <TopBean.DatasBean.ArticleListBean>{



    public TestAdapter(Context context) {
        super(context);
    }

        //1:请求后台处理给前端,处理完之毕之后给adapter处理
        //需要的时候,在取出来,


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_special_top_list, parent, false);
        return  new ViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
//        TopBean.DatasBean.ArticleListBean bean = mArticleListBeen.get(position);

        TopBean.DatasBean.ArticleListBean bean = mData.get(position);
        Glide.with(mContext).load(bean.getArticle_image()).into( viewHolder.mIvTopListImg);
        viewHolder.mTvTopListLabel.setText(bean.getArticle_abstract());
        viewHolder.mTvTopListNum.setText(bean.getVideo_length());
        viewHolder.mTvTopListName.setText(bean.getArticle_title());
        viewHolder.mTvTopListOrigin.setText(bean.getArticle_origin());
    }


    private static class ViewHolder extends RecyclerView.ViewHolder {
       private ImageView mIvTopListImg;//图片
       private TextView mTvTopListLabel;//标签
       private TextView mTvTopListNum;//页数
       private TextView mTvTopListName;//图片下名称
       private TextView mTvTopListOrigin;//来源

        private ViewHolder(View itemView) {
            super(itemView);
            this.mIvTopListImg = (ImageView) itemView.findViewById(R.id.iv_top_list_img);
            this.mTvTopListLabel = (TextView) itemView.findViewById(R.id.tv_top_list_label);
            this.mTvTopListNum = (TextView) itemView.findViewById(R.id.tv_top_list_num);
            this.mTvTopListName = (TextView) itemView.findViewById(R.id.tv_top_list_name);
            this.mTvTopListOrigin = (TextView) itemView.findViewById(R.id.tv_top_list_origin);
        }

    }
}
