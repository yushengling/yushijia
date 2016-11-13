package com.example.winner.yueshijia.beans.clubBean;

import com.google.gson.Gson;

import java.util.List;

/**
 * @author ling
 * @version 1.0
 *  2016/11/11 16:05
 */
public class KnowledgeBean {

    /**
     * code : 200
     * hasmore : true
     * page_total : 4
     * datas : {"article_list":[{"article_title":"陷入馅儿的世界","article_id":"1020","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/09/57f84f659c9b820b","article_publish_time":"1478689738","article_abstract":"应该就很难自拔吧","article_origin":"","top":"0","video_length":""},{"article_title":"你和大师之间，就隔着这么一块香草银鳕鱼","article_id":"1018","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/09/7bd6dab8967a749f","article_publish_time":"1478688789","article_abstract":"学着下个厨","article_origin":"","top":"0","video_length":""},{"article_title":"立冬一道菜","article_id":"1008","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/04/60f0f8101e0425bf","article_publish_time":"1478478697","article_abstract":"吃个辣子燃起来","article_origin":"","top":"0","video_length":""},{"article_title":"收一个好南瓜","article_id":"991","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/02/46b5d165ea77ec0c","article_publish_time":"1478135491","article_abstract":"炖一锅花式奶油汤","article_origin":"","top":"0","video_length":""},{"article_title":"天气转凉，提前吃羊","article_id":"990","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/02/812d6267b78c9714","article_publish_time":"1478135150","article_abstract":"附肥瘦相宜吃羊地图","article_origin":"","top":"0","video_length":""},{"article_title":"谁再说欧洲人不吃内脏，牛肚包第一个跟你急","article_id":"999","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/02/24ddebe7a76bb338","article_publish_time":"1478085354","article_abstract":"牛肚包这种街头小吃才更下得了嘴","article_origin":"悦食中国","top":"0","video_length":""},{"article_title":"暗藏心机，谁家头等舱的酒最廉价？","article_id":"974","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/10/24/5bf292f2cafbe7ea","article_publish_time":"1478064079","article_abstract":"我们来看看在机上喝几瓶才能值回票价","article_origin":"","top":"0","video_length":""},{"article_title":"再顶级挑剔的成都人，也会念叨着冒菜","article_id":"985","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/10/26/8ccd5a2ff3aac704","article_publish_time":"1477544604","article_abstract":"\u201c下次可以少点两块钱的，吃撑了都没吃完。\u201d　","article_origin":"悦食中国","top":"0","video_length":""},{"article_title":"如何用偏见分裂欧洲的20种方法","article_id":"976","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/10/24/825102d282eaed92","article_publish_time":"1477302440","article_abstract":"调侃一下欧洲各国各种stereotype和历史中的荒诞","article_origin":"","top":"0","video_length":""},{"article_title":"为什么你总爱给食物拍照","article_id":"967","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/10/24/2280f173940c69f0","article_publish_time":"1477294613","article_abstract":"用餐前拍照已经快成为一种代替祷告的新宗教仪式了","article_origin":"","top":"0","video_length":""}],"qa":"Q&A"}
     */

    private int code;
    private boolean hasmore;
    private int page_total;
    private DatasBean datas;

    public static KnowledgeBean objectFromData(String str) {

        return new Gson().fromJson(str, KnowledgeBean.class);
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
         * article_list : [{"article_title":"陷入馅儿的世界","article_id":"1020","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/09/57f84f659c9b820b","article_publish_time":"1478689738","article_abstract":"应该就很难自拔吧","article_origin":"","top":"0","video_length":""},{"article_title":"你和大师之间，就隔着这么一块香草银鳕鱼","article_id":"1018","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/09/7bd6dab8967a749f","article_publish_time":"1478688789","article_abstract":"学着下个厨","article_origin":"","top":"0","video_length":""},{"article_title":"立冬一道菜","article_id":"1008","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/04/60f0f8101e0425bf","article_publish_time":"1478478697","article_abstract":"吃个辣子燃起来","article_origin":"","top":"0","video_length":""},{"article_title":"收一个好南瓜","article_id":"991","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/02/46b5d165ea77ec0c","article_publish_time":"1478135491","article_abstract":"炖一锅花式奶油汤","article_origin":"","top":"0","video_length":""},{"article_title":"天气转凉，提前吃羊","article_id":"990","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/02/812d6267b78c9714","article_publish_time":"1478135150","article_abstract":"附肥瘦相宜吃羊地图","article_origin":"","top":"0","video_length":""},{"article_title":"谁再说欧洲人不吃内脏，牛肚包第一个跟你急","article_id":"999","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/02/24ddebe7a76bb338","article_publish_time":"1478085354","article_abstract":"牛肚包这种街头小吃才更下得了嘴","article_origin":"悦食中国","top":"0","video_length":""},{"article_title":"暗藏心机，谁家头等舱的酒最廉价？","article_id":"974","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/10/24/5bf292f2cafbe7ea","article_publish_time":"1478064079","article_abstract":"我们来看看在机上喝几瓶才能值回票价","article_origin":"","top":"0","video_length":""},{"article_title":"再顶级挑剔的成都人，也会念叨着冒菜","article_id":"985","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/10/26/8ccd5a2ff3aac704","article_publish_time":"1477544604","article_abstract":"\u201c下次可以少点两块钱的，吃撑了都没吃完。\u201d　","article_origin":"悦食中国","top":"0","video_length":""},{"article_title":"如何用偏见分裂欧洲的20种方法","article_id":"976","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/10/24/825102d282eaed92","article_publish_time":"1477302440","article_abstract":"调侃一下欧洲各国各种stereotype和历史中的荒诞","article_origin":"","top":"0","video_length":""},{"article_title":"为什么你总爱给食物拍照","article_id":"967","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/10/24/2280f173940c69f0","article_publish_time":"1477294613","article_abstract":"用餐前拍照已经快成为一种代替祷告的新宗教仪式了","article_origin":"","top":"0","video_length":""}]
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
             * article_title : 陷入馅儿的世界
             * article_id : 1020
             * article_video :
             * article_image : http://yueshi.b0.upaiyun.com/cms/2016/11/09/57f84f659c9b820b
             * article_publish_time : 1478689738
             * article_abstract : 应该就很难自拔吧
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
