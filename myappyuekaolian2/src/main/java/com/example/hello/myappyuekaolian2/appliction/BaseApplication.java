package com.example.hello.myappyuekaolian2.appliction;

import android.app.Application;

import com.example.hello.myappyuekaolian2.util.ImageLoaderUtil;


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
