package com.example.winner.yueshijia.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.winner.yueshijia.R;
import com.example.winner.yueshijia.adpter.home.SpecialGoodsAdapter;
import com.example.winner.yueshijia.base.BaseActivity;
import com.example.winner.yueshijia.beans.homeBean.SpecialGoodsBean;
import com.example.winner.yueshijia.conf.IDiyMessage;
import com.example.winner.yueshijia.control.SpecialFoodControl;

/**
 * Created by winner on 2016/11/11.
 */

public class SpecialGoodsActivity extends BaseActivity<SpecialGoodsBean> {
    public static final String INTENT_KEY = "product_id";
    private String mProduct_id;
    private int i = 1;

    public View status_view;
    public TextView tv_head;
    private RecyclerView rv_special_goods;

    private SpecialFoodControl mControl;
    private SpecialGoodsAdapter mAdapter;

    @Override
    public void handlerMessage(int action, SpecialGoodsBean specialGoodsBean, boolean isFirst) {
        switch (action) {
            case IDiyMessage.SPECIAL_GOODS_ACTION:
                handlerSpecialGoods(specialGoodsBean);
                break;
        }
    }

    private void handlerSpecialGoods(SpecialGoodsBean specialGoodsBean) {
        if (specialGoodsBean.getCode() == 200) {
            tv_head.setText(specialGoodsBean.getDatas().getSpecial_title());
            mAdapter.setDatasBean(specialGoodsBean.getDatas());
        }
    }

    @Override
    protected void initView() {
        setContentView(R.layout.activity_product_list);
        this.status_view = findViewById(R.id.status_view);
        status_view.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, getStatusHeight(this)));
        this.tv_head = (TextView) findViewById(R.id.tv_head);
        this.rv_special_goods = (RecyclerView) findViewById(R.id.rv_special_goods);
        rv_special_goods.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        initControl();
    }
@Override

    protected void initControl() {
        mControl = new SpecialFoodControl(this);
        mControl.setHandleMessageListener(this);
    }


    @Override
    protected void initData() {
        Intent intent = getIntent();
        mProduct_id = intent.getStringExtra(INTENT_KEY);
        mControl.doGet(IDiyMessage.SPECIAL_GOODS_ACTION, getIndex(), true, mProduct_id);
        mAdapter = new SpecialGoodsAdapter(this);
        rv_special_goods.setAdapter(mAdapter);
    }

    public int getIndex() {
        return i++;
    }

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

}
