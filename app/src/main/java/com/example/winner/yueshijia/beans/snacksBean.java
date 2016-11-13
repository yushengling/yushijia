package com.example.winner.yueshijia.beans;

import java.util.List;

/**
 * Created by hasee on 2016/11/10.
 */

public class snacksBean {
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public snacks getDatas() {
        return datas;
    }

    public void setDatas(snacks datas) {
        this.datas = datas;
    }

    public boolean isHasmore() {
        return hasmore;
    }

    public void setHasmore(boolean hasmore) {
        this.hasmore = hasmore;
    }

    public int getOage_total() {
        return oage_total;
    }

    public void setOage_total(int oage_total) {
        this.oage_total = oage_total;
    }

      int code;
      snacks datas;
      boolean hasmore;
      int oage_total;

       public static class snacks{
           public List<snackslist> getGoods_list() {
               return goods_list;
           }

           public void setGoods_list(List<snackslist> goods_list) {
               this.goods_list = goods_list;
           }

           List<snackslist> goods_list;
         public static class  snackslist{
             public long getGoods_id() {
                 return goods_id;
             }

             public void setGoods_id(long goods_id) {
                 this.goods_id = goods_id;
             }

             public String getGoods_image() {
                 return goods_image;
             }

             public void setGoods_image(String goods_image) {
                 this.goods_image = goods_image;
             }

             public String getGoods_image_url() {
                 return goods_image_url;
             }

             public void setGoods_image_url(String goods_image_url) {
                 this.goods_image_url = goods_image_url;
             }

             public String getGoods_jingle() {
                 return goods_jingle;
             }

             public void setGoods_jingle(String goods_jingle) {
                 this.goods_jingle = goods_jingle;
             }

             public double getGoods_marketprice() {
                 return goods_marketprice;
             }

             public void setGoods_marketprice(double goods_marketprice) {
                 this.goods_marketprice = goods_marketprice;
             }

             public double getGoods_price() {
                 return goods_price;
             }

             public void setGoods_price(double goods_price) {
                 this.goods_price = goods_price;
             }

             public String getGoods_name() {
                 return goods_name;
             }

             public void setGoods_name(String goods_name) {
                 this.goods_name = goods_name;
             }

             public long getGoods_salenum() {
                 return goods_salenum;
             }

             public void setGoods_salenum(long goods_salenum) {
                 this.goods_salenum = goods_salenum;
             }

             long goods_id; //商品ID
             String goods_image; //图片
             String goods_image_url; //图片地址
             String goods_jingle;// "五折商品不参加活动 | 甘口+中辛+辛口+大辛，满足所有口味",
             double goods_marketprice; //原价
             String goods_name; //商品名称
             double  goods_price; //商品售价
             long goods_salenum; //商品销量
         }
     }


}
