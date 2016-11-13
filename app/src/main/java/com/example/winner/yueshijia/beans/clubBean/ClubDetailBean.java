package com.example.winner.yueshijia.beans.clubBean;

import com.google.gson.Gson;

/**
 * @author ling
 * @version 1.0
 *          2016/11/12 9:33
 */
public class ClubDetailBean {

    /**
     * code : 200
     * datas : {"article_video":"","article_id":"1015","article_title":"这14首歌，听着听着忍不住就要炖锅好肉","article_image":"http://yueshi.b0.upaiyun.com//cms/2016/11/09/06ea9467fdd48775","article_abstract":"生活要点仪式感","type_id":"2","article_content":"http://interface.yueshichina.com/?act=cms_index&op=article_content&type_id=2&article_id=1015","if_favorites":1}
     */

    private int code;
    private DatasBean datas;

    public static ClubDetailBean objectFromData(String str) {

        return new Gson().fromJson(str, ClubDetailBean.class);
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
         * article_video :
         * article_id : 1015
         * article_title : 这14首歌，听着听着忍不住就要炖锅好肉
         * article_image : http://yueshi.b0.upaiyun.com//cms/2016/11/09/06ea9467fdd48775
         * article_abstract : 生活要点仪式感
         * type_id : 2
         *  : http://interface.yueshichina.com/?act=cms_index&op=article_content&type_id=2&article_id=1015
         * if_favorites : 1
         */

        private String article_video;
        private String article_id;
        private String article_title;
        private String article_image;
        private String article_abstract;
        private String type_id;
        private String article_content;
        private int if_favorites;

        public static DatasBean objectFromData(String str) {

            return new Gson().fromJson(str, DatasBean.class);
        }

        public void setArticle_video(String article_video) {
            this.article_video = article_video;
        }

        public void setArticle_id(String article_id) {
            this.article_id = article_id;
        }

        public void setArticle_title(String article_title) {
            this.article_title = article_title;
        }

        public void setArticle_image(String article_image) {
            this.article_image = article_image;
        }

        public void setArticle_abstract(String article_abstract) {
            this.article_abstract = article_abstract;
        }

        public void setType_id(String type_id) {
            this.type_id = type_id;
        }

        public void setArticle_content(String article_content) {
            this.article_content = article_content;
        }

        public void setIf_favorites(int if_favorites) {
            this.if_favorites = if_favorites;
        }

        public String getArticle_video() {
            return article_video;
        }

        public String getArticle_id() {
            return article_id;
        }

        public String getArticle_title() {
            return article_title;
        }

        public String getArticle_image() {
            return article_image;
        }

        public String getArticle_abstract() {
            return article_abstract;
        }

        public String getType_id() {
            return type_id;
        }

        public String getArticle_content() {
            return article_content;
        }

        public int getIf_favorites() {
            return if_favorites;
        }
    }
}
