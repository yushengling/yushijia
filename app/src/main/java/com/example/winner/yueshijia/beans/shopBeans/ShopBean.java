package com.example.winner.yueshijia.beans.shopBeans;

import java.util.ArrayList;

/**
 * Created by winner on 2016/11/10.
 */

public class ShopBean {

    private int code;
    private DatasBean datas;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DatasBean getDatas() {
        return datas;
    }

    public void setDatas(DatasBean datas) {
        this.datas = datas;
    }

    public static class DatasBean {
        /**
         * special_id : 437
         * special_title : 元气暖身指南
         * special_stitle : 寒冬怎么保暖？且看暖身指南【秘籍一】：抱紧你的男/女朋友。【秘籍二】：记得穿保暖裤。【秘籍三】：多吃下面这些暖身美味就好啦！☟☟☟
         * special_margin_top : 0
         * special_background : null
         * special_image : http://resup.b0.upaiyun.com/upload/cms/special/05320290089925620.jpg
         * special_image_large :
         * special_image_all :
         * special_content : null
         * special_modify_time : 1478685524
         * special_publish_id : 73
         * special_state : 2
         * special_background_color : #FFFFFF
         * special_repeat : no-repeat
         * special_type : 2
         * special_start_time : 0
         * special_end_time : 0
         * special_article_ids : 1184,887,146,1097,335,175,1138
         * special_image2 : 05320290089925620.jpg
         * is_display : 0
         * english_title : SELECTED TOPICS
         */

        private ArrayList<QueryBean> query;
        /**
         * advertId : 115
         * advertTitle : 38° 梅 酒
         * advertImg : http://yueshi.b0.upaiyun.com/adv/2016/09/30/974f9604df7aafa4cff3766b675d2dcb_651.jpg
         * advertText :
         * advertUrl : yueshiopen://virtual?params={"category":"productDetial","entityId":"987","isLogin":0,"linkType":1}
         * advertVideoUrl : null
         * videoShareUrl : http://api.yueshichina.com/html/share/videoDisplay.htm
         * isMark : 0
         */

        private ArrayList<BannerBean> banner;

        private ArrayList<TagClassBean> tag_classify;

        private ChannelBean channel;

        public ChannelBean getChannel() {
            return channel;
        }

        public void setChannel(ChannelBean channel) {
            this.channel = channel;
        }

        public ArrayList<TagClassBean> getTag_classify() {
            return tag_classify;
        }

        public void setTag_classify(ArrayList<TagClassBean> tag_classify) {
            this.tag_classify = tag_classify;
        }

        public ArrayList<QueryBean> getQuery() {
            return query;
        }

        public void setQuery(ArrayList<QueryBean> query) {
            this.query = query;
        }

        public ArrayList<BannerBean> getBanner() {
            return banner;
        }

        public void setBanner(ArrayList<BannerBean> banner) {
            this.banner = banner;
        }


        public class ChannelBean {

            /**
             * goods_img : http://yueshi.b0.upaiyun.com/goods/192/2016/10/20/507501541dd170f33223febaa315935e_813.jpg
             * tv_goods_name : 爱吃肉怎么了
             * goods_price : 26.00
             * title : 限时悦惠
             * zhekou : 23.40
             */

            private String goods_img;
            private String goods_name;
            private String goods_price;
            private String title;
            private String zhekou;

            public String getGoods_img() {
                return goods_img;
            }

            public void setGoods_img(String goods_img) {
                this.goods_img = goods_img;
            }

            public String getGoods_name() {
                return goods_name;
            }

            public void setGoods_name(String goods_name) {
                this.goods_name = goods_name;
            }

            public String getGoods_price() {
                return goods_price;
            }

            public void setGoods_price(String goods_price) {
                this.goods_price = goods_price;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getZhekou() {
                return zhekou;
            }

            public void setZhekou(String zhekou) {
                this.zhekou = zhekou;
            }
        }

        public class TagClassBean {
            /**
             * is_display : 1
             * tag_id : 2
             * tag_img : http://yueshi.b0.upaiyun.com/cms/jiu.png
             * tag_name : 酒
             * tag_order : 1
             * tag_type : 1
             */

            private String is_display;
            private String tag_id;
            private String tag_img;
            private String tag_name;
            private String tag_order;
            private String tag_type;

            public String getIs_display() {
                return is_display;
            }

            public void setIs_display(String is_display) {
                this.is_display = is_display;
            }

            public String getTag_id() {
                return tag_id;
            }

            public void setTag_id(String tag_id) {
                this.tag_id = tag_id;
            }

            public String getTag_img() {
                return tag_img;
            }

            public void setTag_img(String tag_img) {
                this.tag_img = tag_img;
            }

            public String getTag_name() {
                return tag_name;
            }

            public void setTag_name(String tag_name) {
                this.tag_name = tag_name;
            }

            public String getTag_order() {
                return tag_order;
            }

            public void setTag_order(String tag_order) {
                this.tag_order = tag_order;
            }

            public String getTag_type() {
                return tag_type;
            }

            public void setTag_type(String tag_type) {
                this.tag_type = tag_type;
            }
        }

