package com.example.winner.yueshijia.activity;

import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.winner.yueshijia.R;
import com.example.winner.yueshijia.base.BaseActivity;
import com.example.winner.yueshijia.beans.clubBean.ClubDetailBean;
import com.example.winner.yueshijia.conf.IntentConst;
import com.example.winner.yueshijia.control.ClubDetailControl;

import static com.example.winner.yueshijia.conf.IDiyMessage.MAP_DETAIL_ACTION;

public class MapActivity extends BaseActivity<ClubDetailBean> implements View.OnClickListener {


    private ImageButton mIbBack;
    private ImageButton mIbShare;
    private RelativeLayout mRlGdTitle;
    private WebView mWebView;


    @Override
    protected void initView() {
        setContentView(R.layout.activity_top);
        mIbBack = (ImageButton) findViewById(R.id.ib_back);
        mIbBack.setOnClickListener(this);
        mIbShare = (ImageButton) findViewById(R.id.ib_share);
        mIbShare.setOnClickListener(this);
        mRlGdTitle = (RelativeLayout) findViewById(R.id.rl_gd_title);
        mRlGdTitle.setOnClickListener(this);
        mWebView = (WebView) findViewById(R.id.web_view);
        mWebView.setOnClickListener(this);
    }

    @Override
    protected void initControl() {
        mControl = new ClubDetailControl(this);
        mControl.setHandleMessageListener(this);
    }

    @Override
    protected void initData() {
        String topid = getIntent().getStringExtra(IntentConst.MAP_WEB);
        if (topid == null) {
            finish();
            return;
        }
        mControl.doGet(MAP_DETAIL_ACTION, 0, true, topid);
        Toast.makeText(getApplicationContext(), "" + topid, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void handlerMessage(int action, ClubDetailBean bean, boolean isFirst) {
        switch (action) {
            case MAP_DETAIL_ACTION:
                if (bean.getCode() == 200) {

                    ClubDetailBean.DatasBean datasBean = bean.getDatas();
                    String content = datasBean.getArticle_content();

                    mWebView.loadUrl(content);
                    mWebView.setWebViewClient(new WebViewClient() {
                        @Override
                        public boolean shouldOverrideUrlLoading(WebView view, String url) {
                            view.loadUrl(url);
                            return true;
                        }
                    });
                    mWebView.getSettings().setJavaScriptEnabled(true);
                }


                break;
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ib_back:
                finish();
                break;
            case R.id.ib_share:
                Toast.makeText(getApplicationContext(), "分享模块稍后更新", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
