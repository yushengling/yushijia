package com.example.winner.yueshijia.beans.shopBeans;

import com.google.gson.Gson;

import java.util.List;

/**
 * @author VKEY
 * @since 2016/11/12 23:25
 */

public class ShopCommentBean {

    @Override
    public String toString() {
        return "ShopCommentBean{" +
                "code=" + code +
                ", datas=" + datas +
                ", hasmore=" + hasmore +
                ", page_total=" + page_total +
                '}';
    }

    /**
     * code : 200
     * datas : {"goods_eval_list":[{"geval_addtime":"1478612657","geval_addtime_again":"0","geval_content":"5","geval_content_again":"","geval_explain_again":"","geval_frommemberid":"26289","geval_frommembername":"13818422061","geval_goodsid":"867","geval_goodsimage":"http://yueshi.b0.upaiyun.com/goods/12/2016/10/19/50a8399bee2f59665d5706031e02fd97_368.jpg","geval_goodsname":"招德纯米柚子酒 浓润甘口型","geval_goodsprice":"158.40","geval_id":"5556","geval_image":"","geval_image_again":"","geval_images":[],"geval_isanonymous":"0","geval_ordergoodsid":"243703","geval_orderid":"233560","geval_orderno":"8000000010584504","geval_scores":"5","geval_storeid":"12","geval_storename":"悦食家","member_avatar":"http://uyueshi.b0.upaiyun.com/user/header/201610/26289.jpg!200x200?t=1477908188","member_nick":"MOMO"},{"geval_addtime":"1478588537","geval_addtime_again":"0","geval_content":"5","geval_content_again":"","geval_explain_again":"","geval_frommemberid":"13097","geval_frommembername":"13761613714","geval_goodsid":"867","geval_goodsimage":"http://yueshi.b0.upaiyun.com/goods/12/2016/10/19/50a8399bee2f59665d5706031e02fd97_368.jpg","geval_goodsname":"招德纯米柚子酒 浓润甘口型","geval_goodsprice":"158.40","geval_id":"5511","geval_image":"","geval_image_again":"","geval_images":[],"geval_isanonymous":"0","geval_ordergoodsid":"245168","geval_orderid":"234672","geval_orderno":"8000000010620201","geval_scores":"5","geval_storeid":"12","geval_storename":"悦食家","member_avatar":"http://uyueshi.b0.upaiyun.com/user/product/comment/2016/04/26/1461679420CUBDRTWJRPYKWWIIVFUABHDXQJQXINCI","member_nick":"吃土少年仓酱"},{"geval_addtime":"1478521958","geval_addtime_again":"0","geval_content":"5","geval_content_again":"","geval_explain_again":"","geval_frommemberid":"157396","geval_frommembername":"phone_13872515156","geval_goodsid":"867","geval_goodsimage":"http://yueshi.b0.upaiyun.com/goods/12/2016/10/19/50a8399bee2f59665d5706031e02fd97_368.jpg","geval_goodsname":"招德纯米柚子酒 浓润甘口型","geval_goodsprice":"158.40","geval_id":"5476","geval_image":"","geval_image_again":"","geval_images":[],"geval_isanonymous":"0","geval_ordergoodsid":"247528","geval_orderid":"236455","geval_orderno":"8000000010675504","geval_scores":"5","geval_storeid":"12","geval_storename":"悦食家","member_avatar":"http://uyueshi.b0.upaiyun.com/user/image/201410/16.png","member_nick":"匿名用户"},{"geval_addtime":"1478273147","geval_addtime_again":"0","geval_content":"5","geval_content_again":"","geval_explain_again":"","geval_frommemberid":"151551","geval_frommembername":"phone_15129097302","geval_goodsid":"867","geval_goodsimage":"http://yueshi.b0.upaiyun.com/goods/12/2016/10/19/50a8399bee2f59665d5706031e02fd97_368.jpg","geval_goodsname":"招德纯米柚子酒 浓润甘口型","geval_goodsprice":"158.40","geval_id":"5224","geval_image":"","geval_image_again":"","geval_images":[],"geval_isanonymous":"0","geval_ordergoodsid":"232673","geval_orderid":"225259","geval_orderno":"8000000010329801","geval_scores":"5","geval_storeid":"12","geval_storename":"悦食家","member_avatar":"http://uyueshi.b0.upaiyun.com/user/header/201610/151551.jpg!200x200?t=1477644005","member_nick":"Amy大白"},{"geval_addtime":"1476622088","geval_addtime_again":"0","geval_content":"5","geval_content_again":"","geval_explain_again":"","geval_frommemberid":"143259","geval_frommembername":"","geval_goodsid":"867","geval_goodsimage":"http://yueshi.b0.upaiyun.com/goods/new/867-1.jpg","geval_goodsname":"招德纯米柚子酒 浓润甘口型","geval_goodsprice":"198.00","geval_id":"4091","geval_image":"14766220881432591_new.jpg","geval_image_again":"","geval_images":["http://interface.yueshichina.com/data/upload/shop/avatar/14766220881432591_new.jpg"],"geval_isanonymous":"0","geval_ordergoodsid":"221316","geval_orderid":"216135","geval_orderno":"8000000009922901","geval_scores":"5","geval_storeid":"12","geval_storename":"悦食家","member_avatar":"http://interface.yueshichina.com/data/upload/shop/avatar/avatar_143259.jpg","member_nick":"匿名用户"},{"geval_addtime":"1476241641","geval_addtime_again":"0","geval_content":"5","geval_content_again":"","geval_explain_again":"","geval_frommemberid":"148579","geval_frommembername":"phone_13713396656","geval_goodsid":"867","geval_goodsimage":"http://yueshi.b0.upaiyun.com/goods/new/867-1.jpg","geval_goodsname":"招德纯米柚子酒 浓润甘口型","geval_goodsprice":"198.00","geval_id":"3952","geval_image":"","geval_image_again":"","geval_images":[],"geval_isanonymous":"0","geval_ordergoodsid":"223222","geval_orderid":"217719","geval_orderno":"8000000009991001","geval_scores":"5","geval_storeid":"12","geval_storename":"悦食家","member_avatar":"http://interface.yueshichina.com/data/upload/shop/avatar/avatar_148579_new.jpg?1475506112","member_nick":"Candy茵茵"},{"geval_addtime":"1476187395","geval_addtime_again":"0","geval_content":"5","geval_content_again":"","geval_explain_again":"","geval_frommemberid":"127654","geval_frommembername":"phone_18409195009","geval_goodsid":"867","geval_goodsimage":"http://yueshi.b0.upaiyun.com/goods/new/867-1.jpg","geval_goodsname":"招德纯米柚子酒 浓润甘口型","geval_goodsprice":"198.00","geval_id":"3946","geval_image":"","geval_image_again":"","geval_images":[],"geval_isanonymous":"0","geval_ordergoodsid":"224544","geval_orderid":"218798","geval_orderno":"8000000010039501","geval_scores":"5","geval_storeid":"12","geval_storename":"悦食家","member_avatar":"http://interface.yueshichina.com/data/upload/shop/avatar/avatar_127654_new.jpg","member_nick":"猫猫吃香菇"},{"geval_addtime":"1476025483","geval_addtime_again":"0","geval_content":"5","geval_content_again":"","geval_explain_again":"","geval_frommemberid":"148541","geval_frommembername":"phone_13840993931","geval_goodsid":"867","geval_goodsimage":"http://yueshi.b0.upaiyun.com/goods/new/867-1.jpg","geval_goodsname":"招德纯米柚子酒 浓润甘口型","geval_goodsprice":"198.00","geval_id":"3870","geval_image":"","geval_image_again":"","geval_images":[],"geval_isanonymous":"0","geval_ordergoodsid":"221066","geval_orderid":"215925","geval_orderno":"8000000009914201","geval_scores":"5","geval_storeid":"12","geval_storename":"悦食家","member_avatar":"http://uyueshi.b0.upaiyun.com/user/image/201410/16.png","member_nick":"匿名用户"},{"geval_addtime":"1475900422","geval_addtime_again":"0","geval_content":"5","geval_content_again":"","geval_explain_again":"","geval_frommemberid":"31543","geval_frommembername":"ow712wN6ibSQRWrgWU8-PgwL3kgE_3","geval_goodsid":"867","geval_goodsimage":"http://yueshi.b0.upaiyun.com/goods/new/867-1.jpg","geval_goodsname":"招德纯米柚子酒 浓润甘口型","geval_goodsprice":"198.00","geval_id":"3798","geval_image":"","geval_image_again":"","geval_images":[],"geval_isanonymous":"0","geval_ordergoodsid":"220807","geval_orderid":"215723","geval_orderno":"8000000009904101","geval_scores":"5","geval_storeid":"12","geval_storename":"悦食家","member_avatar":"http://wx.qlogo.cn/mmopen/Q3auHgzwzM5SrLbNdic0raF2kMfh5gTibRr2NvaSklb8xjcGNRIYrrQaVFR6wQWos2FQXNZQZpeH4X4pXSkk6lHtCkK6gP4TJHqdGTpX7bibKo/0","member_nick":"陈瑛"},{"geval_addtime":"1475368928","geval_addtime_again":"0","geval_content":"5","geval_content_again":"","geval_explain_again":"","geval_frommemberid":"30387","geval_frommembername":"13813822727","geval_goodsid":"867","geval_goodsimage":"/product/images/201607/21130717201607/21130717o0p4xk.jpg","geval_goodsname":"招德纯米柚子酒 浓润甘口型","geval_goodsprice":"198.00","geval_id":"3702","geval_image":"","geval_image_again":"","geval_images":[],"geval_isanonymous":"0","geval_ordergoodsid":"213642","geval_orderid":"209949","geval_orderno":"8000000009512101","geval_scores":"5","geval_storeid":"12","geval_storename":"悦食家","member_avatar":"http://interface.yueshichina.com/data/upload/shop/avatar/avatar_30387_new.jpg","member_nick":"匿名账号spring"}]}
     * hasmore : true
     * page_total : 2
     */

