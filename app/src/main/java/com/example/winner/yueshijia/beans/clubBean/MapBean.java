package com.example.winner.yueshijia.beans.clubBean;

import com.google.gson.Gson;

import java.util.List;

/**
 * @author ling
 * @version 1.0
 * 2016/11/11 17:15
 */
public class MapBean {


    /**
     * code : 200
     * hasmore : true
     * page_total : 11
     * datas : {"article_list":[{"article_title":"中国·河南","article_id":"1013","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/09/378155cb93108cd4","article_publish_time":"1478674322","article_abstract":"早起喝胡辣汤的时候, 什么都不想","article_origin":"","top":"0","video_length":""},{"article_title":"日本·东京","article_id":"1012","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/08/a423a86f0ace48a0","article_publish_time":"1478600646","article_abstract":"新宿Cafe AALIYA的法式吐司","article_origin":"","top":"0","video_length":""},{"article_title":"陕西·西安","article_id":"1002","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/04/1f321778b6e97b0e","article_publish_time":"1478478535","article_abstract":"寻味稠酒与泡馍","article_origin":"","top":"0","video_length":""},{"article_title":"日本·东京","article_id":"1007","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/04/4064a0735a5da723","article_publish_time":"1478478511","article_abstract":"扇屋釜烧玉子","article_origin":"","top":"0","video_length":""},{"article_title":"中国·上海","article_id":"981","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/10/25/65ba2e5c7c5fedd6","article_publish_time":"1478135415","article_abstract":"下沙德持烧卖","article_origin":"","top":"0","video_length":""},{"article_title":"中国·重庆","article_id":"992","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/02/2f264ecfae73ed99","article_publish_time":"1478135051","article_abstract":"可以烫火锅的夏麻花","article_origin":"","top":"0","video_length":""},{"article_title":"法国·巴黎","article_id":"965","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/10/19/b5afe12f8844ea54","article_publish_time":"1478064039","article_abstract":"请递给我一个又矮又胖的玛德琳蛋糕","article_origin":"","top":"0","video_length":""},{"article_title":"中国·香港","article_id":"969","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/10/21/edc41f2dcfc0b4f2","article_publish_time":"1477270807","article_abstract":"金华冰厅菠萝油","article_origin":"","top":"0","video_length":""},{"article_title":"德国·纽伦堡","article_id":"970","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/10/21/555c1c04cf4554b3","article_publish_time":"1477270776","article_abstract":"盛装打扮的Schmidt蜂蜜姜饼","article_origin":"","top":"0","video_length":""},{"article_title":"贵州·贵阳","article_id":"966","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/10/20/a665c3b9cf4237e1","article_publish_time":"1476936948","article_abstract":"一碗让你\u201c旺\u201d起来的面","article_origin":"","top":"0","video_length":""}],"qa":"Q&A"}
     */

    private int code;
    private boolean hasmore;
    private int page_total;
    private DatasBean datas;

