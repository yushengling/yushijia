package com.example.winner.yueshijia.adpter.club;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.winner.yueshijia.R;
import com.example.winner.yueshijia.beans.clubBean.CultureBean;

/**
 * @author ling
 * @version 1.0
 *          2016/11/11 10:36
 */
public class CultureAdapter extends BaseClubAdapter<CultureBean.DatasBean.ArticleListBean> {


    public CultureAdapter(Context context) {
        super(context);

    }

   /* public void setData(CultureBean.DatasBean datasBean) {
        //1:请求后台处理给前端,处理完之毕之后给adapter处理
        this.mDatasbean = datasBean;
        mArticleListBeen = datasBean.getArticle_list();
        notifyDataSetChanged();
    }
*/

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_special_humanity, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
        final CultureBean.DatasBean.ArticleListBean bean = mData.get(position);
        Glide.with(mContext).load(bean.getArticle_image()).into(viewHolder.mIvHumanityImg);
        viewHolder.mTvHumanityName.setText(bean.getArticle_abstract());
        viewHolder.mTvHumanitySubtitle.setText(bean.getArticle_title());
//        viewHolder.mLlSpecialHumanity.setOnClickListener(this);
        viewHolder.mLlSpecialHumanity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mOnItemClickListener != null) {
                    mOnItemClickListener.onItemClick(view, bean.getArticle_id());
                }
            }
        });

    }

   /* @Override
    public int getItemCount() {
        return mDatasbean != null ? mArticleListBeen.size() : 0;
    }
*/
    private static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView mIvHumanityImg;
        private TextView mTvHumanityName;
        private TextView mTvHumanitySubtitle;
        private LinearLayout mLlSpecialHumanity;

        private ViewHolder(View itemView) {
            super(itemView);
            this.mIvHumanityImg = (ImageView) itemView.findViewById(R.id.iv_humanity_img);
            this.mTvHumanityName = (TextView) itemView.findViewById(R.id.tv_humanity_name);
            this.mTvHumanitySubtitle = (TextView) itemView.findViewById(R.id.tv_humanity_subtitle);
            this.mLlSpecialHumanity = (LinearLayout) itemView.findViewById(R.id.ll_special_humanity);
        }

    }


}
