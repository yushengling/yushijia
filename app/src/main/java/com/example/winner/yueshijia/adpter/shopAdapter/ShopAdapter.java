package com.example.winner.yueshijia.adpter.shopAdapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.winner.yueshijia.R;
import com.example.winner.yueshijia.activity.snacks.GiftDetailActivity;
import com.example.winner.yueshijia.activity.snacks.JpanJkDetailActivity;
import com.example.winner.yueshijia.activity.snacks.SnacksDetailActivity;
import com.example.winner.yueshijia.activity.snacks.SqDetailActivity;
import com.example.winner.yueshijia.activity.snacks.TuChanDetailActivity;
import com.example.winner.yueshijia.activity.snacks.WenChuangDetailActivity;
import com.example.winner.yueshijia.activity.snacks.WineDetailActivity;
import com.example.winner.yueshijia.activity.snacks.WinterDetailActivity;
import com.example.winner.yueshijia.beans.shopBeans.ShopBean;
import com.example.winner.yueshijia.utils.FixedViewUtil;
import com.example.winner.yueshijia.utils.UIUtils;

import java.util.ArrayList;


/**
 * Created by winner on 2016/11/10.
 */

public class ShopAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int BANNER_TYPE = 0;
    private static final int QUERY_TYPE = 1;
    private static final int PIC_TYPE = 2;
    private static final int NOR_TYPE = 3;

    private Context mContext;
    private ShopBean.DatasBean datasBean;

    private ArrayList<ShopBean.DatasBean.BannerBean> mBanners;
    private ArrayList<ShopBean.DatasBean.QueryBean> mQuerys;
    private ArrayList<ShopBean.DatasBean.TagClassBean> mTag_classifys;

    private ArrayList mAllData;

    private ShopBean.DatasBean.ChannelBean mChannel;
    //    private LinearLayout mItem_shop_point_ll;
    private ViewPager mItem_shop_banner_vp;
    private AutoScroll mRunnable;
    private ShopBean.DatasBean.TagClassBean tagClassBean;

    public void setData(ShopBean.DatasBean datasBean) {
        this.datasBean = datasBean;
        mBanners = datasBean.getBanner();
        mQuerys = datasBean.getQuery();
        mTag_classifys = datasBean.getTag_classify();
        mChannel = datasBean.getChannel();
        mAllData = new ArrayList();
//        mAllData.addAll(mBanners);
//        mAllData.addAll(mQuerys);
        mAllData.add(new Object());
        mAllData.add(new Object());
        mAllData.add(mChannel);
        mAllData.addAll(mQuerys);
        notifyDataSetChanged();
    }

    public ShopAdapter(Context context) {
        mContext = context;
    }


    @Override
    public int getItemCount() {
        return datasBean != null ? mAllData.size() : 0;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder = null;
        if (viewType == BANNER_TYPE) {
            View view = LayoutInflater.from(mContext).inflate(R.layout.item_shop_banner, parent, false);
            viewHolder = new BannerViewHolder(view);
        } else if (viewType == QUERY_TYPE) {
            View view = LayoutInflater.from(mContext).inflate(R.layout.item_shop_grid, parent, false);
            viewHolder = new TagClassViewHolder(view);
        } else if (viewType == NOR_TYPE) {
            View view = LayoutInflater.from(mContext).inflate(R.layout.item_shop_nor, parent, false);
            viewHolder = new NorViewHolder(view);
        } else if (viewType == PIC_TYPE) {
            View view = LayoutInflater.from(mContext).inflate(R.layout.item_shop_pic, parent, false);
            viewHolder = new PicViewHolder(view);
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (getItemViewType(position) == BANNER_TYPE) {
            final BannerViewHolder bannerViewHolder = (BannerViewHolder) holder;
            BannerAdapter bannerAdapter = new BannerAdapter(mContext);
            mItem_shop_banner_vp = bannerViewHolder.item_shop_banner_vp;
            mItem_shop_banner_vp.setAdapter(bannerAdapter);
            bannerAdapter.setDatas(mBanners);

            if (mRunnable != null) {
                mRunnable.stop();
            }

            mRunnable = new AutoScroll();
            mRunnable.start();
            bannerViewHolder.item_shop_point_ll.removeAllViews();

            for (int i = 0; i < mBanners.size(); i++) {
                ImageView iv = new ImageView(UIUtils.getContext());
                iv.setImageResource(R.drawable.indicator_normal);
                if (i == 0) {
                    iv.setImageResource(R.drawable.indicator_selected);
                }
                //设置图片的参数
                int width = UIUtils.dip2Px(5);
                int height = UIUtils.dip2Px(5);
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(width, height);
                params.leftMargin = UIUtils.dip2Px(5);
                params.bottomMargin = UIUtils.dip2Px(8);
                bannerViewHolder.item_shop_point_ll.addView(iv, params);
            }

            mItem_shop_banner_vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                }
                @Override
                public void onPageSelected(int position) {
                    position = position % mBanners.size();
                    for (int i = 0; i < mBanners.size(); i++) {
                        ImageView iv = (ImageView) bannerViewHolder.item_shop_point_ll.getChildAt(i);
                        iv.setImageResource(R.drawable.indicator_normal);
                        if (i == position) {
                            iv.setImageResource(R.drawable.indicator_selected);
                        }
                    }
                }

                @Override
                public void onPageScrollStateChanged(int state) {

                }
            });
        } else if (getItemViewType(position) == QUERY_TYPE) {
            TagClassViewHolder queryViewHolder = (TagClassViewHolder) holder;
            ShopTagClassAdapter adapter = new ShopTagClassAdapter(mTag_classifys);
            queryViewHolder.mGridView.setAdapter(adapter);
            FixedViewUtil.setListViewHeightBasedOnChildren(queryViewHolder.mGridView, 4);
         //   tagClassBean = (ShopBean.DatasBean.TagClassBean) mAllData.get(position);
             tagClassBean = mTag_classifys.get(position);


        } else if (getItemViewType(position) == PIC_TYPE) {
            PicViewHolder picViewHolder = (PicViewHolder) holder;
            ShopBean.DatasBean.ChannelBean channelBean = (ShopBean.DatasBean.ChannelBean) mAllData.get(position);
            picViewHolder.tv_goods_price.setText("￥" + channelBean.getGoods_price());
            picViewHolder.tv_goods_price.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
            picViewHolder.tv_title.setText(channelBean.getTitle());
            picViewHolder.tv_zhekou.setText("￥" + channelBean.getZhekou());
            picViewHolder.tv_goods_name.setText(channelBean.getGoods_name());
            Glide.with(mContext).load(channelBean.getGoods_img()).into(picViewHolder.item_shop_pic_iv);
        } else if (getItemViewType(position) == NOR_TYPE) {
            NorViewHolder norViewHolder = (NorViewHolder) holder;
            ShopBean.DatasBean.QueryBean queryBean = (ShopBean.DatasBean.QueryBean) mAllData.get(position);
            norViewHolder.tv_english_title.setText(queryBean.getEnglish_title());
            norViewHolder.tv_special_title.setText(queryBean.getSpecial_title());
            Glide.with(mContext).load(queryBean.getSpecial_image()).placeholder(R.drawable.bg_morentu).into(norViewHolder.iv_image);
        }
    }


    //自动滚动
    class AutoScroll implements Runnable {

        public void start() {
            UIUtils.getHandler().postDelayed(this, 3000);
        }

        public void stop() {
            UIUtils.getHandler().removeCallbacks(this);
        }

        @Override
        public void run() {
            int currentItem = mItem_shop_banner_vp.getCurrentItem();
            currentItem++;
//            currentItem = currentItem % mBannerS.size();
            mItem_shop_banner_vp.setCurrentItem(currentItem);
            start();
        }
    }

    @Override
    public int getItemViewType(int position) {
//        if (position < mBanners.size()) {
        if (position == BANNER_TYPE) {
            return BANNER_TYPE;
//        } else if (position >= mBanners.size() && position < mQuerys.size()) {
        } else if (position == 1) {
            return QUERY_TYPE;
//        } else if (datasBean.getChannel() != null) {
        } else if (position == 2) {
            return PIC_TYPE;
//        } else if (position >= mQuerys.size() && position < mTag_classifys.size()) {
        } else {
            return NOR_TYPE;
        }
//        return super.getItemViewType(position);
    }

    class NorViewHolder extends RecyclerView.ViewHolder {
        public TextView tv_special_title;
        public TextView tv_english_title;
        public ImageView iv_image;

        public NorViewHolder(View itemView) {
            super(itemView);
            this.tv_special_title = (TextView) itemView.findViewById(R.id.tv_special_title);
            this.tv_english_title = (TextView) itemView.findViewById(R.id.tv_english_title);
            this.iv_image = (ImageView) itemView.findViewById(R.id.iv_image);
        }
    }


    class BannerViewHolder extends RecyclerView.ViewHolder {
        public ViewPager item_shop_banner_vp;
        public LinearLayout item_shop_point_ll;

        public BannerViewHolder(View itemView) {
            super(itemView);
            item_shop_banner_vp = (ViewPager) itemView.findViewById(R.id.item_shop_banner_vp);
            item_shop_point_ll = (LinearLayout) itemView.findViewById(R.id.item_shop_point_ll);
        }
    }

    class TagClassViewHolder extends RecyclerView.ViewHolder {
        public GridView mGridView;
        Intent intent=null;
        public TagClassViewHolder(View itemView) {
            super(itemView);
            mGridView = (GridView) itemView.findViewById(R.id.item_shop_id);
            mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    switch (position){
                        case 0:
                            intent=new Intent(mContext,SnacksDetailActivity.class);
                            intent.putExtra("tag_id",tagClassBean.getTag_id());
                            mContext.startActivity(intent);
                            break;
                        case 1:
                            intent=new Intent(mContext,WineDetailActivity.class);
                            intent.putExtra("tag_id",tagClassBean.getTag_id());
                            mContext.startActivity(intent);
                            break;
                        case 2:
                            intent=new Intent(mContext,WinterDetailActivity.class);
                            intent.putExtra("tag_id",tagClassBean.getTag_id());
                            mContext.startActivity(intent);
                            break;
                        case 3:
                            intent=new Intent(mContext,SqDetailActivity.class);
                            intent.putExtra("tag_id",tagClassBean.getTag_id());
                            mContext.startActivity(intent);
                            break;
                        case 4:
                            intent=new Intent(mContext,JpanJkDetailActivity.class);
                            intent.putExtra("tag_id",tagClassBean.getTag_id());
                            mContext.startActivity(intent);
                            break;
                        case 5:
                            intent=new Intent(mContext,TuChanDetailActivity.class);
                            intent.putExtra("tag_id",tagClassBean.getTag_id());
                            mContext.startActivity(intent);
                            break;
                        case 6:
                            intent=new Intent(mContext,GiftDetailActivity.class);
                            intent.putExtra("tag_id",tagClassBean.getTag_id());
                            mContext.startActivity(intent);
                            break;
                        case 7:
                            intent=new Intent(mContext,WenChuangDetailActivity.class);
                            intent.putExtra("tag_id",tagClassBean.getTag_id());
                            mContext.startActivity(intent);
                            break;
                    }
                }
            });
        }

    }

    class PicViewHolder extends RecyclerView.ViewHolder {
        public ImageView item_shop_pic_iv;
        public TextView tv_title;
        public TextView tv_zhekou;
        public TextView tv_goods_price;
        public TextView tv_goods_name;

        public PicViewHolder(View itemView) {
            super(itemView);
            this.item_shop_pic_iv = (ImageView) itemView.findViewById(R.id.item_shop_pic_iv);
            this.tv_title = (TextView) itemView.findViewById(R.id.tv_title);
            this.tv_zhekou = (TextView) itemView.findViewById(R.id.tv_zhekou);
            this.tv_goods_price = (TextView) itemView.findViewById(R.id.tv_goods_price);
            this.tv_goods_name = (TextView) itemView.findViewById(R.id.tv_goods_name);
        }
    }
}
