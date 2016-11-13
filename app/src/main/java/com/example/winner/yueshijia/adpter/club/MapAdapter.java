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
import com.example.winner.yueshijia.beans.clubBean.MapBean;

/**
 * @author ling
 * @version 1.0
 *          2016/11/11 10:36
 */
public class MapAdapter extends BaseClubAdapter<MapBean.DatasBean.ArticleListBean> {



    public MapAdapter(Context context) {
        super(context);
    }

    /*public void setData(MapBean.DatasBean datasBean) {
        //1:请求后台处理给前端,处理完之毕之后给adapter处理
        this.mDatasbean = datasBean;
        mArticleListBeen = datasBean.getArticle_list();
        notifyDataSetChanged();
    }*/


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_special_map, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
        final MapBean.DatasBean.ArticleListBean bean = mData.get(position);
        Glide.with(mContext).load(bean.getArticle_image()).into(viewHolder.mIvSpecialMapImg);
        viewHolder.mTvSpecialMapName.setText(bean.getArticle_abstract());
        viewHolder.mTvSpecialMapSubtitle.setText(bean.getArticle_title());
//        viewHolder.mLlSpecialMap.setOnClickListener(this);
        viewHolder.mLlSpecialMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mOnItemClickListener != null) {
                    mOnItemClickListener.onItemClick(view,bean.getArticle_id());
                }
            }
        });


    }
/*

    @Override
    public int getItemCount() {
        return mDatasbean != null ? mArticleListBeen.size() : 0;
    }
*/

    private static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView mTvSpecialMapName;
        private TextView mTvSpecialMapSubtitle;
        private ImageView mIvSpecialMapImg;
        private LinearLayout mLlSpecialMap;

        private ViewHolder(View itemView) {
            super(itemView);

            this.mTvSpecialMapName = (TextView) itemView.findViewById(R.id.tv_special_map_name);
            this.mTvSpecialMapSubtitle = (TextView) itemView.findViewById(R.id.tv_special_map_subtitle);
            this.mIvSpecialMapImg = (ImageView) itemView.findViewById(R.id.iv_special_map_img);
            this.mLlSpecialMap = (LinearLayout) itemView.findViewById(R.id.ll_special_map);
        }

    }

}
