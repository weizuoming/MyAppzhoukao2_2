package com.example.hello.myweizuoming20171021.dao;

import android.app.Application;

import com.example.hello.myweizuoming20171021.util.ImageLoaderUtil;

/**
 * Created by 韦作铭 on 2017/10/21.
 */

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ImageLoaderUtil.init(this);
    }
}
