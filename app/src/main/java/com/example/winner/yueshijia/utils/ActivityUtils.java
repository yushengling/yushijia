package com.example.winner.yueshijia.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.example.winner.yueshijia.base.BaseActivity;

/**
 * @author ling
 * @version 1.0
 * 2016/11/10 11:53
 */
public class ActivityUtils {
    public static void start(Context c, Class<? extends BaseActivity> clazz, boolean ifFinishSelf) {
        Intent intent = new Intent(c, clazz);
        c.startActivity(intent);
        if (ifFinishSelf) {
            ((Activity) c).finish();
        }
    }
}
