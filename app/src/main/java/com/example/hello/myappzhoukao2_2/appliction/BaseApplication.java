package com.example.hello.myappzhoukao2_2.appliction;

import android.app.Application;

import com.example.hello.myappzhoukao2_2.util.ImageLoaderUtil;

/**
 * Created by 韦作铭 on 2017/10/16.
 */

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ImageLoaderUtil.init(this);
    }
}
