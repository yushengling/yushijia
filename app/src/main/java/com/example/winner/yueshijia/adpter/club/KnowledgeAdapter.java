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
import com.example.winner.yueshijia.beans.clubBean.KnowledgeBean;

/**
 * @author ling
 * @version 1.0
 * 2016/11/11 10:36
 */
public class KnowledgeAdapter  extends BaseClubAdapter<KnowledgeBean.DatasBean.ArticleListBean> {

    public KnowledgeAdapter(Context context) {
        super(context);
    }

    /*public void setData(KnowledgeBean.DatasBean datasBean) {
        //1:请求后台处理给前端,处理完之毕之后给adapter处理
        this.mDatasbean = datasBean;
        mArticleListBeen = mDatasbean.getArticle_list();
        notifyDataSetChanged();
    }
*/

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_special_knowledge, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
        final KnowledgeBean.DatasBean.ArticleListBean bean = mData.get(position);
        Glide.with(mContext).load(bean.getArticle_image()).into(viewHolder.mIvSpecialKnowledgeImg);
        viewHolder.mTvSpecialKnowledgeQa.setText("Q&A");
        viewHolder.mTvSpecialKnowledgeName.setText(bean.getArticle_abstract());
        viewHolder.mTvSpecialKnowledgeSubtitle.setText(bean.getArticle_title());
        // viewHolder.mLlSpecialKnowledge.setOnClickListener(this);
        viewHolder.mLlSpecialKnowledge.setOnClickListener(new View.OnClickListener() {
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
    }*/

    private static class ViewHolder extends RecyclerView.ViewHolder  {
       private ImageView mIvSpecialKnowledgeImg;
       private TextView mTvSpecialKnowledgeQa;
       private TextView mTvSpecialKnowledgeName;
       private TextView mTvSpecialKnowledgeSubtitle;
       private LinearLayout mLlSpecialKnowledge;

       private ViewHolder(View itemView) {
           super(itemView);
           this.mIvSpecialKnowledgeImg = (ImageView) itemView.findViewById(R.id.iv_special_knowledge_img);
            this.mTvSpecialKnowledgeQa = (TextView) itemView.findViewById(R.id.tv_special_knowledge_qa);
            this.mTvSpecialKnowledgeName = (TextView) itemView.findViewById(R.id.tv_special_knowledge_name);
            this.mTvSpecialKnowledgeSubtitle = (TextView) itemView.findViewById(R.id.tv_special_knowledge_subtitle);
            this.mLlSpecialKnowledge = (LinearLayout) itemView.findViewById(R.id.ll_special_knowledge);
        }

    }
}
