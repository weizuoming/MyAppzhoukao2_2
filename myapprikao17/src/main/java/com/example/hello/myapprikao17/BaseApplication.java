package com.example.hello.myapprikao17;

import android.app.Application;

/**
 * Created by 韦作铭 on 2017/10/20.
 */

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //初始化
        ImageLoaderUtil.init(this);
    }
}
