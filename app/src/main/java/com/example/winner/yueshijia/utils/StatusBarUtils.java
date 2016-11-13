package com.example.winner.yueshijia.utils;

import android.content.Context;

/**
 * @author seventoto
 * @time 2016/11/12  13:44
 * @desc ${TODD}
 */

public class StatusBarUtils {
    /**
     * 获取状态栏高度
     */
    public static int getStatusHeight(Context context) {

        int statusHeight = -1;
        try {
            Class clazz = Class.forName("com.android.internal.R$dimen");
            Object object = clazz.newInstance();
            int height = Integer.parseInt(clazz.getField("status_bar_height")
                    .get(object).toString());
            statusHeight = context.getResources().getDimensionPixelSize(height);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return statusHeight;
    }
}
