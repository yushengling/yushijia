package com.example.winner.yueshijia.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.winner.yueshijia.R;
import com.example.winner.yueshijia.base.BaseActivity;
import com.example.winner.yueshijia.beans.splash.SplashBean;
import com.example.winner.yueshijia.conf.IDiyMessage;
import com.example.winner.yueshijia.control.SplashControl;
import com.example.winner.yueshijia.utils.ActivityUtils;

public class SplashActivity extends BaseActivity<SplashBean> implements View.OnClickListener {

    private ImageView mIvSplash;
    private ImageView mIvSplashAdvert;
    private String mAdvertImg;
    private SplashControl mControl;
    private ObjectAnimator mFadeIn;
    private ObjectAnimator mFadeout;


    @Override
    protected void initView() {
        setContentView(R.layout.activity_splash);
        mIvSplash = (ImageView) findViewById(R.id.iv_splash);
        mIvSplashAdvert = (ImageView) findViewById(R.id.iv_splash_advert);
        findViewById(R.id.bt_jump).setOnClickListener(this);
        initControl();

    }

    protected void initControl() {
        mControl = new SplashControl(SplashActivity.this);
        mControl.setHandleMessageListener(this);
        mControl.doGet(IDiyMessage.SPLASH_ACTION, 0, true);
    }
    @Override
    public void handlerMessage(int action, SplashBean bean, boolean isFirst) {

        if (bean.getCode() == 200) {
            SplashBean.DatasBean datas = bean.getDatas();
            mAdvertImg=  datas.getAdvertImg();

        }
    }

    @Override
    protected void initAnimation() {
        ObjectAnimator fadeIn = ObjectAnimator.ofFloat(mIvSplash, "alpha", 1f, 0f);
        fadeIn.setDuration(2000).start();
        fadeIn.addListener(new AnimatorListenerAdapter() {


            @Override
            public void onAnimationEnd(Animator animation) {
//                mIvSplash.setVisibility(View.GONE);
//                mIvSplashAdvert.setVisibility(View.VISIBLE);
//                Glide.with(SplashActivity.this).load(mAdvertImg).into(mIvSplashAdvert);
//                MyApplication.getHandler().postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        ActivityUtils.start(SplashActivity.this, MainActivity.class, true);
//                    }
//                }, 2000);
                mIvSplash.setVisibility(View.GONE);
                mIvSplashAdvert.setVisibility(View.VISIBLE);
                Glide.with(SplashActivity.this).load(mAdvertImg).into(mIvSplashAdvert);
                ObjectAnimator fadeout = ObjectAnimator.ofFloat(mIvSplash, "alpha", 1f, 0f);
                fadeout.setDuration(100).start();
                fadeout.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        ActivityUtils.start(SplashActivity.this, MainActivity.class, true);
                    }
                });

                /*MyApplication.getHandler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ActivityUtils.start(SplashActivity.this, MainActivity.class, true);
                    }
                }, 2000);*/

            }
        });
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_jump:
                ActivityUtils.start(this, MainActivity.class, true);
                break;
        }
    }
}

