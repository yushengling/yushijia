package com.example.winner.yueshijia.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.winner.yueshijia.base.BaseFragment;

/**
 * Created by winner on 2016/11/6.
 */

public class CartFragment extends BaseFragment {
    @Override
    protected View initFragmentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView tv=new TextView(container.getContext());
        tv.setText("购物篮");
        tv.setTextSize(55);
        return tv;
    }
}
