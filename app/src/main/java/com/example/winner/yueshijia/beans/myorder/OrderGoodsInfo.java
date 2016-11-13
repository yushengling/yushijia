package com.example.winner.yueshijia.beans.myorder;

/**
 * @author seventoto
 * @time 2016/11/12  22:02
 * @desc ${TODD}
 */
public class OrderGoodsInfo {
    private String goods_name;
    private String goods_image;
    private String goods_price;
    private String goods_salenum;
    private String store_name;

    public OrderGoodsInfo() {

    }

    public OrderGoodsInfo(String goods_name,
                          String goods_image,
                          String goods_price,
                          String goods_salenum,
                          String store_name) {
        this.goods_name = goods_name;
        this.goods_image = goods_image;
        this.goods_price = goods_price;
        this.goods_salenum = goods_salenum;
        this.store_name = store_name;
    }

    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }


    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public String getGoods_image() {
        return goods_image;
    }

    public void setGoods_image(String goods_image) {
        this.goods_image = goods_image;
    }

    public String getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(String goods_price) {
        this.goods_price = goods_price;
    }

    public String getGoods_salenum() {
        return goods_salenum;
    }

    public void setGoods_salenum(String goods_salenum) {
        this.goods_salenum = goods_salenum;
    }

    @Override
    public String toString() {
        return "OrderGoodsInfo{" +
                "goods_name='" + goods_name + '\'' +
                ", goods_image='" + goods_image + '\'' +
                ", goods_price='" + goods_price + '\'' +
                ", goods_salenum='" + goods_salenum + '\'' +
                '}';
    }
}
