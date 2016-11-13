package com.example.winner.yueshijia.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

/**
 * Created by winner on 2016/11/10.
 */

public class MyScrollview extends ScrollView {


    public MyScrollview(Context context) {
        super(context);
    }

    public MyScrollview(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyScrollview(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        int action = ev.getAction();
        switch (action) {
            case MotionEvent.ACTION_MOVE:
                if (mListener != null) {
                    mListener.move();
                }
                break;
            case MotionEvent.ACTION_UP:
                if (mListener != null) {
                    mListener.up();
                }
                break;
        }
        return super.onTouchEvent(ev);
    }

    public interface OnScrollListener {
        void move();

        void up();
    }

    private OnScrollListener mListener;

    public void setListener(OnScrollListener listener) {
        mListener = listener;
    }
}
