package com.example.winner.yueshijia.activity;

import android.graphics.Typeface;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.winner.yueshijia.R;
import com.example.winner.yueshijia.adpter.orderdetail.MyOrderAdapter;
import com.example.winner.yueshijia.base.BaseActivity;
import com.example.winner.yueshijia.utils.StatusBarUtils;
import com.ogaclejapan.smarttablayout.SmartTabLayout;

/**
 * @author seventoto
 * @time 2016/11/12  11:43
 * @desc ${TODD}
 */
public class MyOrderActivity extends BaseActivity {

    private SmartTabLayout mMyOrderTab;
    private ViewPager mMyOrderVp;
    private MyOrderAdapter mMyOrderAdapter;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_my_order);
        View statusBar = findViewById(R.id.status_bar);
        ViewGroup.LayoutParams params = statusBar.getLayoutParams();
        params.height= StatusBarUtils.getStatusHeight(this);

        mMyOrderTab = (SmartTabLayout) findViewById(
                R.id.order_detail_tab_layout);
        mMyOrderVp = (ViewPager) findViewById(
                R.id.order_detail_vp);

    }

    @Override
    protected void initEvent() {

    }

    @Override
    protected void initData() {
        int currentPosition = getIntent().getIntExtra("position", 0);
        Log.i("tag", "initData: "+currentPosition);
        mMyOrderAdapter = new MyOrderAdapter(getSupportFragmentManager(), this);
        mMyOrderVp.setAdapter(mMyOrderAdapter);
        mMyOrderTab.setViewPager(mMyOrderVp);
        int childCount = mMyOrderTab.getChildCount();
        for(int i = 0; i < childCount; i++) {
            TextView childAt = (TextView) mMyOrderTab.getTabAt(i);
            childAt.setTypeface(Typeface.DEFAULT);
        }
        mMyOrderVp.setCurrentItem(currentPosition);
    }

}
