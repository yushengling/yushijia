package com.example.winner.yueshijia.beans.clubBean;

import com.google.gson.Gson;

import java.util.List;

/**
 * @author ling
 * @version 1.0
 * 2016/11/11 10:54
 */
public class TopBean {

    /**
     * code : 200
     * datas : {"article_list":[{"article_abstract":"生活要点仪式感","article_id":"1015","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/09/06ea9467fdd48775","article_origin":"悦食中国","article_publish_time":"1478676273","article_title":"这14首歌，听着听着忍不住就要炖锅好肉","article_video":"","top":"14","video_length":""},{"article_abstract":"在巴黎迎接黎明","article_id":"1014","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/09/06375432db05b5a9","article_origin":"悦食中国","article_publish_time":"1478676023","article_title":"用这6家面包房的香气叫醒你","article_video":"","top":"6","video_length":""},{"article_abstract":"和影帝飙饭","article_id":"1010","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/07/824f1673bac3b741","article_origin":"所有的乡愁都是因为馋","article_publish_time":"1478515675","article_title":"做个电影里的路人甲，你们爱着我吃着","article_video":"","top":"6","video_length":""},{"article_abstract":"让你绝无起床气","article_id":"1006","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/04/39e658140c39295a","article_origin":"克勒kk","article_publish_time":"1478493412","article_title":"如何挑选一只完美多士炉","article_video":"","top":"7","video_length":""},{"article_abstract":"最高度啤酒排行","article_id":"1003","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/04/d8ea844ef06e271a","article_origin":"悦食中国","article_publish_time":"1478493400","article_title":"你想试试30度往上的啤酒吗","article_video":"","top":"10","video_length":""},{"article_abstract":"\u201c不务正业\u201d的资生堂","article_id":"998","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/02/c86db9b474db2b3b","article_origin":"悦食中国","article_publish_time":"1478493390","article_title":"资生堂竟然还开餐厅？妇女之友就要从脸照顾到胃","article_video":"","top":"7","video_length":""},{"article_abstract":"吃到半酣喝到微醉","article_id":"978","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/10/21/3c204f572b7171fb","article_origin":"悦食中国","article_publish_time":"1478238693","article_title":"必须吃好一点，不然没办法过冬","article_video":"","top":"10","video_length":""},{"article_abstract":"捧着暖手也不错","article_id":"989","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/02/8b6c54332a69fe32","article_origin":"悦食中国","article_publish_time":"1478135096","article_title":"5款热巧学到位","article_video":"","top":"5","video_length":""},{"article_abstract":"你选哪一碗","article_id":"995","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/02/cd1e66a3fab1116f","article_origin":"悦食中国","article_publish_time":"1478134958","article_title":"辣椒遇上8碗面","article_video":"","top":"8","video_length":""},{"article_abstract":"吃块点心迎秋冬","article_id":"953","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/10/13/ae9deee5677f3998","article_origin":"悦食中国","article_publish_time":"1478064103","article_title":"我要为老北京点心打抱不平","article_video":"","top":"9","video_length":""}],"qa":"Q&A"}
     * hasmore : true
     * page_total : 4
     */

    private int code;
    private DatasBean datas;
    private boolean hasmore;
    private int page_total;

