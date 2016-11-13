package com.example.winner.yueshijia.adpter.club;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.winner.yueshijia.R;
import com.example.winner.yueshijia.base.BaseFragment;
import com.example.winner.yueshijia.fragment.club.ActivityFragment;
import com.example.winner.yueshijia.fragment.club.CultureFragment;
import com.example.winner.yueshijia.fragment.club.TopFragment;
import com.example.winner.yueshijia.fragment.club.KnowledgeFragment;
import com.example.winner.yueshijia.fragment.club.MapFragment;
import com.example.winner.yueshijia.fragment.club.VideoFragment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by winner on 2016/11/6.
 */

public class ClubListAdapter extends FragmentPagerAdapter {


    private final List<String> mTitles;
    private final ArrayList<BaseFragment> mFragments;

    public ClubListAdapter(Context context, FragmentManager fm) {
        super(fm);
        String[] listing_title = context.getResources().getStringArray(R.array.club_title);
        mTitles = Arrays.asList(listing_title);

        mFragments = new ArrayList<>();
        mFragments.add(new VideoFragment());
        mFragments.add(new TopFragment());
        mFragments.add(new KnowledgeFragment());
        mFragments.add(new CultureFragment());
        mFragments.add(new MapFragment());
        mFragments.add(new ActivityFragment());
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
        return mTitles.get(position);
    }
}
