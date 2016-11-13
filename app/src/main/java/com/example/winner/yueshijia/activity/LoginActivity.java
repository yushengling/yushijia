package com.example.winner.yueshijia.activity;

import android.view.View;

import com.example.winner.yueshijia.R;
import com.example.winner.yueshijia.base.BaseActivity;

/**
 * @author VKEY
 * @since 2016/11/13 15:24
 */

public class LoginActivity extends BaseActivity<String> {
    @Override
    protected void initView() {
        setContentView(R.layout.activity_login);
        findViewById(R.id.iv_title_left).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
