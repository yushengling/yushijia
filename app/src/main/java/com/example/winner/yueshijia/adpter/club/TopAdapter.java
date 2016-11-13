package com.example.winner.yueshijia.adpter.club;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.winner.yueshijia.R;
import com.example.winner.yueshijia.beans.clubBean.TopBean;

/**
 * @author ling
 * @version 1.0
 *          2016/11/11 10:36
 */
//public class TopAdapter extends BaseClubAdapter<TopBean.DatasBean.ArticleListBean>  {
public class TopAdapter extends BaseClubAdapter<TopBean.DatasBean.ArticleListBean> implements View.OnClickListener {
    /*private OnItemClickListener mOnItemClickListener;
    public void setOnItemClickListener(OnItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }*/

    public TopAdapter(Context context) {
        super(context);
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_special_top_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
        final TopBean.DatasBean.ArticleListBean bean = mData.get(position);
        Glide.with(mContext).load(bean.getArticle_image()).into(viewHolder.mIvTopListImg);
        viewHolder.mTvTopListLabel.setText(bean.getArticle_abstract());
        viewHolder.mTvTopListNum.setText(bean.getVideo_length());
        viewHolder.mTvTopListName.setText(bean.getArticle_title());
        viewHolder.mTvTopListOrigin.setText(bean.getArticle_origin());
        viewHolder.itemView.setTag(bean.getArticle_id());
        viewHolder.mRlTopList.setOnClickListener(this);
       /* viewHolder.mRlTopList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mOnItemClickListener != null) {
                    mOnItemClickListener.onItemClick(view, bean.getArticle_id());
                }
            }
        });*/




    }
    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.rl_top_list:
                String articleId    = (String) view.getTag();
                if (mOnItemClickListener != null) {
                    mOnItemClickListener.onItemClick(view, articleId);
                }

                break;
        }
    }


    private static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView mIvTopListImg;//图片
        private TextView mTvTopListLabel;//标签
        private TextView mTvTopListNum;//页数
        private TextView mTvTopListName;//图片下名称
        private TextView mTvTopListOrigin;//来源
        private RelativeLayout mRlTopList;//真个item

        private ViewHolder(View itemView) {
            super(itemView);
            this.mRlTopList = (RelativeLayout) itemView.findViewById(R.id.rl_top_list);
            this.mIvTopListImg = (ImageView) itemView.findViewById(R.id.iv_top_list_img);
            this.mTvTopListLabel = (TextView) itemView.findViewById(R.id.tv_top_list_label);
            this.mTvTopListNum = (TextView) itemView.findViewById(R.id.tv_top_list_num);
            this.mTvTopListName = (TextView) itemView.findViewById(R.id.tv_top_list_name);
            this.mTvTopListOrigin = (TextView) itemView.findViewById(R.id.tv_top_list_origin);
        }

    }
}
