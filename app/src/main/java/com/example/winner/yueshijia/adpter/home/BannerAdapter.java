package com.example.winner.yueshijia.adpter.home;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.winner.yueshijia.activity.GoodsDetailsActivity;
import com.example.winner.yueshijia.activity.SpecialGoodsActivity;
import com.example.winner.yueshijia.beans.homeBean.BannerBean;
import com.example.winner.yueshijia.beans.homeBean.HomeBean;
import com.google.gson.Gson;

import java.util.ArrayList;

/**
 * Created by winner on 2016/11/8.
 */

public class BannerAdapter extends PagerAdapter {
    private ArrayList<HomeBean.DatasBean.BannerBean> datas;
    private ArrayList<ImageView> views;
    private Context mContext;

    public BannerAdapter(Context context) {
        mContext = context;
    }

    public void setDatas(ArrayList<HomeBean.DatasBean.BannerBean> datas) {
        this.datas = datas;
        views = new ArrayList<>();
        for (int i = 0; i < datas.size(); i++) {
            ImageView iv = new ImageView(mContext);
            iv.setScaleType(ImageView.ScaleType.FIT_XY);
            views.add(iv);
        }

        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return datas != null ? Integer.MAX_VALUE : 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    int i = 0;

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        int mNewPosition = position % datas.size();

//        ImageView imageView = views.get(mNewPosition);
        ImageView imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        Glide.with(mContext).load(datas.get(mNewPosition).getAdvertImg()).into(imageView);

        imageView.setFocusable(true);
        imageView.setFocusableInTouchMode(true);
        imageView.setClickable(true);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i = position % datas.size();
                String advertUrl = datas.get(i).getAdvertUrl();
                int firstIndexOf = advertUrl.lastIndexOf("{");
                int lastIndexOf = advertUrl.lastIndexOf("}");
                String substring = advertUrl.substring(firstIndexOf, lastIndexOf + 1);
                Gson gson = new Gson();
                BannerBean bannerBean = gson.fromJson(substring, BannerBean.class);
                int linkType = bannerBean.getLinkType();
                if (linkType == 1) {
                    Intent intent = new Intent(mContext, GoodsDetailsActivity.class);
                    intent.putExtra(GoodsDetailsActivity.INTENT_KEY, bannerBean.getEntityId());
                    mContext.startActivity(intent);
                } else if (linkType == 9) {
                    Intent intent = new Intent(mContext, SpecialGoodsActivity.class);
                    intent.putExtra(SpecialGoodsActivity.INTENT_KEY, bannerBean.getEntityId());
                    mContext.startActivity(intent);
                }
            }
        });
        container.addView(imageView);
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
