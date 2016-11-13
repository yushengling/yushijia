package com.example.winner.yueshijia.fragment.orderdetail;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.winner.yueshijia.R;
import com.example.winner.yueshijia.base.BaseFragment;

/**
 * @author seventoto
 * @time 2016/11/12  14:49
 * @desc ${TODD}
 */

public class WaitCommentFragment extends BaseFragment {

    @Override
    protected View initFragmentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_no_order, container, false);
        return view;
    }
}
