package com.example.winner.yueshijia.adpter.orderdetail;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.winner.yueshijia.R;
import com.example.winner.yueshijia.fragment.orderdetail.AllOrderFragment;
import com.example.winner.yueshijia.fragment.orderdetail.WaitCommentFragment;
import com.example.winner.yueshijia.fragment.orderdetail.WaitPayFragment;
import com.example.winner.yueshijia.fragment.orderdetail.WaitReceiveFragment;
import com.example.winner.yueshijia.fragment.orderdetail.WaitTransmitFragment;

import java.util.ArrayList;

/**
 * @author seventoto
 * @time 2016/11/12  14:39
 * @desc ${TODD}
 */
public class MyOrderAdapter extends FragmentStatePagerAdapter {
    private Context mContext;
    private String[] mTitles;
    private ArrayList<Fragment> mFragments;

    public MyOrderAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.mContext = context;
        this.mTitles = mContext.getResources().getStringArray(R.array.order_detail_title);
        mFragments = new ArrayList<>();
        mFragments.add(new AllOrderFragment());
        mFragments.add(new WaitPayFragment());
        mFragments.add(new WaitTransmitFragment());
        mFragments.add(new WaitReceiveFragment());
        mFragments.add(new WaitCommentFragment());

    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        for (int i = 0; i < mTitles.length; i++) {
            if (i == position) {
                return mTitles[position];
            }
        }
        return getPageTitle(position);
    }
}
