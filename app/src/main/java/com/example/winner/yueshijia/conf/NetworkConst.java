package com.example.winner.yueshijia.conf;

/**
 * Created by winner on 2016/11/7.
 */

public class NetworkConst {

    public static final int DEBUG_LEVEL = 7;

    public static final String LOG_TAB = "yueshijia_log";

    public static final String HOME_URL = "http://interface.yueshichina.com/?act=app&op=index1&key=8dffaf9daeec9ef0b0eef4a28c92903d&token=749a036dc06ae8b3a120848995a9f306&client=android&curpage=";

    public static final String CLUB_VIDEO_URL = "http://interface.yueshichina.com/?act=app&op=special_programa&special_type=1&key=8dffaf9daeec9ef0b0eef4a28c92903d&token=749a036dc06ae8b3a120848995a9f306&client=android&curpage=";

    public static final String SHOP_URL = "http://interface.yueshichina.com/?act=goods_cms_special&op=cms_special&token=749a036dc06ae8b3a120848995a9f306&client=android&curpage=";
    /*闪屏页*/
    public static final String SPLASH_URL = "http://interface.yueshichina.com/?act=index&op=apk_index_adv";
    /*榜单*/
    public static final String TOP_URL = "http://interface.yueshichina.com/?act=app&op=special_programa&special_type=2&key=8dffaf9daeec9ef0b0eef4a28c92903d&token=749a036dc06ae8b3a120848995a9f306&client=android&curpage=";
    /*知识*/
    public static final String KNOWLEDGE_URL = "http://interface.yueshichina.com/?act=app&op=special_programa&special_type=3&key=cf0a1e0ad0b1f9b814bb6f9ba1af6f7e&token=749a036dc06ae8b3a120848995a9f306&client=android&curpage=";
    /*人文*/
    public static final String CULTURE_URL = "http://interface.yueshichina.com/?act=app&op=special_programa&special_type=4&key=cf0a1e0ad0b1f9b814bb6f9ba1af6f7e&token=749a036dc06ae8b3a120848995a9f306&client=android&curpage=";
    /*地图*/
    public static final String MAP_URL = "http://interface.yueshichina.com/?act=app&op=special_programa&special_type=5&key=cf0a1e0ad0b1f9b814bb6f9ba1af6f7e&token=749a036dc06ae8b3a120848995a9f306&client=android&curpage=";
    /*活动*/
    public static final String ACTIVITY_URL = "http://interface.yueshichina.com/?act=app&op=special_programa&special_type=6&key=cf0a1e0ad0b1f9b814bb6f9ba1af6f7e&token=749a036dc06ae8b3a120848995a9f306&client=android";
    /*首页图片的点击事件  %%%d为替换符*/
    public static final String HOME_IMG_URL = "http://interface.yueshichina.com/?act=app& op=goods_special&special_id=%%%d& key=8dffaf9daeec9ef0b0eef4a28c92903d&token=749a036dc06ae8b3a120848995a9f306&client=android&curpage=";
    /*商品详情  %%%d为占位符*/
    public static final String GOODS_DETAIL_URL = "http://interface.yueshichina.com/?act=goods&op=goods_detail&goods_id=%%%d&key=8dffaf9daeec9ef0b0eef4a28c92903d&token=749a036dc06ae8b3a120848995a9f306&client=android";
    /*榜单*/
    public static final String TOP_DETAIL_URL = "http://interface.yueshichina.com/?act=cms_index&op=cms_app_index&article_id=%D &key=cf0a1e0ad0b1f9b814bb6f9ba1af6f7e&token=749a036dc06ae8b3a120848995a9f306&type_id=2&client=android";
    /*知识*/
    //                                                    "http://interface.yueshichina.com/?act=cms_index&op=cms_app_index&article_id=1020&key=cf0a1e0ad0b1f9b814bb6f9ba1af6f7e&token=749a036dc06ae8b3a120848995a9f306&type_id=3&client=android";
    public static final String KNOWLEDGE_DETAIL_URL = "http://interface.yueshichina.com/?act=cms_index&op=cms_app_index&article_id=%D &key=cf0a1e0ad0b1f9b814bb6f9ba1af6f7e&token=749a036dc06ae8b3a120848995a9f306&type_id=3&client=android";
    /*人文*/
    public static final String CULTURE_DETAIL_URL = "http://interface.yueshichina.com/?act=cms_index&op=cms_app_index&article_id=%D &key=cf0a1e0ad0b1f9b814bb6f9ba1af6f7e&token=749a036dc06ae8b3a120848995a9f306&type_id=4&client=android";
    /*地图*/
    public static final String MAP_DETAIL_URL = "http://interface.yueshichina.com/?act=cms_index&op=cms_app_index&article_id=%D &key=cf0a1e0ad0b1f9b814bb6f9ba1af6f7e&token=749a036dc06ae8b3a120848995a9f306&type_id=5&client=android";
    /*活动*/
    //    public static final String ACTIVITY_DETAIL_URL = "http://interface.yueshichina.com/?act=cms_index&op=cms_app_index&article_id=%D &key=cf0a1e0ad0b1f9b814bb6f9ba1af6f7e&token=749a036dc06ae8b3a120848995a9f306&type_id=6&client=android";
    public static final String ACTIVITY_DETAIL_URL = "http://interface.yueshichina.com/?act=cms_index&op=cms_virtual_particulars&goods_id=%D&key=cf0a1e0ad0b1f9b814bb6f9ba1af6f7e&token=749a036dc06ae8b3a120848995a9f306&client=android";
    //分类详情的跳转web

