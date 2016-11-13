package com.example.winner.yueshijia.beans.splash;

import com.google.gson.Gson;

/**
 * @author ling
 * @version 1.0
 *          2016/11/10 13:07
 */
public class SplashBean {
    /**
     * code : 200
     * datas : {"advertId":"156","advertTitle":"双十一","advertImg":"http://yueshi.b0.upaiyun.com/adv/2016/11/09/a85a44ec14afa48f7195cabc50e40620_944.jpg","advertText":"","advertUrl":"","advertVideoUrl":null,"videoShareUrl":"http://api.yueshichina.com/html/share/videoDisplay.htm","isMark":0}
     */

    private int code;
    private DatasBean datas;

    public static SplashBean objectFromData(String str) {

        return new Gson().fromJson(str, SplashBean.class);
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
         * advertId : 156
         * advertTitle : 双十一
         * advertImg : http://yueshi.b0.upaiyun.com/adv/2016/11/09/a85a44ec14afa48f7195cabc50e40620_944.jpg
         * advertText :
         * advertUrl :
         * advertVideoUrl : null
         * videoShareUrl : http://api.yueshichina.com/html/share/videoDisplay.htm
         * isMark : 0
         */

        private String advertId;
        private String advertTitle;
        private String advertImg;
        private String advertText;
        private String advertUrl;
        private Object advertVideoUrl;
        private String videoShareUrl;
        private int isMark;

        public static DatasBean objectFromData(String str) {

            return new Gson().fromJson(str, DatasBean.class);
        }

        public void setAdvertId(String advertId) {
            this.advertId = advertId;
        }

        public void setAdvertTitle(String advertTitle) {
            this.advertTitle = advertTitle;
        }

        public void setAdvertImg(String advertImg) {
            this.advertImg = advertImg;
        }

        public void setAdvertText(String advertText) {
            this.advertText = advertText;
        }

        public void setAdvertUrl(String advertUrl) {
            this.advertUrl = advertUrl;
        }

        public void setAdvertVideoUrl(Object advertVideoUrl) {
            this.advertVideoUrl = advertVideoUrl;
        }

        public void setVideoShareUrl(String videoShareUrl) {
            this.videoShareUrl = videoShareUrl;
        }

        public void setIsMark(int isMark) {
            this.isMark = isMark;
        }

        public String getAdvertId() {
            return advertId;
        }

        public String getAdvertTitle() {
            return advertTitle;
        }

        public String getAdvertImg() {
            return advertImg;
        }

        public String getAdvertText() {
            return advertText;
        }

        public String getAdvertUrl() {
            return advertUrl;
        }

        public Object getAdvertVideoUrl() {
            return advertVideoUrl;
        }

        public String getVideoShareUrl() {
            return videoShareUrl;
        }

        public int getIsMark() {
            return isMark;
        }
    }

    /**
     * advertImg : http://yueshi.b0.upaiyun.com/adv/2016/11/09/a85a44ec14afa48f7195cabc50e40620_944.jpg
     */

//    private String advertImg;
//    private int code ;
//
//    public String getAdvertImg() {
//        return advertImg;
//    }
//
//    public void setAdvertImg(String advertImg) {
//        this.advertImg = advertImg;
//    }
//
//    public int getCode() {
//        return code;
//    }
//
//    public void setCode(int code) {
//        this.code = code;
//    }


}
