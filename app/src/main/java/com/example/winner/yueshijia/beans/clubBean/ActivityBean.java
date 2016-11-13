package com.example.winner.yueshijia.beans.clubBean;

import com.google.gson.Gson;

import java.util.List;

/**
 * @author ling
 * @version 1.0
 * 2016/11/11 17:16
 */
public class ActivityBean {


    private int code;
    private DatasBean datas;

    public static ActivityBean objectFromData(String str) {

        return new Gson().fromJson(str, ActivityBean.class);
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
         * virtual : [{"goods_name":"【已售罄】 悦食厨艺课之风情暖宴","virtual_indate":"1477843199","goods_image":"http://yueshi.b0.upaiyun.com/goods/12/2016/10/25/8c22f209fdffbba42a774cfe16aa8414_180.jpg","goods_id":"1129","store_id":"12","hint_virtual":"期待下次与您相聚","type_virtual":2,"end_virtual":"活动已结束"},{"goods_name":"\u201c繁华菌季\u201d 厨艺课","virtual_indate":"1473695999","goods_image":"http://yueshi.b0.upaiyun.com/goods/12/2016/09/07/1a3a8d62a2da9d6906ab6ec0a26febca_947.jpg","goods_id":"990","store_id":"12","hint_virtual":"期待下次与您相聚","type_virtual":2,"end_virtual":"活动已结束"},{"goods_name":"悦食大会门票","virtual_indate":"1473609599","goods_image":"http://resup.b0.upaiyun.com/upload/shop/store/goods/12/12_05255420947987503.jpg","goods_id":"948","store_id":"12","hint_virtual":"期待下次与您相聚","type_virtual":2,"end_virtual":"活动已结束"},{"goods_name":"悦食大会门票","virtual_indate":"1473609599","goods_image":"http://resup.b0.upaiyun.com/upload/shop/store/goods/12/12_05255421574254888.jpg","goods_id":"949","store_id":"12","hint_virtual":"期待下次与您相聚","type_virtual":2,"end_virtual":"活动已结束"},{"goods_name":"红丝绒乳酪蛋糕 厨艺课","virtual_indate":"1473609599","goods_image":"http://yueshi.b0.upaiyun.com/goods/12/2016/09/05/14afe4fcb9ac02f7992ebe87847fd14d_582.jpg","goods_id":"985","store_id":"12","hint_virtual":"期待下次与您相聚","type_virtual":2,"end_virtual":"活动已结束"},{"goods_name":"佛罗伦萨酥饼 厨艺课","virtual_indate":"1473609599","goods_image":"http://yueshi.b0.upaiyun.com/goods/12/2016/09/05/cd8392bdc9f74f1a612c2990969524b7_624.jpg","goods_id":"986","store_id":"12","hint_virtual":"期待下次与您相聚","type_virtual":2,"end_virtual":"活动已结束"},{"goods_name":"悦食大会门票","virtual_indate":"1473523199","goods_image":"http://resup.b0.upaiyun.com/upload/shop/store/goods/12/12_05255419649865012.jpg","goods_id":"946","store_id":"12","hint_virtual":"期待下次与您相聚","type_virtual":2,"end_virtual":"活动已结束"},{"goods_name":"悦食大会门票","virtual_indate":"1473523199","goods_image":"http://resup.b0.upaiyun.com/upload/shop/store/goods/12/12_05255420278454646.jpg","goods_id":"947","store_id":"12","hint_virtual":"期待下次与您相聚","type_virtual":2,"end_virtual":"活动已结束"},{"goods_name":"挪威三文鱼乳酪派 厨艺课","virtual_indate":"1473523199","goods_image":"http://yueshi.b0.upaiyun.com/goods/12/2016/09/05/b9f7218d2ef27e17f5a1564dd270ea9a_803.jpg","goods_id":"983","store_id":"12","hint_virtual":"期待下次与您相聚","type_virtual":2,"end_virtual":"活动已结束"},{"goods_name":"熔岩热巧克力蛋糕 厨艺课","virtual_indate":"1473523199","goods_image":"http://yueshi.b0.upaiyun.com/goods/12/2016/09/05/2e275709a09e98d6e82ab478a7eae0d6_518.jpg","goods_id":"984","store_id":"12","hint_virtual":"期待下次与您相聚","type_virtual":2,"end_virtual":"活动已结束"},{"goods_name":"拳王羊腿 厨艺课","virtual_indate":"1470931199","goods_image":"http://resup.b0.upaiyun.com/upload/shop/store/goods/12/12_05241648692176189.jpg","goods_id":"901","store_id":"12","hint_virtual":"期待下次与您相聚","type_virtual":2,"end_virtual":"活动已结束"},{"goods_name":"鲜肉月饼 厨艺课","virtual_indate":"1470931199","goods_image":"http://resup.b0.upaiyun.com/upload/shop/store/goods/12/12_05241703541575858.jpg","goods_id":"903","store_id":"12","hint_virtual":"期待下次与您相聚","type_virtual":2,"end_virtual":"活动已结束"},{"goods_name":"悦食早餐俱乐部","virtual_indate":"1470931199","goods_image":"http://resup.b0.upaiyun.com/upload/shop/store/goods/12/12_05241705976844561.jpg","goods_id":"904","store_id":"12","hint_virtual":"期待下次与您相聚","type_virtual":2,"end_virtual":"活动已结束"}]
         */

        private List<VirtualBean> virtual;

        public static DatasBean objectFromData(String str) {

            return new Gson().fromJson(str, DatasBean.class);
        }

        public void setVirtual(List<VirtualBean> virtual) {
            this.virtual = virtual;
        }

        public List<VirtualBean> getVirtual() {
            return virtual;
        }

        public static class VirtualBean {
            /**
             * goods_name : 【已售罄】 悦食厨艺课之风情暖宴
             * virtual_indate : 1477843199
             * goods_image : http://yueshi.b0.upaiyun.com/goods/12/2016/10/25/8c22f209fdffbba42a774cfe16aa8414_180.jpg
             * goods_id : 1129
             * store_id : 12
             * hint_virtual : 期待下次与您相聚
             * type_virtual : 2
             * end_virtual : 活动已结束
             */

            private String goods_name;
            private String virtual_indate;
            private String goods_image;
            private String goods_id;
            private String store_id;
            private String hint_virtual;
            private int type_virtual;
            private String end_virtual;

            public static VirtualBean objectFromData(String str) {

                return new Gson().fromJson(str, VirtualBean.class);
            }

            public void setGoods_name(String goods_name) {
                this.goods_name = goods_name;
            }

            public void setVirtual_indate(String virtual_indate) {
                this.virtual_indate = virtual_indate;
            }

            public void setGoods_image(String goods_image) {
                this.goods_image = goods_image;
            }

            public void setGoods_id(String goods_id) {
                this.goods_id = goods_id;
            }

            public void setStore_id(String store_id) {
                this.store_id = store_id;
            }

            public void setHint_virtual(String hint_virtual) {
                this.hint_virtual = hint_virtual;
            }

            public void setType_virtual(int type_virtual) {
                this.type_virtual = type_virtual;
            }

            public void setEnd_virtual(String end_virtual) {
                this.end_virtual = end_virtual;
            }

            public String getGoods_name() {
                return goods_name;
            }

            public String getVirtual_indate() {
                return virtual_indate;
            }

            public String getGoods_image() {
                return goods_image;
            }

            public String getGoods_id() {
                return goods_id;
            }

            public String getStore_id() {
                return store_id;
            }

            public String getHint_virtual() {
                return hint_virtual;
            }

            public int getType_virtual() {
                return type_virtual;
            }

            public String getEnd_virtual() {
                return end_virtual;
            }
        }
    }
}
