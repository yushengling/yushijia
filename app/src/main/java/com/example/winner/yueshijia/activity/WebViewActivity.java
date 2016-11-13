package com.example.winner.yueshijia.activity;

import android.content.Intent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.winner.yueshijia.R;
import com.example.winner.yueshijia.base.BaseActivity;

/**
 * Created by winner on 2016/11/12.
 */

public class WebViewActivity extends BaseActivity {
    public static final String INTENT_KEY = "url_path";


    private WebView web_view;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_web_view);
        web_view = (WebView) findViewById(R.id.web_view);

    }

    @Override
    protected void initData() {
        Intent intent = getIntent();
        final String urlPath = intent.getStringExtra(INTENT_KEY);

        web_view.getSettings().setJavaScriptEnabled(true);
        web_view.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(urlPath);
                return true;
            }
        });
    }
}
