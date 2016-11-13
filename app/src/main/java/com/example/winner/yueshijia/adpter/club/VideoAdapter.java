package com.example.winner.yueshijia.adpter.club;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.winner.yueshijia.R;
import com.example.winner.yueshijia.base.MyBaseAdapter;
import com.example.winner.yueshijia.beans.clubBean.VideoBean;

import java.util.ArrayList;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;

/**
 * Created by winner on 2016/11/8.
 */

public class VideoAdapter extends MyBaseAdapter<VideoBean.DatasBean.ArticleListBean> {


    private VideoBean.DatasBean.ArticleListBean mArticleListBean;

    public VideoAdapter() {
    }

    public VideoAdapter(ArrayList list) {
        super(list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        final ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_club_video, viewGroup, false);
            holder = new ViewHolder(convertView);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        mArticleListBean = mList.get(position);

//        holder.view_custom_view.setImageUrl(mArticleListBean.getArticle_image());
//        holder.view_custom_view.setTime(mArticleListBean.getTag().get(0), mArticleListBean.getVideo_length());
//        holder.view_custom_view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                holder.view_custom_view.start(mArticleListBean.getArticle_video());
//            }
//        });
//        holder.view_custom_view.
        String article_video = mArticleListBean.getArticle_video();
        holder.view_custom_view.setUp(article_video
                , JCVideoPlayerStandard.SCREEN_LAYOUT_LIST, "");
        Glide.with(viewGroup.getContext()).load(mArticleListBean.getArticle_image()).placeholder(R.drawable.bg_morentu).into(holder.view_custom_view.thumbImageView);

        holder.top_tv.setText(mArticleListBean.getArticle_title());
        holder.bottom_tv.setText(mArticleListBean.getArticle_abstract());

        return convertView;
    }


    public static class ViewHolder {
        public View rootView;
        public JCVideoPlayerStandard view_custom_view;
        public TextView top_tv;
        public TextView bottom_tv;

        public ViewHolder(View rootView) {
            this.rootView = rootView;
            this.view_custom_view = (JCVideoPlayerStandard) rootView.findViewById(R.id.video_view);
            this.top_tv = (TextView) rootView.findViewById(R.id.top_tv);
            this.bottom_tv = (TextView) rootView.findViewById(R.id.bottom_tv);
            rootView.setTag(this);
        }

    }
}
