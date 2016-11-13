package com.example.winner.yueshijia.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;


/**
 * Created by winner on 2016/11/6.
 */

public class BasePager extends FrameLayout {

    public static final int EMPTY_STATUS = 0;
    public static final int LOADING_STATUS = 0;
    public static final int ERROR_STATUS = 0;

    private int mCurrentStatus = LOADING_STATUS;
    private View mLoadingview;
    private View mLoadingView;
    private View mErrorView;
    private View mEmptyView;


    public BasePager(Context context) {
        this(context, null);
    }

    public BasePager(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
        initViewByStatus();
    }

    private void initView(Context context) {
//        mEmptyView = LayoutInflater.from(context).inflate(R.layout.fragment_empty, this, false);
//        mErrorView = LayoutInflater.from(context).inflate(R.layout.fragment_error, this, false);
//        mLoadingView = LayoutInflater.from(context).inflate(R.layout.fragment_loading, this, false);
    }

    private void initViewByStatus() {

    }

}
