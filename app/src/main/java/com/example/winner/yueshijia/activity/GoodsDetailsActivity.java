package com.example.winner.yueshijia.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.winner.yueshijia.R;
import com.example.winner.yueshijia.adpter.GoodsDetailPagerAdapter;
import com.example.winner.yueshijia.base.BaseActivity;
import com.example.winner.yueshijia.beans.GoodsDetailBeans;
import com.example.winner.yueshijia.conf.IDiyMessage;
import com.example.winner.yueshijia.control.GoodsDetailControl;
import com.example.winner.yueshijia.utils.ActivityUtils;
import com.example.winner.yueshijia.utils.ShareUtil;
import com.example.winner.yueshijia.views.MyScrollview;

import java.util.Arrays;
import java.util.List;


/**
 * Created by winner on 2016/11/11.
 */
public class GoodsDetailsActivity extends BaseActivity<GoodsDetailBeans> implements MyScrollview.OnScrollListener, View.OnClickListener {
    public static final String INTENT_KEY = "goods_id";


    public TextView tv_gd_name;
    public TextView tv_gd_price;
    public TextView tv_gd_full_price;
    public TextView tv_gd_sold;
    public RelativeLayout rl_gd_price;
    public TextView tv_gd_no_promotion;
    public LinearLayout ll_gd_promotion;
    public TextView tv_gd_summary;
    public TextView tv_gd_details;
    public TextView tv_gd_evaluation;
    public TextView tv_gd_logistics_text;
    public TextView tv_gd_logistics;
    public LinearLayout ll_gd_logistics;
    public LinearLayout ll_gd_content;
    private ViewPager vp_goods;
    private View v_status;
    private RelativeLayout rl_gd_title;
    private MyScrollview sv_gd_content;
    private GoodsDetailControl mControl;
    private GoodsDetailPagerAdapter mGoodsDetailPagerAdapter;
    private String mGoods_id;

    @Override
    public void handlerMessage(int action, GoodsDetailBeans goodsDetailBeans, boolean isFirst) {
        switch (action) {
            case IDiyMessage.GOODS_DETAIL_ACTION:
                handlerGoodsDetail(goodsDetailBeans);
                break;
        }
    }

    private void handlerGoodsDetail(GoodsDetailBeans goodsDetailBeans) {
        if (goodsDetailBeans.getCode() == 200) {
            GoodsDetailBeans.DatasBean datas = goodsDetailBeans.getDatas();
            GoodsDetailBeans.DatasBean.GoodsInfoBean goods_info = datas.getGoods_info();

            tv_gd_name.setText(goods_info.getGoods_name());
            tv_gd_price.setText("￥" + goods_info.getGoods_promotion_price());
            tv_gd_full_price.setText("原价：￥" + goods_info.getGoods_price());
            tv_gd_full_price.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
            tv_gd_sold.setText("已售：" + goods_info.getGoods_virtual_salenum() + "件");
            tv_gd_no_promotion.setText(goods_info.getGoods_normal_hint());
            tv_gd_summary.setText(goods_info.getGoods_jingle());

            String goods_image = datas.getGoods_image();
            String[] urlString = goods_image.split(",");
            List<String> urls = Arrays.asList(urlString);
            mGoodsDetailPagerAdapter.setUrls(urls);
        }
    }

