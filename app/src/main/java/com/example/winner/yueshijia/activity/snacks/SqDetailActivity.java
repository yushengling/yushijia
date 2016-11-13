package com.example.winner.yueshijia.activity.snacks;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.winner.yueshijia.R;
import com.example.winner.yueshijia.base.BaseFragment;
import com.example.winner.yueshijia.fragment.snack.AllPagerFragment;
import com.example.winner.yueshijia.fragment.snack.PricePagerFragment;
import com.example.winner.yueshijia.fragment.snack.SalePagerFragment;
import com.example.winner.yueshijia.fragment.snack.TimePagerFragment;

import java.util.ArrayList;

/**
 * @author 梁光文
 * @time 2016/11/8  13:47
 * @desc ${TODD}
 */
public class SqDetailActivity extends FragmentActivity {
    private TextView mAll_tv;
    private TextView mSales_tv;
    private TextView mPrice_tv;
    private TextView mTime_tv;
    private ImageView mChange_iv;
    private ViewPager mAll_snacks__pager;
    private AllPagerAdapter mAdapter;
    private TextView snack_good_name_tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_snacks_detail);
        initView(); //初始化界面
        initData();
    }

    private void initData() {
       snack_good_name_tv.setText("食器");
    }

    protected void initView() {
        mAll_tv = (TextView) findViewById(R.id.all_tv);
        mAll_tv.setOnClickListener(new textListenser(0));
        mSales_tv = (TextView) findViewById(R.id.sales_tv);
        mSales_tv.setOnClickListener(new textListenser(1));
        mPrice_tv = (TextView) findViewById(R.id.price_tv);
        mPrice_tv.setOnClickListener(new textListenser(2));
        mTime_tv = (TextView) findViewById(R.id.time_tv);
        mTime_tv.setOnClickListener(new textListenser(3));
        mChange_iv = (ImageView) findViewById(R.id.change_iv);
        mChange_iv.setOnClickListener(new textListenser(4));
        snack_good_name_tv = (TextView) findViewById(R.id.snack_good_name_tv);

        mAll_snacks__pager = (ViewPager) findViewById(R.id.all_snacks__pager);

        mAdapter = new AllPagerAdapter(getSupportFragmentManager());
        //设置Adapter
        mAll_snacks__pager.setAdapter(mAdapter);
        mAll_snacks__pager.setCurrentItem(0);

    }

    private class textListenser implements View.OnClickListener {
        private int index = 0;
        public textListenser(int i) {
            index=i;
        }
        @Override
        public void onClick(View v) {
            mAll_snacks__pager.setCurrentItem(index);
            ColorStateList cls = new ColorStateList(new int[][]{{android.R.attr.state_pressed},{0}}, new int[]{Color.YELLOW,Color.GRAY});
            switch (v.getId()){
                case R.id.all_tv:
                   // mAll_tv.setTextColor(getResources().getColor(R.color.text_color));
                    mAll_tv.setTextColor(cls);
                    break;
                case R.id.sales_tv:
                  //  mSales_tv.setTextColor(getResources().getColor(R.color.text_color));
                    mSales_tv.setTextColor(cls);
                    break;
                case R.id.price_tv:
                   // mPrice_tv.setTextColor(getResources().getColor(R.color.text_color));
                    mPrice_tv.setTextColor(cls);
                    break;
                case R.id.time_tv:
                  //  mTime_tv.setTextColor(getResources().getColor(R.color.text_color));
                    mTime_tv.setTextColor(cls);
                    break;
            }
   /*         mAll_tv.setVisibility(View.INVISIBLE);
            mSales_tv.setVisibility(View.INVISIBLE);
            mPrice_tv.setVisibility(View.INVISIBLE);
            mTime_tv.setVisibility(View.INVISIBLE);
            switch (v.getId()){
                case R.id.all_tv:
                    mAll_tv.setTextColor(Color.RED);
                    mAll_tv.setVisibility(View.VISIBLE);
                    break;
                case R.id.sales_tv:
                    mSales_tv.setTextColor(Color.RED);
                    mSales_tv.setVisibility(View.VISIBLE);
                    // mSales_tv.setSelected(true);
                    break;
                case R.id.price_tv:
                    mPrice_tv.setTextColor(Color.RED);
                    mPrice_tv.setVisibility(View.VISIBLE);
                  //  mPrice_tv.setSelected(true);
                    break;
                case R.id.time_tv:
                    mTime_tv.setTextColor(Color.RED);
                    mTime_tv.setVisibility(View.VISIBLE);
                  //  mTime_tv.setSelected(true);
                    break;
            }*/
        }
    }

    private class AllPagerAdapter extends FragmentPagerAdapter {
        private ArrayList<BaseFragment> mFragments;
       public AllPagerAdapter(FragmentManager fm) {
            super(fm);
            mFragments = new ArrayList<BaseFragment>();
            mFragments.add(new AllPagerFragment());
            mFragments.add(new SalePagerFragment());
            mFragments.add(new PricePagerFragment());
            mFragments.add(new TimePagerFragment());
        }

        @Override
        public Fragment getItem(int position) {
            return mFragments.get(position);
        }

        @Override
        public int getCount() {
            return mFragments.size();
        }
    }

}
