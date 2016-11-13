package com.example.winner.yueshijia.adpter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.winner.yueshijia.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by winner on 2016/11/11.
 */
public class GoodsDetailPagerAdapter extends PagerAdapter {
    private List<String> urls;
    private ArrayList<ImageView> images;
    private Context mContext;

    public GoodsDetailPagerAdapter(Context context) {
        mContext = context;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
        images = new ArrayList<>();
        for (int i = 0; i < urls.size(); i++) {
            ImageView imageView = new ImageView(mContext);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            images.add(imageView);
        }
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return urls != null ? urls.size() : 0;
//        return urls != null ? Integer.MAX_VALUE : 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
//        position = position % urls.size();
        ImageView imageView = images.get(position);

        Glide.with(mContext).load(urls.get(position)).placeholder(R.drawable.bg_morentu).into(imageView);
        container.addView(imageView);
        return imageView;
    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
//        ImageView imageView = images.get(position);
//        container.removeView(imageView);
        container.removeView((View) object);
    }
}
