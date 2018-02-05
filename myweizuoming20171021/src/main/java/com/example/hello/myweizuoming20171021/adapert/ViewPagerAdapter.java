package com.example.hello.myweizuoming20171021.adapert;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.hello.myweizuoming20171021.util.ImageLoaderUtil;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

/**
 * Created by 韦作铭 on 2017/10/21.
 */

public class ViewPagerAdapter extends PagerAdapter {
    Context context;
    List<String> imageUrlList;

    public ViewPagerAdapter(Context context, List<String> imageUrlList) {
        this.context = context;
        this.imageUrlList = imageUrlList;
    }

    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        //1.创建imageView...添加到容器中
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);

        //展示图片
        ImageLoader.getInstance().displayImage(imageUrlList.get(position%imageUrlList.size()),imageView, ImageLoaderUtil.getDefaultOptionyuan());

        //添加
        container.addView(imageView);

        //2.返回当前展示的imageView控件
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
