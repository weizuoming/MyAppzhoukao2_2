package com.example.hello.myapprikao20171017;

import android.app.Application;

import com.example.hello.myapprikao20171017.util.ImageLoaderUtil;

/**
 * Created by 韦作铭 on 2017/10/17.
 */

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ImageLoaderUtil.init(this);
    }
}
