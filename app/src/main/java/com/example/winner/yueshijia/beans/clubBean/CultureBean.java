package com.example.winner.yueshijia.beans.clubBean;

import com.google.gson.Gson;

import java.util.List;

/**
 * @author ling
 * @version 1.0
 * 2016/11/11 17:15
 */
public class CultureBean {

    /**
     * code : 200
     * hasmore : true
     * page_total : 6
     * datas : {"article_list":[{"article_title":"爆炒是一种Rock的生活态度","article_id":"1021","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/10/3274b36f2d24d5f9","article_publish_time":"1478774549","article_abstract":"为的就是这股热乎的\u201c锅气\u201d","article_origin":"悦食中国","top":"0","video_length":""},{"article_title":"一枚烘山芋的摊贩之光","article_id":"1019","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/09/d97e0a7de1fe5a1d","article_publish_time":"1478689304","article_abstract":"啊，好香","article_origin":"","top":"0","video_length":""},{"article_title":"爱情要像红烧肉下的虎皮蛋","article_id":"1017","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/11/78df400fc06c23c8","article_publish_time":"1478678499","article_abstract":"胜却人间无数","article_origin":"","top":"0","video_length":""},{"article_title":"她画食物，却从不用纸笔","article_id":"1016","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/09/4497fbb456566eb6","article_publish_time":"1478677927","article_abstract":"做一个从不用纸笔的食物造型师","article_origin":"","top":"0","video_length":""},{"article_title":"迷幻少女漫游指南","article_id":"1011","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/08/efb996cde248d17b","article_publish_time":"1478599946","article_abstract":"来，咬一口","article_origin":"","top":"0","video_length":""},{"article_title":"每天吃100g巧克力的大师","article_id":"1004","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/04/9e824d3757a63bc2","article_publish_time":"1478492407","article_abstract":"想跟你谈谈怎么吃巧克力","article_origin":"","top":"0","video_length":""},{"article_title":"女人为什么爱喝酒","article_id":"1005","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/07/9943aeae7cbb2fec","article_publish_time":"1478487407","article_abstract":"喝完这杯，还有三杯","article_origin":"","top":"0","video_length":""},{"article_title":"公园病","article_id":"1009","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/04/0dc1568a631853e0","article_publish_time":"1478257018","article_abstract":"是饥饿的小孩需要补充营养，还是饥饿的自己需要补充儿童时代？","article_origin":"","top":"0","video_length":""},{"article_title":"拍浮酒船中，便足了一生的蟹","article_id":"1001","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/03/2f3071a8e7753a63","article_publish_time":"1478172153","article_abstract":"如今，老梁头爱喝的那碗蟹汤，你我只能在听相声的时候脑补一下了。","article_origin":"","top":"0","video_length":""},{"article_title":"奥黛丽·赫本的厨房里有什么？","article_id":"993","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/02/e3e3aeb984bc9948","article_publish_time":"1478143932","article_abstract":"揭秘赫本私房菜谱","article_origin":"","top":"0","video_length":""}],"qa":"Q&A"}
     */

    private int code;
    private boolean hasmore;
    private int page_total;
    private DatasBean datas;

    public static CultureBean objectFromData(String str) {

        return new Gson().fromJson(str, CultureBean.class);
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
         * article_list : [{"article_title":"爆炒是一种Rock的生活态度","article_id":"1021","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/10/3274b36f2d24d5f9","article_publish_time":"1478774549","article_abstract":"为的就是这股热乎的\u201c锅气\u201d","article_origin":"悦食中国","top":"0","video_length":""},{"article_title":"一枚烘山芋的摊贩之光","article_id":"1019","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/09/d97e0a7de1fe5a1d","article_publish_time":"1478689304","article_abstract":"啊，好香","article_origin":"","top":"0","video_length":""},{"article_title":"爱情要像红烧肉下的虎皮蛋","article_id":"1017","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/11/78df400fc06c23c8","article_publish_time":"1478678499","article_abstract":"胜却人间无数","article_origin":"","top":"0","video_length":""},{"article_title":"她画食物，却从不用纸笔","article_id":"1016","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/09/4497fbb456566eb6","article_publish_time":"1478677927","article_abstract":"做一个从不用纸笔的食物造型师","article_origin":"","top":"0","video_length":""},{"article_title":"迷幻少女漫游指南","article_id":"1011","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/08/efb996cde248d17b","article_publish_time":"1478599946","article_abstract":"来，咬一口","article_origin":"","top":"0","video_length":""},{"article_title":"每天吃100g巧克力的大师","article_id":"1004","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/04/9e824d3757a63bc2","article_publish_time":"1478492407","article_abstract":"想跟你谈谈怎么吃巧克力","article_origin":"","top":"0","video_length":""},{"article_title":"女人为什么爱喝酒","article_id":"1005","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/07/9943aeae7cbb2fec","article_publish_time":"1478487407","article_abstract":"喝完这杯，还有三杯","article_origin":"","top":"0","video_length":""},{"article_title":"公园病","article_id":"1009","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/04/0dc1568a631853e0","article_publish_time":"1478257018","article_abstract":"是饥饿的小孩需要补充营养，还是饥饿的自己需要补充儿童时代？","article_origin":"","top":"0","video_length":""},{"article_title":"拍浮酒船中，便足了一生的蟹","article_id":"1001","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/03/2f3071a8e7753a63","article_publish_time":"1478172153","article_abstract":"如今，老梁头爱喝的那碗蟹汤，你我只能在听相声的时候脑补一下了。","article_origin":"","top":"0","video_length":""},{"article_title":"奥黛丽·赫本的厨房里有什么？","article_id":"993","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/02/e3e3aeb984bc9948","article_publish_time":"1478143932","article_abstract":"揭秘赫本私房菜谱","article_origin":"","top":"0","video_length":""}]
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
             * article_title : 爆炒是一种Rock的生活态度
             * article_id : 1021
             * article_video :
             * article_image : http://yueshi.b0.upaiyun.com/cms/2016/11/10/3274b36f2d24d5f9
             * article_publish_time : 1478774549
             * article_abstract : 为的就是这股热乎的“锅气”
             * article_origin : 悦食中国
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