    private int code;
    private DatasBean datas;
    private boolean hasmore;
    private int page_total;

    public static ShopCommentBean objectFromData(String str) {

        return new Gson().fromJson(str, ShopCommentBean.class);
    }

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

    public boolean isHasmore() {
        return hasmore;
    }

    public void setHasmore(boolean hasmore) {
        this.hasmore = hasmore;
    }

    public int getPage_total() {
        return page_total;
    }

    public void setPage_total(int page_total) {
        this.page_total = page_total;
    }

    public static class DatasBean {
        private List<GoodsEvalListBean> goods_eval_list;

        public static DatasBean objectFromData(String str) {

            return new Gson().fromJson(str, DatasBean.class);
        }

        public List<GoodsEvalListBean> getGoods_eval_list() {
            return goods_eval_list;
        }

        public void setGoods_eval_list(List<GoodsEvalListBean> goods_eval_list) {
            this.goods_eval_list = goods_eval_list;
        }

        public static class GoodsEvalListBean {
            /**
             * geval_addtime : 1478612657
             * geval_addtime_again : 0
             * geval_content : 5
             * geval_content_again :
             * geval_explain_again :
             * geval_frommemberid : 26289
             * geval_frommembername : 13818422061
             * geval_goodsid : 867
             * geval_goodsimage : http://yueshi.b0.upaiyun.com/goods/12/2016/10/19/50a8399bee2f59665d5706031e02fd97_368.jpg
             * geval_goodsname : 招德纯米柚子酒 浓润甘口型
             * geval_goodsprice : 158.40
             * geval_id : 5556
             * geval_image :
             * geval_image_again :
             * geval_images : []
             * geval_isanonymous : 0
             * geval_ordergoodsid : 243703
             * geval_orderid : 233560
             * geval_orderno : 8000000010584504
             * geval_scores : 5
             * geval_storeid : 12
             * geval_storename : 悦食家
             * member_avatar : http://uyueshi.b0.upaiyun.com/user/header/201610/26289.jpg!200x200?t=1477908188
             * member_nick : MOMO
             */

