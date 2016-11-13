package com.example.winner.yueshijia.beans.myorder;

/**
 * @author seventoto
 * @time 2016/11/13  15:04
 * @desc ${TODD}
 */

public class ROrderResult {
    private int code;
    private OrderDatas datas;
    private boolean hasmore;
    private int page_total;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public OrderDatas getDatas() {
        return datas;
    }

    public void setDatas(OrderDatas datas) {
        this.datas = datas;
    }

    public boolean isHasmore() {
        return hasmore;
    }

    public void setHasmore(boolean hasmore) {
        this.hasmore = hasmore;
    }

    public int getPage_total() {
        return page_total;
    }

    public void setPage_total(int page_total) {
        this.page_total = page_total;
    }
}