    //分类top详情的跳转web
    public static String getTopDetailUrl(int action, String topid) {
        String url = "";
        switch (action) {
            case IDiyMessage.TOP_DETAIL_ACTION:
                url = TOP_DETAIL_URL.replace("%D", topid);
                break;
            case IDiyMessage.KNOWLEDGE_DETAIL_ACTION:
                url = KNOWLEDGE_DETAIL_URL.replace("%D", topid);
                break;
            case IDiyMessage.CULTURE_DETAIL_ACTION:
                url = CULTURE_DETAIL_URL.replace("%D", topid);
                break;
            case IDiyMessage.MAP_DETAIL_ACTION:
                url = MAP_DETAIL_URL.replace("%D", topid);
                break;
            case IDiyMessage.ACTIVITY_DETAIL_ACTION:
                url = ACTIVITY_DETAIL_URL.replace("%D", topid);
                break;
        }
        return url;
    }
    //分类详情的跳转web  %%%ad和%%%td是占位符
    public static final String BASE_WEB_VIEW_URL = "http://interface.yueshichina.com/?act=cms_index&op=cms_app_index&article_id=%%%ad " +
            "&key=cf0a1e0ad0b1f9b814bb6f9ba1af6f7e&token=749a036dc06ae8b3a120848995a9f306&type_id=%%%td&client=android";



















    //商品详情子控件
    public static final String GOODS_ITEM_DETAIL_URL = "http://interface.yueshichina.com/?act=goods&op=goods_body&goods_id=";//+goods_id=867

    public static final String GOODS_ITEM_COMMENT_URL = "http://interface.yueshichina.com/?act=goods&op=goods_evaluate&req_time=1478963454900&curpage=1&v=2.0.5&client=android&channel=baidu&token=749a036dc06ae8b3a120848995a9f306&goods_id=";//+goods_id=867


    //店铺详情
    public static final String SNACKS_URL = "http://interface.yueshichina.com/?act=goods&op=goods_list&token=7" +
            "49a036dc06ae8b3a120848995a9f306&client=android&curpage=";

    public static final String MY_ORDER_URL = "http://interface.yueshichina.com/?act=store&op=store_goods&curpage=1&store_id=192&client=android&token=749a036dc06ae8b3a120848995a9f306&key=b272f9fa3edc2eb6efa786e70cbf6643";

}