    public static MapBean objectFromData(String str) {

        return new Gson().fromJson(str, MapBean.class);
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setHasmore(boolean hasmore) {
        this.hasmore = hasmore;
    }

    public void setPage_total(int page_total) {
        this.page_total = page_total;
    }

    public void setDatas(DatasBean datas) {
        this.datas = datas;
    }

    public int getCode() {
        return code;
    }

    public boolean getHasmore() {
        return hasmore;
    }

    public int getPage_total() {
        return page_total;
    }

    public DatasBean getDatas() {
        return datas;
    }

    public static class DatasBean {
        /**
         * article_list : [{"article_title":"中国·河南","article_id":"1013","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/09/378155cb93108cd4","article_publish_time":"1478674322","article_abstract":"早起喝胡辣汤的时候, 什么都不想","article_origin":"","top":"0","video_length":""},{"article_title":"日本·东京","article_id":"1012","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/08/a423a86f0ace48a0","article_publish_time":"1478600646","article_abstract":"新宿Cafe AALIYA的法式吐司","article_origin":"","top":"0","video_length":""},{"article_title":"陕西·西安","article_id":"1002","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/04/1f321778b6e97b0e","article_publish_time":"1478478535","article_abstract":"寻味稠酒与泡馍","article_origin":"","top":"0","video_length":""},{"article_title":"日本·东京","article_id":"1007","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/04/4064a0735a5da723","article_publish_time":"1478478511","article_abstract":"扇屋釜烧玉子","article_origin":"","top":"0","video_length":""},{"article_title":"中国·上海","article_id":"981","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/10/25/65ba2e5c7c5fedd6","article_publish_time":"1478135415","article_abstract":"下沙德持烧卖","article_origin":"","top":"0","video_length":""},{"article_title":"中国·重庆","article_id":"992","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/02/2f264ecfae73ed99","article_publish_time":"1478135051","article_abstract":"可以烫火锅的夏麻花","article_origin":"","top":"0","video_length":""},{"article_title":"法国·巴黎","article_id":"965","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/10/19/b5afe12f8844ea54","article_publish_time":"1478064039","article_abstract":"请递给我一个又矮又胖的玛德琳蛋糕","article_origin":"","top":"0","video_length":""},{"article_title":"中国·香港","article_id":"969","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/10/21/edc41f2dcfc0b4f2","article_publish_time":"1477270807","article_abstract":"金华冰厅菠萝油","article_origin":"","top":"0","video_length":""},{"article_title":"德国·纽伦堡","article_id":"970","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/10/21/555c1c04cf4554b3","article_publish_time":"1477270776","article_abstract":"盛装打扮的Schmidt蜂蜜姜饼","article_origin":"","top":"0","video_length":""},{"article_title":"贵州·贵阳","article_id":"966","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/10/20/a665c3b9cf4237e1","article_publish_time":"1476936948","article_abstract":"一碗让你\u201c旺\u201d起来的面","article_origin":"","top":"0","video_length":""}]
         * qa : Q&A
         */

        private String qa;
        private List<ArticleListBean> article_list;

        public static DatasBean objectFromData(String str) {

            return new Gson().fromJson(str, DatasBean.class);
        }

        public void setQa(String qa) {
            this.qa = qa;
        }

        public void setArticle_list(List<ArticleListBean> article_list) {
            this.article_list = article_list;
        }

        public String getQa() {
            return qa;
        }

        public List<ArticleListBean> getArticle_list() {
            return article_list;
        }

        public static class ArticleListBean {
            /**
             * article_title : 中国·河南
             * article_id : 1013
             * article_video :
             * article_image : http://yueshi.b0.upaiyun.com/cms/2016/11/09/378155cb93108cd4
             * article_publish_time : 1478674322
             * article_abstract : 早起喝胡辣汤的时候, 什么都不想
             * article_origin :
             * top : 0
             * video_length :
             */

            private String article_title;
            private String article_id;
            private String article_video;
            private String article_image;
            private String article_publish_time;
            private String article_abstract;
            private String article_origin;
            private String top;
            private String video_length;

            public static ArticleListBean objectFromData(String str) {

                return new Gson().fromJson(str, ArticleListBean.class);
            }

            public void setArticle_title(String article_title) {
                this.article_title = article_title;
            }

            public void setArticle_id(String article_id) {
                this.article_id = article_id;
            }

            public void setArticle_video(String article_video) {
                this.article_video = article_video;
            }

            public void setArticle_image(String article_image) {
                this.article_image = article_image;
            }

            public void setArticle_publish_time(String article_publish_time) {
                this.article_publish_time = article_publish_time;
            }

            public void setArticle_abstract(String article_abstract) {
                this.article_abstract = article_abstract;
            }

            public void setArticle_origin(String article_origin) {
                this.article_origin = article_origin;
            }

            public void setTop(String top) {
                this.top = top;
            }

            public void setVideo_length(String video_length) {
                this.video_length = video_length;
            }

            public String getArticle_title() {
                return article_title;
            }

            public String getArticle_id() {
                return article_id;
            }

            public String getArticle_video() {
                return article_video;
            }

            public String getArticle_image() {
                return article_image;
            }

            public String getArticle_publish_time() {
                return article_publish_time;
            }

            public String getArticle_abstract() {
                return article_abstract;
            }

            public String getArticle_origin() {
                return article_origin;
            }

            public String getTop() {
                return top;
            }

            public String getVideo_length() {
                return video_length;
            }
        }
    }
}
