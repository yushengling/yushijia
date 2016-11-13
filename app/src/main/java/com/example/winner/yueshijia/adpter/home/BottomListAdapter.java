package com.example.winner.yueshijia.adpter.home;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.winner.yueshijia.R;
import com.example.winner.yueshijia.activity.GoodsDetailsActivity;
import com.example.winner.yueshijia.activity.WebViewActivity;
import com.example.winner.yueshijia.base.MyBaseAdapter;
import com.example.winner.yueshijia.beans.homeBean.HomeBean;
import com.example.winner.yueshijia.conf.NetworkConst;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;
//import com.example.winner.yueshijia.views.CustomVideo;

/**
 * Created by winner on 2016/11/9.
 */

public class BottomListAdapter extends MyBaseAdapter<HomeBean.DatasBean.DataTypeBean> {
    //    relation_object_type 6  横图
    //    relation_object_type 2 正常  有价钱   1 没价钱
    //    relation_object_type 5 视频
    private static final int NORMAL_ITEM = 0;
    private static final int VIDEO_ITEM = 1;
    private static final int HOR_PIC_ITEM = 2;

    @Override
    public View getView(int position, View convertView, final ViewGroup viewGroup) {
        final HomeBean.DatasBean.DataTypeBean dataTypeBean = mList.get(position);
        if (getItemViewType(position) == NORMAL_ITEM) {
            NormalViewHolder normalViewHolder;
            if (convertView == null) {
                convertView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_home_nor, viewGroup, false);
                normalViewHolder = new NormalViewHolder(convertView);
            } else {
                normalViewHolder = (NormalViewHolder) convertView.getTag();
            }
            final String relation_object_type = dataTypeBean.getRelation_object_type();

            normalViewHolder.tv_jingle.setText(dataTypeBean.getRelation_object_jingle());
            normalViewHolder.tv_title.setText(dataTypeBean.getRelation_object_title());
            Glide.with(viewGroup.getContext()).load(dataTypeBean.getRelation_object_image()).placeholder(R.drawable.bg_morentu).into(normalViewHolder.iv_nor);
            normalViewHolder.iv_nor.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if ("2".equals(relation_object_type)) {
                        Intent intent = new Intent(viewGroup.getContext(), GoodsDetailsActivity.class);
                        intent.putExtra(GoodsDetailsActivity.INTENT_KEY, dataTypeBean.getRelation_object_id());
                        viewGroup.getContext().startActivity(intent);
                    } else if ("1".equals(relation_object_type)) {
                        Intent intent = new Intent(viewGroup.getContext(), WebViewActivity.class);
                        String urlPath = NetworkConst.BASE_WEB_VIEW_URL.replace("%%%ad", dataTypeBean.getRelation_object_id()).
                                replace("%%%td", dataTypeBean.getRelation_state());
                        intent.putExtra(WebViewActivity.INTENT_KEY, urlPath);
                        viewGroup.getContext().startActivity(intent);
                    }
                }
            });
        } else if (getItemViewType(position) == VIDEO_ITEM) {
            VideoViewHolder videoViewHolder;
            if (convertView == null) {
                convertView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_home_video, viewGroup, false);
                videoViewHolder = new VideoViewHolder(convertView);
            } else {
                videoViewHolder = (VideoViewHolder) convertView.getTag();
            }
            videoViewHolder.view_video.setUp(dataTypeBean.getArticle_video()
                    , JCVideoPlayerStandard.SCREEN_LAYOUT_LIST, "");
            Glide.with(viewGroup.getContext()).load(dataTypeBean.getRelation_object_image()).placeholder(R.drawable.bg_morentu).into(videoViewHolder.view_video.thumbImageView);

            videoViewHolder.tv_title.setText(dataTypeBean.getRelation_object_title());
            videoViewHolder.tv_jingle.setText(dataTypeBean.getRelation_object_jingle());

        } else {//if (getItemViewType(position) == HOR_PIC_ITEM)
            if (convertView == null) {
                convertView=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_iv,viewGroup,false);
            }
            Glide.with(viewGroup.getContext()).load(dataTypeBean.getRelation_object_image()).placeholder(R.drawable.bg_morentu).into(((ImageView) convertView));
            convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
//                    Intent intent = new Intent(viewGroup.getContext(), GoodsDetailsActivity.class);
//                    String advertUrl = dataTypeBean.get
//                    int firstIndexOf = advertUrl.lastIndexOf("{");
//                    int lastIndexOf = advertUrl.lastIndexOf("}");
//                    String substring = advertUrl.substring(firstIndexOf, lastIndexOf + 1);
//                    Gson gson = new Gson();
//                    intent.putExtra(GoodsDetailsActivity.INTENT_KEY, dataTypeBean.getRelation_object_id());
//                    viewGroup.getContext().startActivity(intent);
                }
            });
        }
        return convertView;
    }

    @Override
    public int getViewTypeCount() {
        return 3;
    }

    @Override
    public int getItemViewType(int position) {
        HomeBean.DatasBean.DataTypeBean dataTypeBean = mList.get(position);
        String relation_object_type = dataTypeBean.getRelation_object_type();
        if ("2".equals(relation_object_type) || "1".equals(relation_object_type)) {
            return NORMAL_ITEM;
        } else if ("5".equals(relation_object_type)) {
            return VIDEO_ITEM;
        } else if ("6".equals(relation_object_type)) {
            return HOR_PIC_ITEM;
        }
        return 0;
    }

    public static class NormalViewHolder {
        public View rootView;
        public ImageView iv_nor;
        public TextView tv_title;
        public TextView tv_jingle;

        public NormalViewHolder(View rootView) {
            this.rootView = rootView;
            this.iv_nor = (ImageView) rootView.findViewById(R.id.iv_nor);
            this.tv_title = (TextView) rootView.findViewById(R.id.tv_title);
            this.tv_jingle = (TextView) rootView.findViewById(R.id.tv_jingle);
            rootView.setTag(this);
        }
    }

    public static class VideoViewHolder {
        public View rootView;
        public JCVideoPlayerStandard view_video;
        public TextView tv_title;
        public TextView tv_jingle;

        public VideoViewHolder(View rootView) {
            this.rootView = rootView;
            this.view_video = (JCVideoPlayerStandard) rootView.findViewById(R.id.view_video);
            this.tv_title = (TextView) rootView.findViewById(R.id.tv_title);
            this.tv_jingle = (TextView) rootView.findViewById(R.id.tv_jingle);
            rootView.setTag(this);
        }

    }
}