            private String geval_addtime;
            private String geval_addtime_again;
            private String geval_content;
            private String geval_content_again;
            private String geval_explain_again;
            private String geval_frommemberid;
            private String geval_frommembername;
            private String geval_goodsid;
            private String geval_goodsimage;
            private String geval_goodsname;
            private String geval_goodsprice;
            private String geval_id;
            private String geval_image;
            private String geval_image_again;
            private String geval_isanonymous;
            private String geval_ordergoodsid;
            private String geval_orderid;
            private String geval_orderno;
            private String geval_scores;
            private String geval_storeid;
            private String geval_storename;
            private String member_avatar;
            private String member_nick;
            private List<String> geval_images;

            public static GoodsEvalListBean objectFromData(String str) {

                return new Gson().fromJson(str, GoodsEvalListBean.class);
            }

            public String getGeval_addtime() {
                return geval_addtime;
            }

            public void setGeval_addtime(String geval_addtime) {
                this.geval_addtime = geval_addtime;
            }

            public String getGeval_addtime_again() {
                return geval_addtime_again;
            }

            public void setGeval_addtime_again(String geval_addtime_again) {
                this.geval_addtime_again = geval_addtime_again;
            }

            public String getGeval_content() {
                return geval_content;
            }

            public void setGeval_content(String geval_content) {
                this.geval_content = geval_content;
            }

