package com.example.winner.yueshijia.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.winner.yueshijia.R;
import com.example.winner.yueshijia.activity.GoodsDetailsActivity;
import com.example.winner.yueshijia.activity.SpecialGoodsActivity;
import com.example.winner.yueshijia.adpter.home.BannerAdapter;
import com.example.winner.yueshijia.adpter.home.BottomListAdapter;
import com.example.winner.yueshijia.adpter.home.SpecialAdapter;
import com.example.winner.yueshijia.base.BaseFragment;
import com.example.winner.yueshijia.beans.homeBean.HomeBean;
import com.example.winner.yueshijia.conf.IDiyMessage;
import com.example.winner.yueshijia.control.HomeControl;
import com.example.winner.yueshijia.utils.UIUtils;
import com.example.winner.yueshijia.views.HorizontalListView;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;

import me.maxwin.view.XListView;

/**
 * Created by winner on 2016/11/6.
 */

public class HomeFragment extends BaseFragment<HomeBean> implements ViewPager.OnPageChangeListener {

    private int index = 1;
    private HomeControl mControl;
    private ArrayList<HomeBean> mHomeBeen;

    public ViewPager home_head_vp;
    public ImageView title_iv;
    public HorizontalListView special_listView;
    public XListView bottom_lv;
    private View top_view;
    private TextView tv_banner;
    private TextView tv_image;
    private LinearLayout point_ll;
    private BannerAdapter mBannerAdapter;
    private SpecialAdapter mSpecialAdapter;
    private ArrayList<HomeBean.DatasBean.BannerBean> mBannerS;
    private BottomListAdapter mBottomListAdapter;
    private ArrayList<HomeBean.DatasBean.DataTypeBean> datas;
    private AutoScroll mRunnable;
    private ArrayList<HomeBean.DatasBean.DataTypeBean.GoodsSpecialListBean> mGoods_special_list;

    @Override
    public void handlerMessage(int action, HomeBean homeBean, boolean isFirst) {
        EventBus.getDefault().post("over");
        if (homeBean.getCode() == 200) {

            ArrayList<HomeBean.DatasBean.DataTypeBean> data_type = homeBean.getDatas().getData_type();
            if (isFirst) {
                datas.clear();
                datas.addAll(data_type);
                HomeBean.DatasBean.DataTypeBean dataTypeBean = data_type.get(0);
                initBanner(homeBean);
                initImage(dataTypeBean);
                initHorizontalListView(dataTypeBean);
                initBottomList(data_type);

                bottom_lv.stopRefresh();
            } else {
                datas.addAll(data_type);
                initBottomList(datas);
                bottom_lv.stopLoadMore();
            }
            bottom_lv.setPullLoadEnable(homeBean.isHasmore() ? true : false);
        }
    }

    private void initBottomList(ArrayList<HomeBean.DatasBean.DataTypeBean> data_type) {
        data_type.remove(0);
        mBottomListAdapter.setData(data_type);
    }

    private void initHorizontalListView(HomeBean.DatasBean.DataTypeBean dataTypeBean) {
        mGoods_special_list = dataTypeBean.getGoods_special_list();
        mSpecialAdapter.setData(mGoods_special_list);
    }

    private void initBanner(HomeBean homeBean) {
        mBannerS = homeBean.getDatas().getBanner();
        mBannerAdapter.setDatas(mBannerS);
        if (mRunnable != null) {
            mRunnable.stop();
        }
        mRunnable = new AutoScroll();
        mRunnable.start();
        point_ll.removeAllViews();

        for (int i = 0; i < mBannerS.size(); i++) {
            ImageView iv = new ImageView(UIUtils.getContext());
            iv.setImageResource(R.drawable.indicator_normal);
            if (i == 0) {
                iv.setImageResource(R.drawable.indicator_selected);
            }
            //设置圆点的参数
            int width = UIUtils.dip2Px(5);
            int height = UIUtils.dip2Px(5);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(width, height);
            params.leftMargin = UIUtils.dip2Px(5);
            params.bottomMargin = UIUtils.dip2Px(8);
            point_ll.addView(iv, params);
        }

//        int currentItem = 400 - (400 % mBannerS.size());
//        home_head_vp.setCurrentItem(currentItem);
        String banner_font = homeBean.getDatas().getBanner_font();
        tv_banner.setText(banner_font);
    }


