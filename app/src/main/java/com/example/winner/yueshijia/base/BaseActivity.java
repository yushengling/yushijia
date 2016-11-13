package com.example.winner.yueshijia.base;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.example.winner.yueshijia.listeners.IHandleMessageListener;

/**
 * Created by winner on 2016/11/5.
 */

public abstract class BaseActivity<T> extends FragmentActivity implements IHandleMessageListener<T> {
    protected BaseControl mControl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initControl();
        initView();
        initData();
        initAnimation();
        initEvent();
    }

    protected  void initControl(){}



    @Override
    public void handlerMessage(int action, T t, boolean isFirst) {
        //default implement emmpty
    }

    /**
     * 初始化动画
     */
    protected  void initAnimation(){
        //default implement emmpty
    }


    /**
     * 初始化视图
     */
    protected abstract void initView();

    /**
     * 初始化数据
     */
    protected void initData() {
    }

    /**
     * 初始化事件
     */
    protected void initEvent() {
    }

}
