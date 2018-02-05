package com.example.hello.myappzuoye.util;

import android.app.Application;

/**
 * Created by 韦作铭 on 2017/10/18.
 */

public class BaseApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();

        //初始化
        ImageLoaderUtil.init(this);
    }
}
