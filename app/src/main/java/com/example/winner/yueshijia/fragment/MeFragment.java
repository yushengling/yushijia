package com.example.winner.yueshijia.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.winner.yueshijia.R;
import com.example.winner.yueshijia.activity.MyOrderActivity;
import com.example.winner.yueshijia.activity.SettingActivity;
import com.example.winner.yueshijia.base.BaseFragment;
import com.example.winner.yueshijia.conf.IDiyMessage;
import com.example.winner.yueshijia.control.UserControl;
import com.example.winner.yueshijia.utils.ActivityUtils;
import com.example.winner.yueshijia.views.HeadZoomScrollView;

/**
 * Created by winner on 2016/11/6.
 */

public class MeFragment extends BaseFragment implements View.OnClickListener {

    @Override
    protected View initFragmentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_me, container, false);
        initView(view);
        return view;
    }

    @Override
    protected void initControl() {
        UserControl userControl = new UserControl(getContext());
        userControl.setHandleMessageListener(this);
    }

    private void initView(View view) {
        View statusBar = view.findViewById(R.id.status_bar);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT
                , getStatusHeight(getContext()));
        statusBar.setLayoutParams(params);
        HeadZoomScrollView meHzsv = (HeadZoomScrollView) view.findViewById(R.id.hzsv_me);
        meHzsv.setmScaleRatio(0.8f);
        ImageView settingIv = (ImageView) view.findViewById(R.id.setting_iv);
        settingIv.setOnClickListener(this);
        TextView allOrderRl = (TextView) view.findViewById(R.id.me_order_tv);
        allOrderRl.setOnClickListener(this);

        view.findViewById(R.id.wait_pay).setOnClickListener(this);
        view.findViewById(R.id.wait_transmit).setOnClickListener(this);
        view.findViewById(R.id.wait_receive).setOnClickListener(this);
        view.findViewById(R.id.wait_comment).setOnClickListener(this);
    }

    @Override
    public void handlerMessage(int action, Object o, boolean isFirst) {
        switch (action) {
            case IDiyMessage.ME_ACTION:
                // TODO: 2016/11/10
                break;
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.setting_iv:
                //启动设置页
                ActivityUtils.start(getActivity(), SettingActivity.class, false);
                break;
            case R.id.me_order_tv:
                startOrderDetailTitleAt(0);
                break;
            case R.id.wait_pay:
                startOrderDetailTitleAt(1);
                break;
            case R.id.wait_transmit:
                startOrderDetailTitleAt(2);
                break;
            case R.id.wait_receive:
                startOrderDetailTitleAt(3);
                break;
            case R.id.wait_comment:
                startOrderDetailTitleAt(4);
                break;
        }
    }

    /**
     *   启动订单详情页并跳转到指定tab上
     */
    private void startOrderDetailTitleAt(int position) {
        Intent intent = new Intent(getContext(), MyOrderActivity.class);
        intent.putExtra("position", position);
        getContext().startActivity(intent);
    }
}