    @Override
    protected void initView() {
        setContentView(R.layout.activity_goods_details);
        v_status = findViewById(R.id.v_status);
        v_status.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, getStatusHeight(this)));
        this.vp_goods = (ViewPager) findViewById(R.id.vp_goods);
        this.tv_gd_name = (TextView) findViewById(R.id.tv_gd_name);
        this.tv_gd_price = (TextView) findViewById(R.id.tv_gd_price);
        this.tv_gd_full_price = (TextView) findViewById(R.id.tv_gd_full_price);
        this.tv_gd_sold = (TextView) findViewById(R.id.tv_gd_sold);
        this.rl_gd_price = (RelativeLayout) findViewById(R.id.rl_gd_price);
        this.tv_gd_no_promotion = (TextView) findViewById(R.id.tv_gd_no_promotion);
        this.ll_gd_promotion = (LinearLayout) findViewById(R.id.ll_gd_promotion);
        this.tv_gd_summary = (TextView) findViewById(R.id.tv_gd_summary);
        this.tv_gd_details = (TextView) findViewById(R.id.tv_gd_details);
        this.tv_gd_evaluation = (TextView) findViewById(R.id.tv_gd_evaluation);
        this.tv_gd_logistics_text = (TextView) findViewById(R.id.tv_gd_logistics_text);
        this.tv_gd_logistics = (TextView) findViewById(R.id.tv_gd_logistics);
        this.ll_gd_logistics = (LinearLayout) findViewById(R.id.ll_gd_logistics);
        this.ll_gd_content = (LinearLayout) findViewById(R.id.ll_gd_content);
        this.sv_gd_content = (MyScrollview) findViewById(R.id.sv_gd_content);
        this.rl_gd_title = (RelativeLayout) findViewById(R.id.rl_gd_title);
        findViewById(R.id.ib_share).setOnClickListener(this);//分享
        findViewById(R.id.ib_back).setOnClickListener(this);//返回键
        findViewById(R.id.ll_gd_shop).setOnClickListener(this);
        findViewById(R.id.ll_gd_collect).setOnClickListener(this);
        findViewById(R.id.bt_into_basket).setOnClickListener(this);
        findViewById(R.id.bt_buy_now).setOnClickListener(this);
        findViewById(R.id.rl_gd_cart).setOnClickListener(this);

        initControl();
    }

    @Override
    protected void initControl() {
        mControl = new GoodsDetailControl(this);
        mControl.setHandleMessageListener(this);
    }

    @Override
    protected void initData() {
        Intent intent = getIntent();
        mGoods_id = intent.getStringExtra(INTENT_KEY);
        Log.i("VKEY", "GoodsDetailsActivity --> initData() " + mGoods_id);
        mControl.doGet(IDiyMessage.GOODS_DETAIL_ACTION, 0, true, mGoods_id);
        mGoodsDetailPagerAdapter = new GoodsDetailPagerAdapter(this);
        vp_goods.setAdapter(mGoodsDetailPagerAdapter);
    }

    @Override
    protected void initEvent() {
        sv_gd_content.setListener(this);

        tv_gd_details.setOnClickListener(this);//商品详情
        tv_gd_evaluation.setOnClickListener(this);//商品评价
        //商品评价
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

    @Override
    public void move() {
        rl_gd_title.setVisibility(View.INVISIBLE);
    }

    @Override
    public void up() {
        rl_gd_title.setVisibility(View.VISIBLE);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ib_share:
                ShareUtil.showShare(this);
                break;
            case R.id.ib_back:
                finish();
                break;
            case R.id.tv_gd_details:
                skipActivity(ProductDetailActivity.class);
                break;
            case R.id.tv_gd_evaluation:
                skipActivity(ShopDetailCommentActivity.class);
                break;
            case R.id.ll_gd_shop:
                ActivityUtils.start(this, MainActivity.class, true);
                break;
            case R.id.ll_gd_collect:
                ActivityUtils.start(this, LoginActivity.class, true);
                break;
            case R.id.bt_into_basket:
                ActivityUtils.start(this, LoginActivity.class, true);
                break;
            case R.id.bt_buy_now:
                ActivityUtils.start(this, LoginActivity.class, true);
                break;
            case R.id.rl_gd_cart:
                ActivityUtils.start(this, LoginActivity.class, true);
                break;
        }
    }

    private void skipActivity(Class clazz) {
        Intent intent = new Intent();
        intent.putExtra(INTENT_KEY, mGoods_id);
        intent.setClass(this, clazz);
        startActivity(intent);
    }
}
