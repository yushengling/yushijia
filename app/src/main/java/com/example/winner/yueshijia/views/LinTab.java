package com.example.winner.yueshijia.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.winner.yueshijia.R;

/**
 * Created by winner on 2016/11/6.
 */

public class LinTab extends LinearLayout {

    private ImageView mImageView;
    private TextView mTextView;
    private int mIv_res;
    private String mTv_str;
    private Context mContext;

    public LinTab(Context context) {
        this(context, null);
    }

    public LinTab(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.LinTab);
        mIv_res = ta.getResourceId(R.styleable.LinTab_iv_res, 0);
        mTv_str = ta.getString(R.styleable.LinTab_tv_str);
        ta.recycle();

        View view = LayoutInflater.from(context).inflate(R.layout.view_tabs, this, true);
        mImageView = (ImageView) view.findViewById(R.id.iv);
        mImageView.setImageResource(mIv_res);
        mTextView = (TextView) view.findViewById(R.id.tv);
        mTextView.setText(mTv_str);
    }

    public void setImageResource(int resId) {
        mImageView.setImageResource(resId);
    }

    public void setText(String text) {
        mTextView.setText(text);
    }
}
