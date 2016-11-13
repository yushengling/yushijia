package com.example.winner.yueshijia.activity;

import android.view.View;
import android.view.ViewGroup;

import com.example.winner.yueshijia.R;
import com.example.winner.yueshijia.base.BaseActivity;
import com.example.winner.yueshijia.utils.StatusBarUtils;

/**
 * @author seventoto
 * @time 2016/11/11  21:24
 * @desc ${TODD}
 */
public class SettingActivity extends BaseActivity {
    @Override
    protected void initView() {
        setContentView(R.layout.activity_setting);
        View statusBar = findViewById(R.id.status_bar);
        ViewGroup.LayoutParams params = statusBar.getLayoutParams();
        params.height = StatusBarUtils.getStatusHeight(this);
    }
}
