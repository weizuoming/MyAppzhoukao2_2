package com.example.hello.myapprikao15;

import android.app.Application;

/**
 * Created by 韦作铭 on 2017/10/18.
 */

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ImageLoaderUtil.init(this);
    }
}
