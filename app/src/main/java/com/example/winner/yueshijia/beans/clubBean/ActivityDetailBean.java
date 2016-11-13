package com.example.winner.yueshijia.beans.clubBean;

/**
 * @author ling
 * @version 1.0
 *          2016/11/12 14:59
 */
public class ActivityDetailBean {
    /**
     * code : 200
     * datas : {"goods_abstract":" ","goods_content":" ","goods_image":" ","goods_marketprice":"288.00","goods_name":"【已售罄】 悦食厨艺课之风情暖宴","goods_price":"288.00","goods_storage":"0","is_market":0,"virtual_limit":"5"}
     */

    private int code;
    /**
     * goods_abstract :
     * goods_content :
     * goods_image :
     * goods_marketprice : 288.00
     * goods_name : 【已售罄】 悦食厨艺课之风情暖宴
     * goods_price : 288.00
     * goods_storage : 0
     * is_market : 0
     * virtual_limit : 5
     */

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
        private String goods_abstract;
        private String goods_content;
        private String goods_image;
        private String goods_marketprice;
        private String goods_name;
        private String goods_price;
        private String goods_storage;
        private int is_market;
        private String virtual_limit;

        public String getGoods_abstract() {
            return goods_abstract;
        }

        public void setGoods_abstract(String goods_abstract) {
            this.goods_abstract = goods_abstract;
        }

        public String getGoods_content() {
            return goods_content;
        }

        public void setGoods_content(String goods_content) {
            this.goods_content = goods_content;
        }

        public String getGoods_image() {
            return goods_image;
        }

        public void setGoods_image(String goods_image) {
            this.goods_image = goods_image;
        }

        public String getGoods_marketprice() {
            return goods_marketprice;
        }

        public void setGoods_marketprice(String goods_marketprice) {
            this.goods_marketprice = goods_marketprice;
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

        public String getGoods_storage() {
            return goods_storage;
        }

        public void setGoods_storage(String goods_storage) {
            this.goods_storage = goods_storage;
        }

        public int getIs_market() {
            return is_market;
        }

        public void setIs_market(int is_market) {
            this.is_market = is_market;
        }

        public String getVirtual_limit() {
            return virtual_limit;
        }

        public void setVirtual_limit(String virtual_limit) {
            this.virtual_limit = virtual_limit;
        }
    }


}
