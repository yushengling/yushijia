package com.example.winner.yueshijia.activity;

import android.annotation.SuppressLint;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.winner.yueshijia.R;
import com.example.winner.yueshijia.activity.GoodsDetailsActivity;
import com.example.winner.yueshijia.base.BaseActivity;
import com.example.winner.yueshijia.conf.NetworkConst;


/**
 * @author VKEY
 * @since 2016/11/12 19:21
 */
public class ProductDetailActivity extends BaseActivity<String> implements View.OnClickListener {

    private WebView mWeb_detail;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void initView() {
        setContentView(R.layout.product_details);
        String goods_id = getIntent().getStringExtra(GoodsDetailsActivity.INTENT_KEY);
        mWeb_detail = (WebView) findViewById(R.id.web_detail);
        String url = NetworkConst.GOODS_DETAIL_URL +goods_id;
        mWeb_detail.loadUrl(url);
        mWeb_detail.getSettings().setJavaScriptEnabled(true);
        mWeb_detail.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });

        findViewById(R.id.ib_back).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ib_back:
                finish();
                break;
        }
    }
}
