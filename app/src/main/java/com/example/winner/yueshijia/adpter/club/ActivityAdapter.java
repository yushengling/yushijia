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
import com.example.winner.yueshijia.beans.clubBean.ActivityBean;

/**
 * @author ling
 * @version 1.0
 *          2016/11/11 10:36
 */
public class ActivityAdapter extends BaseClubAdapter<ActivityBean.DatasBean.VirtualBean> {
    //public class TopAdapter extends BaseClubAdapter<TopBean.DatasBean.ArticleListBean> implements View.OnClickListener {
    /*private OnItemClickListener mOnItemClickListener;

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }*/

    public ActivityAdapter(Context context) {
        super(context);
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_special_activity, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
        final ActivityBean.DatasBean.VirtualBean bean = mData.get(position);
        Glide.with(mContext).load(bean.getGoods_image()).into(viewHolder.mIvSpecialActivityImg);
        /**
         * goods_name : 【已售罄】 悦食厨艺课之风情暖宴
         * virtual_indate : 1477843199
         * goods_image : http://yueshi.b0.upaiyun.com/goods/12/2016/10/25/8c22f209fdffbba42a774cfe16aa8414_180.jpg
         * goods_id : 1129
         * store_id : 12
         * hint_virtual : 期待下次与您相聚
         * type_virtual : 2
         * end_virtual : 活动已结束
         */
        viewHolder.mTvSpecialActivityTime.setText(bean.getEnd_virtual());
        viewHolder.mTvSpecialActivityTitle.setText(bean.getGoods_name());
        viewHolder.mTvSpecialActivityDesc.setText(bean.getHint_virtual());
        viewHolder.mRlSpecialActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mOnItemClickListener != null) {
                    mOnItemClickListener.onItemClick(view, bean.getGoods_id());
                }
            }
        });


    }
  /*  @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.tv_top_list_origin:
                String articleId    = (String) view.getTag();
                if (mOnItemClickListener != null) {
                    mOnItemClickListener.onItemClick(view, articleId);
                }

                break;
        }
    }*/


    private static class ViewHolder extends RecyclerView.ViewHolder {


        private ImageView mIvSpecialActivityImg;
        private TextView mTvSpecialActivityTime;
        private TextView mTvSpecialActivityTitle;
        private TextView mTvSpecialActivityDesc;
        private RelativeLayout mRlSpecialActivity;


        private ViewHolder(View itemView) {
            super(itemView);
            this.mIvSpecialActivityImg = (ImageView) itemView.findViewById(R.id.iv_special_activity_img);
            this.mTvSpecialActivityTime = (TextView) itemView.findViewById(R.id.tv_special_activity_time);
            this.mTvSpecialActivityTitle = (TextView) itemView.findViewById(R.id.tv_special_activity_title);
            this.mTvSpecialActivityDesc = (TextView) itemView.findViewById(R.id.tv_special_activity_desc);
            this.mRlSpecialActivity = (RelativeLayout) itemView.findViewById(R.id.rl_special_activity);
        }

    }
}
