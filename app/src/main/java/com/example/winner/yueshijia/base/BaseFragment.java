package com.example.winner.yueshijia.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.winner.yueshijia.listeners.IHandleMessageListener;

/**
 * Created by winner on 2016/11/5.
 */

public abstract class BaseFragment<T> extends Fragment implements IHandleMessageListener<T> {
    private int index = 1;
    protected BaseControl mControl;
    @Override
    public void handlerMessage(int action, T t, boolean isFirst) {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return initFragmentView(inflater, container, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initControl();
        initData();
        initEvent();
    }


    /**
     * 初始化视图
     */
    protected abstract View initFragmentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState);

    /**
     * 初始化网络加载控制器
     */
    protected void initControl() {

    }

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

    /**
     * 获取状态栏高度
     */
    public int getStatusHeight(Context context) {

        int statusHeight = -1;
        try {
            Class clazz = Class.forName("com.android.internal.R$dimen");
            Object object = clazz.newInstance();
            int height = Integer.parseInt(clazz.getField("status_bar_height")
                    .get(object).toString());
            statusHeight = context.getResources().getDimensionPixelSize(height);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return statusHeight;
    }
    protected int addpage() {
        return index++;
    }
}