    private void initImage(final HomeBean.DatasBean.DataTypeBean dataTypeBean) {
        String relation_object_image = dataTypeBean.getRelation_object_image();
        Glide.with(this).load(relation_object_image).into(title_iv);
        tv_image.setVisibility(View.VISIBLE);
        tv_image.setText(dataTypeBean.getRelation_object_title());
        title_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SpecialGoodsActivity.class);
                intent.putExtra(SpecialGoodsActivity.INTENT_KEY, dataTypeBean.getRelation_object_id());
                startActivity(intent);
            }
        });
    }

    @Override
    protected View initFragmentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        View head = LayoutInflater.from(getActivity()).inflate(R.layout.home_head, null);
        top_view = view.findViewById(R.id.top_view);
        top_view.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, getStatusHeight(container.getContext())));
        this.home_head_vp = (ViewPager) head.findViewById(R.id.home_head_vp);
        this.tv_banner = (TextView) head.findViewById(R.id.tv_banner);
        this.tv_image = (TextView) head.findViewById(R.id.tv_image);
        this.point_ll = (LinearLayout) head.findViewById(R.id.point_ll);
        this.title_iv = (ImageView) head.findViewById(R.id.title_iv);
        this.special_listView = (HorizontalListView) head.findViewById(R.id.horizontal_listView);
        this.bottom_lv = (XListView) view.findViewById(R.id.bottom_lv);
        bottom_lv.addHeaderView(head);
        return view;
    }

    @Override
    protected void initControl() {
        mControl = new HomeControl(getActivity());
        mControl.setHandleMessageListener(this);
    }

    @Override
    protected void initData() {
        datas = new ArrayList<>();
        mControl.doGet(IDiyMessage.HOME_ACTION, getIndex(), true);
        mHomeBeen = new ArrayList<>();
        //轮播图
        mBannerAdapter = new BannerAdapter(getActivity());
        home_head_vp.setAdapter(mBannerAdapter);
        //横线listView
        mSpecialAdapter = new SpecialAdapter();
        special_listView.setAdapter(mSpecialAdapter);
        //下面的listView
        mBottomListAdapter = new BottomListAdapter();
        bottom_lv.setAdapter(mBottomListAdapter);
    }

    @Override
    protected void initEvent() {
        home_head_vp.addOnPageChangeListener(this);
        bottom_lv.setXListViewListener(new XListView.IXListViewListener() {
            @Override
            public void onRefresh() {
                index = 1;
                mControl.doGet(IDiyMessage.HOME_ACTION, getIndex(), true);
            }

            @Override
            public void onLoadMore() {
                mControl.doGet(IDiyMessage.HOME_ACTION, getIndex(), false);
            }
        });
        //横向listView
        special_listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                HomeBean.DatasBean.DataTypeBean.GoodsSpecialListBean goodsSpecialListBean = mGoods_special_list.get(i);
                Intent intent = new Intent(getActivity(), GoodsDetailsActivity.class);
                intent.putExtra(GoodsDetailsActivity.INTENT_KEY, goodsSpecialListBean.getGoods_id());
                startActivity(intent);
            }
        });
    }


    //自动滚动
    class AutoScroll implements Runnable {

        public void start() {
            UIUtils.getHandler().postDelayed(this, 5000);
        }

        public void stop() {
            UIUtils.getHandler().removeCallbacks(this);
        }

        @Override
        public void run() {
            int currentItem = home_head_vp.getCurrentItem();
            currentItem++;
//            currentItem = currentItem % mBannerS.size();
            home_head_vp.setCurrentItem(currentItem);
            start();
        }
    }

    public int getIndex() {
        return index++;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    private int prePosition = 0;

    @Override
    public void onPageSelected(int position) {
        position = position % mBannerS.size();
        for (int i = 0; i < mBannerS.size(); i++) {

            ImageView iv = (ImageView) point_ll.getChildAt(i);
            iv.setImageResource(R.drawable.indicator_normal);
            if (i == position) {
                iv.setImageResource(R.drawable.indicator_selected);
            }
        }

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }


}
