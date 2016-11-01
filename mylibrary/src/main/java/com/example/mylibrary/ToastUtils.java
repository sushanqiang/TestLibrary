package com.example.mylibrary;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/11/2.
 */
public class ToastUtils  extends Toast {
    /**
     * Construct an empty Toast object.  You must call {@link #setView} before you
     * can call {@link #show}.
     *
     * @param context The context to use.  Usually your {@link Application}
     *                or {@link Activity} object.
     */
    public ToastUtils(Context context) {
        super(context);
    }
    /**
     * 显示吐司
     *
     * @param context
     * @param str
     */
    public static void showToast(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }
}