        public static class QueryBean {
            private String special_id;
            private String special_title;
            private String special_stitle;
            private String special_margin_top;
            private Object special_background;
            private String special_image;
            private String special_image_large;
            private String special_image_all;
            private Object special_content;
            private String special_modify_time;
            private String special_publish_id;
            private String special_state;
            private String special_background_color;
            private String special_repeat;
            private String special_type;
            private String special_start_time;
            private String special_end_time;
            private String special_article_ids;
            private String special_image2;
            private String is_display;
            private String english_title;

            public String getSpecial_id() {
                return special_id;
            }

            public void setSpecial_id(String special_id) {
                this.special_id = special_id;
            }

            public String getSpecial_title() {
                return special_title;
            }

            public void setSpecial_title(String special_title) {
                this.special_title = special_title;
            }

            public String getSpecial_stitle() {
                return special_stitle;
            }

            public void setSpecial_stitle(String special_stitle) {
                this.special_stitle = special_stitle;
            }

            public String getSpecial_margin_top() {
                return special_margin_top;
            }

            public void setSpecial_margin_top(String special_margin_top) {
                this.special_margin_top = special_margin_top;
            }

            public Object getSpecial_background() {
                return special_background;
            }

            public void setSpecial_background(Object special_background) {
                this.special_background = special_background;
            }

            public String getSpecial_image() {
                return special_image;
            }

            public void setSpecial_image(String special_image) {
                this.special_image = special_image;
            }

            public String getSpecial_image_large() {
                return special_image_large;
            }

            public void setSpecial_image_large(String special_image_large) {
                this.special_image_large = special_image_large;
            }

            public String getSpecial_image_all() {
                return special_image_all;
            }

            public void setSpecial_image_all(String special_image_all) {
                this.special_image_all = special_image_all;
            }

            public Object getSpecial_content() {
                return special_content;
            }

            public void setSpecial_content(Object special_content) {
                this.special_content = special_content;
            }

            public String getSpecial_modify_time() {
                return special_modify_time;
            }

            public void setSpecial_modify_time(String special_modify_time) {
                this.special_modify_time = special_modify_time;
            }

            public String getSpecial_publish_id() {
                return special_publish_id;
            }

            public void setSpecial_publish_id(String special_publish_id) {
                this.special_publish_id = special_publish_id;
            }

            public String getSpecial_state() {
                return special_state;
            }

            public void setSpecial_state(String special_state) {
                this.special_state = special_state;
            }

            public String getSpecial_background_color() {
                return special_background_color;
            }

            public void setSpecial_background_color(String special_background_color) {
                this.special_background_color = special_background_color;
            }

            public String getSpecial_repeat() {
                return special_repeat;
            }

            public void setSpecial_repeat(String special_repeat) {
                this.special_repeat = special_repeat;
            }

            public String getSpecial_type() {
                return special_type;
            }

            public void setSpecial_type(String special_type) {
                this.special_type = special_type;
            }

            public String getSpecial_start_time() {
                return special_start_time;
            }

            public void setSpecial_start_time(String special_start_time) {
                this.special_start_time = special_start_time;
            }

            public String getSpecial_end_time() {
                return special_end_time;
            }

            public void setSpecial_end_time(String special_end_time) {
                this.special_end_time = special_end_time;
            }

            public String getSpecial_article_ids() {
                return special_article_ids;
            }

            public void setSpecial_article_ids(String special_article_ids) {
                this.special_article_ids = special_article_ids;
            }

            public String getSpecial_image2() {
                return special_image2;
            }

            public void setSpecial_image2(String special_image2) {
                this.special_image2 = special_image2;
            }

            public String getIs_display() {
                return is_display;
            }

            public void setIs_display(String is_display) {
                this.is_display = is_display;
            }

            public String getEnglish_title() {
                return english_title;
            }

            public void setEnglish_title(String english_title) {
                this.english_title = english_title;
            }
        }

        public static class BannerBean {
            private String advertId;
            private String advertTitle;
            private String advertImg;
            private String advertText;
            private String advertUrl;
            private Object advertVideoUrl;
            private String videoShareUrl;
            private int isMark;

            public String getAdvertId() {
                return advertId;
            }

            public void setAdvertId(String advertId) {
                this.advertId = advertId;
            }

            public String getAdvertTitle() {
                return advertTitle;
            }

            public void setAdvertTitle(String advertTitle) {
                this.advertTitle = advertTitle;
            }

            public String getAdvertImg() {
                return advertImg;
            }

            public void setAdvertImg(String advertImg) {
                this.advertImg = advertImg;
            }

            public String getAdvertText() {
                return advertText;
            }

            public void setAdvertText(String advertText) {
                this.advertText = advertText;
            }

            public String getAdvertUrl() {
                return advertUrl;
            }

            public void setAdvertUrl(String advertUrl) {
                this.advertUrl = advertUrl;
            }

            public Object getAdvertVideoUrl() {
                return advertVideoUrl;
            }

            public void setAdvertVideoUrl(Object advertVideoUrl) {
                this.advertVideoUrl = advertVideoUrl;
            }

            public String getVideoShareUrl() {
                return videoShareUrl;
            }

            public void setVideoShareUrl(String videoShareUrl) {
                this.videoShareUrl = videoShareUrl;
            }

            public int getIsMark() {
                return isMark;
            }

            public void setIsMark(int isMark) {
                this.isMark = isMark;
            }
        }
    }
}
