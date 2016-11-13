package com.example.winner.yueshijia.adpter.home;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by winner on 2016/11/8.
 */

public class HomeViewPagerAdapter extends PagerAdapter {
    private ArrayList<String> urlS;
    private Context mContext;
    private final ArrayList<ImageView> mImageViews;

    public HomeViewPagerAdapter(Context context, ArrayList<String> urlS) {
        this.urlS = urlS;
        this.mContext = context;
        mImageViews = new ArrayList<>();
        for (int i = 0; i < urlS.size(); i++) {
            ImageView iv = new ImageView(mContext);
            mImageViews.add(iv);
        }
    }

    @Override
    public int getCount() {
        return urlS != null ? urlS.size() : 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = mImageViews.get(position);
        Glide.with(container.getContext()).load(urlS.get(position)).into(imageView);
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