            public String getGeval_content_again() {
                return geval_content_again;
            }

            public void setGeval_content_again(String geval_content_again) {
                this.geval_content_again = geval_content_again;
            }

            public String getGeval_explain_again() {
                return geval_explain_again;
            }

            public void setGeval_explain_again(String geval_explain_again) {
                this.geval_explain_again = geval_explain_again;
            }

            public String getGeval_frommemberid() {
                return geval_frommemberid;
            }

            public void setGeval_frommemberid(String geval_frommemberid) {
                this.geval_frommemberid = geval_frommemberid;
            }

            public String getGeval_frommembername() {
                return geval_frommembername;
            }

            public void setGeval_frommembername(String geval_frommembername) {
                this.geval_frommembername = geval_frommembername;
            }

            public String getGeval_goodsid() {
                return geval_goodsid;
            }

            public void setGeval_goodsid(String geval_goodsid) {
                this.geval_goodsid = geval_goodsid;
            }

            public String getGeval_goodsimage() {
                return geval_goodsimage;
            }

            public void setGeval_goodsimage(String geval_goodsimage) {
                this.geval_goodsimage = geval_goodsimage;
            }

            public String getGeval_goodsname() {
                return geval_goodsname;
            }

            public void setGeval_goodsname(String geval_goodsname) {
                this.geval_goodsname = geval_goodsname;
            }

            public String getGeval_goodsprice() {
                return geval_goodsprice;
            }

            public void setGeval_goodsprice(String geval_goodsprice) {
                this.geval_goodsprice = geval_goodsprice;
            }

            public String getGeval_id() {
                return geval_id;
            }

            public void setGeval_id(String geval_id) {
                this.geval_id = geval_id;
            }

            public String getGeval_image() {
                return geval_image;
            }

            public void setGeval_image(String geval_image) {
                this.geval_image = geval_image;
            }

            public String getGeval_image_again() {
                return geval_image_again;
            }

            public void setGeval_image_again(String geval_image_again) {
                this.geval_image_again = geval_image_again;
            }

            public String getGeval_isanonymous() {
                return geval_isanonymous;
            }

            public void setGeval_isanonymous(String geval_isanonymous) {
                this.geval_isanonymous = geval_isanonymous;
            }

            public String getGeval_ordergoodsid() {
                return geval_ordergoodsid;
            }

            public void setGeval_ordergoodsid(String geval_ordergoodsid) {
                this.geval_ordergoodsid = geval_ordergoodsid;
            }

            public String getGeval_orderid() {
                return geval_orderid;
            }

            public void setGeval_orderid(String geval_orderid) {
                this.geval_orderid = geval_orderid;
            }

            public String getGeval_orderno() {
                return geval_orderno;
            }

            public void setGeval_orderno(String geval_orderno) {
                this.geval_orderno = geval_orderno;
            }

            public String getGeval_scores() {
                return geval_scores;
            }

            public void setGeval_scores(String geval_scores) {
                this.geval_scores = geval_scores;
            }

            public String getGeval_storeid() {
                return geval_storeid;
            }

            public void setGeval_storeid(String geval_storeid) {
                this.geval_storeid = geval_storeid;
            }

            public String getGeval_storename() {
                return geval_storename;
            }

            public void setGeval_storename(String geval_storename) {
                this.geval_storename = geval_storename;
            }

            public String getMember_avatar() {
                return member_avatar;
            }

            public void setMember_avatar(String member_avatar) {
                this.member_avatar = member_avatar;
            }

            public String getMember_nick() {
                return member_nick;
            }

            public void setMember_nick(String member_nick) {
                this.member_nick = member_nick;
            }

            public List<String> getGeval_images() {
                return geval_images;
            }

            public void setGeval_images(List<String> geval_images) {
                this.geval_images = geval_images;
            }
        }
    }
}