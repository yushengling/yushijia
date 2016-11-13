package com.example.winner.yueshijia.beans.clubBean;

import com.google.gson.Gson;

/**
 * @author ling
 * @version 1.0
 *          2016/11/12 14:40
 */
public class ClubActivityBean {

    /**
     * code : 200
     * datas : {"goods_content":"http://interface.yueshichina.com/?act=cms_index&op=article_content&type_id=6&goods_id=990","goods_storage":"0","virtual_limit":"10","goods_name":"\u201c繁华菌季\u201d 厨艺课","goods_abstract":"","goods_marketprice":"128.00","goods_image":"http://yueshi.b0.upaiyun.com/goods/12/2016/09/07/1a3a8d62a2da9d6906ab6ec0a26febca_947.jpg","goods_price":"128.00","is_market":0}
     */

    private int code;
    private DatasBean datas;

    public static ClubActivityBean objectFromData(String str) {

        return new Gson().fromJson(str, ClubActivityBean.class);
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setDatas(DatasBean datas) {
        this.datas = datas;
    }

    public int getCode() {
        return code;
    }

    public DatasBean getDatas() {
        return datas;
    }

    public static class DatasBean {
        /**
         * goods_content : http://interface.yueshichina.com/?act=cms_index&op=article_content&type_id=6&goods_id=990
         * goods_storage : 0
         * virtual_limit : 10
         * goods_name : “繁华菌季” 厨艺课
         * goods_abstract :
         * goods_marketprice : 128.00
         * goods_image : http://yueshi.b0.upaiyun.com/goods/12/2016/09/07/1a3a8d62a2da9d6906ab6ec0a26febca_947.jpg
         * goods_price : 128.00
         * is_market : 0
         */

        private String goods_content;
        private String goods_storage;
        private String virtual_limit;
        private String goods_name;
        private String goods_abstract;
        private String goods_marketprice;
        private String goods_image;
        private String goods_price;
        private int is_market;

        public static DatasBean objectFromData(String str) {

            return new Gson().fromJson(str, DatasBean.class);
        }

        public void setGoods_content(String goods_content) {
            this.goods_content = goods_content;
        }

        public void setGoods_storage(String goods_storage) {
            this.goods_storage = goods_storage;
        }

        public void setVirtual_limit(String virtual_limit) {
            this.virtual_limit = virtual_limit;
        }

        public void setGoods_name(String goods_name) {
            this.goods_name = goods_name;
        }

        public void setGoods_abstract(String goods_abstract) {
            this.goods_abstract = goods_abstract;
        }

        public void setGoods_marketprice(String goods_marketprice) {
            this.goods_marketprice = goods_marketprice;
        }

        public void setGoods_image(String goods_image) {
            this.goods_image = goods_image;
        }

        public void setGoods_price(String goods_price) {
            this.goods_price = goods_price;
        }

        public void setIs_market(int is_market) {
            this.is_market = is_market;
        }

        public String getGoods_content() {
            return goods_content;
        }

        public String getGoods_storage() {
            return goods_storage;
        }

        public String getVirtual_limit() {
            return virtual_limit;
        }

        public String getGoods_name() {
            return goods_name;
        }

        public String getGoods_abstract() {
            return goods_abstract;
        }

        public String getGoods_marketprice() {
            return goods_marketprice;
        }

        public String getGoods_image() {
            return goods_image;
        }

        public String getGoods_price() {
            return goods_price;
        }

        public int getIs_market() {
            return is_market;
        }
    }
}