    public static TopBean objectFromData(String str) {

        return new Gson().fromJson(str, TopBean.class);
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setDatas(DatasBean datas) {
        this.datas = datas;
    }

    public void setHasmore(boolean hasmore) {
        this.hasmore = hasmore;
    }

    public void setPage_total(int page_total) {
        this.page_total = page_total;
    }

    public int getCode() {
        return code;
    }

    public DatasBean getDatas() {
        return datas;
    }

    public boolean getHasmore() {
        return hasmore;
    }

    public int getPage_total() {
        return page_total;
    }

    public static class DatasBean {
        /**
         * article_list : [{"article_abstract":"生活要点仪式感","article_id":"1015","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/09/06ea9467fdd48775","article_origin":"悦食中国","article_publish_time":"1478676273","article_title":"这14首歌，听着听着忍不住就要炖锅好肉","article_video":"","top":"14","video_length":""},{"article_abstract":"在巴黎迎接黎明","article_id":"1014","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/09/06375432db05b5a9","article_origin":"悦食中国","article_publish_time":"1478676023","article_title":"用这6家面包房的香气叫醒你","article_video":"","top":"6","video_length":""},{"article_abstract":"和影帝飙饭","article_id":"1010","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/07/824f1673bac3b741","article_origin":"所有的乡愁都是因为馋","article_publish_time":"1478515675","article_title":"做个电影里的路人甲，你们爱着我吃着","article_video":"","top":"6","video_length":""},{"article_abstract":"让你绝无起床气","article_id":"1006","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/04/39e658140c39295a","article_origin":"克勒kk","article_publish_time":"1478493412","article_title":"如何挑选一只完美多士炉","article_video":"","top":"7","video_length":""},{"article_abstract":"最高度啤酒排行","article_id":"1003","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/04/d8ea844ef06e271a","article_origin":"悦食中国","article_publish_time":"1478493400","article_title":"你想试试30度往上的啤酒吗","article_video":"","top":"10","video_length":""},{"article_abstract":"\u201c不务正业\u201d的资生堂","article_id":"998","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/02/c86db9b474db2b3b","article_origin":"悦食中国","article_publish_time":"1478493390","article_title":"资生堂竟然还开餐厅？妇女之友就要从脸照顾到胃","article_video":"","top":"7","video_length":""},{"article_abstract":"吃到半酣喝到微醉","article_id":"978","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/10/21/3c204f572b7171fb","article_origin":"悦食中国","article_publish_time":"1478238693","article_title":"必须吃好一点，不然没办法过冬","article_video":"","top":"10","video_length":""},{"article_abstract":"捧着暖手也不错","article_id":"989","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/02/8b6c54332a69fe32","article_origin":"悦食中国","article_publish_time":"1478135096","article_title":"5款热巧学到位","article_video":"","top":"5","video_length":""},{"article_abstract":"你选哪一碗","article_id":"995","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/11/02/cd1e66a3fab1116f","article_origin":"悦食中国","article_publish_time":"1478134958","article_title":"辣椒遇上8碗面","article_video":"","top":"8","video_length":""},{"article_abstract":"吃块点心迎秋冬","article_id":"953","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/10/13/ae9deee5677f3998","article_origin":"悦食中国","article_publish_time":"1478064103","article_title":"我要为老北京点心打抱不平","article_video":"","top":"9","video_length":""}]
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
             * article_abstract : 生活要点仪式感
             * article_id : 1015
             * article_image : http://yueshi.b0.upaiyun.com/cms/2016/11/09/06ea9467fdd48775
             * article_origin : 悦食中国
             * article_publish_time : 1478676273
             * article_title : 这14首歌，听着听着忍不住就要炖锅好肉
             * article_video :
             * top : 14
             * video_length :
             */

            private String article_abstract;
            private String article_id;
            private String article_image;
            private String article_origin;
            private String article_publish_time;
            private String article_title;
            private String article_video;
            private String top;
            private String video_length;

            public static ArticleListBean objectFromData(String str) {

                return new Gson().fromJson(str, ArticleListBean.class);
            }

            public void setArticle_abstract(String article_abstract) {
                this.article_abstract = article_abstract;
            }

            public void setArticle_id(String article_id) {
                this.article_id = article_id;
            }

            public void setArticle_image(String article_image) {
                this.article_image = article_image;
            }

            public void setArticle_origin(String article_origin) {
                this.article_origin = article_origin;
            }

            public void setArticle_publish_time(String article_publish_time) {
                this.article_publish_time = article_publish_time;
            }

            public void setArticle_title(String article_title) {
                this.article_title = article_title;
            }

            public void setArticle_video(String article_video) {
                this.article_video = article_video;
            }

            public void setTop(String top) {
                this.top = top;
            }

            public void setVideo_length(String video_length) {
                this.video_length = video_length;
            }

            public String getArticle_abstract() {
                return article_abstract;
            }

            public String getArticle_id() {
                return article_id;
            }

            public String getArticle_image() {
                return article_image;
            }

            public String getArticle_origin() {
                return article_origin;
            }

            public String getArticle_publish_time() {
                return article_publish_time;
            }

            public String getArticle_title() {
                return article_title;
            }

            public String getArticle_video() {
                return article_video;
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
