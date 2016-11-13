package com.example.winner.yueshijia.adpter.shopAdapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.winner.yueshijia.beans.shopBeans.ShopBean;
import com.example.winner.yueshijia.utils.LogUtils;

import java.util.ArrayList;

/**
 * Created by winner on 2016/11/10.
 */

public class BannerAdapter extends PagerAdapter {
    private ArrayList<ShopBean.DatasBean.BannerBean> datas;
    private ArrayList<ImageView> views;
    private Context mContext;
    private int mNewPosition;

    public BannerAdapter(Context context) {
        mContext = context;
    }

    public void setDatas(ArrayList<ShopBean.DatasBean.BannerBean> datas) {
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


    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
       int position2 = position % datas.size();

        ImageView imageView = new ImageView(container.getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        Glide.with(mContext).load(datas.get(position2).getAdvertImg()).into(imageView);
        container.addView(imageView);
        if (!views.contains(imageView)) {
            views.add(imageView);
            LogUtils.v("" + views.size());
        }
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i = position % datas.size();
                Toast.makeText(mContext, "" + datas.get(i).getAdvertTitle(), Toast.LENGTH_SHORT).show();
            }
        });
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
