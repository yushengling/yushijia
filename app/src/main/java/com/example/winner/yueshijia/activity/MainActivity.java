package com.example.winner.yueshijia.activity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TabHost;

import com.example.winner.yueshijia.R;
import com.example.winner.yueshijia.base.BaseActivity;
import com.example.winner.yueshijia.fragment.CartFragment;
import com.example.winner.yueshijia.fragment.ClubFragment;
import com.example.winner.yueshijia.fragment.HomeFragment;
import com.example.winner.yueshijia.fragment.MeFragment;
import com.example.winner.yueshijia.fragment.ShopFragment;
import com.example.winner.yueshijia.fragment.dialog.BackDialogFragment;
import com.example.winner.yueshijia.utils.LogUtils;
import com.example.winner.yueshijia.views.FragmentTabHost;
import com.example.winner.yueshijia.views.LinTab;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;

public class MainActivity extends BaseActivity implements TabHost.OnTabChangeListener{

    private FragmentTabHost fragment_tab_host;
    private LinTab mBottomTab;

    @Override
    protected void initControl() {

    }

    @Override
    protected void initView() {
        EventBus.getDefault().register(this);
        setContentView(R.layout.activity_main);
        fragment_tab_host = (FragmentTabHost) findViewById(R.id.fragment_tab_host);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void initEventBus(String tag) {
        findViewById(R.id.loading_fr).setVisibility(View.INVISIBLE);
    }

    @Override
    protected void initData() {
        initFragmentTabHost();
    }

    /**
     * 初始化FragmentTabHost
     */
    private void initFragmentTabHost() {
        ArrayList<Integer> tab_pic = new ArrayList<>();
        tab_pic.add(R.drawable.tabbar_select_home);
        tab_pic.add(R.drawable.tabbar_select_club);
        tab_pic.add(R.drawable.tabbar_select_shop);
        tab_pic.add(R.drawable.tabbar_select_cart);
        tab_pic.add(R.drawable.tabbar_select_me);

        ArrayList<String> tab_text = new ArrayList<>();
        tab_text.add("首页");
        tab_text.add("专题");
        tab_text.add("店铺");
        tab_text.add("购物篮");
        tab_text.add("我的");

        final ArrayList<Class> fragments = new ArrayList<>();
        fragments.add(HomeFragment.class);
        fragments.add(ClubFragment.class);
        fragments.add(ShopFragment.class);
        fragments.add(CartFragment.class);
        fragments.add(MeFragment.class);
        fragment_tab_host.setup(this, getSupportFragmentManager(), R.id.content);
        for (int i = 0; i < tab_pic.size(); i++) {
            TabHost.TabSpec tabSpec = fragment_tab_host.newTabSpec("" + i);
            mBottomTab = new LinTab(this);
            mBottomTab.setOrientation(LinearLayout.VERTICAL);
            mBottomTab.setImageResource(tab_pic.get(i));
            mBottomTab.setText(tab_text.get(i));
            tabSpec.setIndicator(mBottomTab);
            fragment_tab_host.addTab(tabSpec, fragments.get(i), null);
        }
    }

    @Override
    protected void initEvent() {
        fragment_tab_host.setOnTabChangedListener(this);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
    }

    @Override
    public void onTabChanged(String s) {
        LogUtils.v(s);
        LinTab linTab = (LinTab) fragment_tab_host.getCurrentTabView();
        LinearLayout lin = (LinearLayout) linTab.getChildAt(0);
        ImageView iv = (ImageView) lin.getChildAt(0);
        ObjectAnimator oaY = ObjectAnimator.ofFloat(iv, "scaleY", 1.5f, 0.8f, 1.7f, 0.6f, 1.5f, 1f);
        ObjectAnimator oaX = ObjectAnimator.ofFloat(iv, "scaleX", 1.5f, 0.8f, 1.7f, 0.6f, 1.5f, 1f);
        AnimatorSet set = new AnimatorSet();
        set.playTogether(oaX, oaY);
        set.setDuration(300);
        set.start();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            BackDialogFragment fragment = new BackDialogFragment();
            fragment.show(getSupportFragmentManager(),"back");
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }


}
