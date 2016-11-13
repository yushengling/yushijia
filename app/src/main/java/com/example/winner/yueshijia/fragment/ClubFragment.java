package com.example.winner.yueshijia.fragment;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.winner.yueshijia.R;
import com.example.winner.yueshijia.adpter.club.ClubListAdapter;
import com.example.winner.yueshijia.base.BaseFragment;
import com.ogaclejapan.smarttablayout.SmartTabLayout;

/**
 * Created by winner on 2016/11/6.
 */

public class ClubFragment extends BaseFragment {
    private SmartTabLayout mTab_layout;
    private ViewPager mVp;
    private View mTopView;

    @Override
    protected View initFragmentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_club, container, false);
        mTab_layout = (SmartTabLayout) view.findViewById(R.id.tab_layout);
        mVp = (ViewPager) view.findViewById(R.id.vp);
        mTopView = view.findViewById(R.id.view);
        return view;
    }

    @Override
    protected void initData() {
        mTopView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, getStatusHeight(getActivity())));
        ClubListAdapter adapter = new ClubListAdapter(getActivity(), getFragmentManager());
        mVp.setAdapter(adapter);
        mTab_layout.setViewPager(mVp);
        int childCount = mTab_layout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            TextView tv = (TextView) mTab_layout.getTabAt(i);
            tv.setTypeface(Typeface.DEFAULT);
        }
    }


    /**
     * 获取状态高度
     */
    public int getStatusHeight(Context context) {

        int statusHeight = -1;
        try {
            Class clazz = Class.forName("com.android.internal.R$dimen");
            Object object = clazz.newInstance();
            int height = Integer.parseInt(clazz.getField("status_bar_height")
                    .get(object).toString());
            statusHeight = context.getResources().getDimensionPixelSize(height);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return statusHeight;
    }
}
