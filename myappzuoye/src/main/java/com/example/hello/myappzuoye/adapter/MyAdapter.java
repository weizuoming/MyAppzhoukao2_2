package com.example.hello.myappzuoye.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hello.myappzuoye.R;
import com.example.hello.myappzuoye.bean.DataDataBean;
import com.example.hello.myappzuoye.util.ImageLoaderUtil;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

/**
 * Created by 韦作铭 on 2017/10/18.
 */

public class MyAdapter extends BaseAdapter {
    Context context;
    List<DataDataBean.ResultsBean> list;
    public MyAdapter(Context context, List<DataDataBean.ResultsBean> list) {
        this.context = context;
        this.list = list;
    }
    private int TEXT_ONLY = 0;
    private int IMAGE_TEXT = 1;
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        if (list.get(position).getImages() != null){
            return IMAGE_TEXT;
        }

        return TEXT_ONLY;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (getItemViewType(i) == TEXT_ONLY){
            TextHolder holder;
            if (view == null){
                view = View.inflate(context, R.layout.item_text_layout,null);
                holder = new TextHolder();

                holder.textView = view.findViewById(R.id.text_title);

                view.setTag(holder);

            }else {
                holder = (TextHolder) view.getTag();
            }

            holder.textView.setText(list.get(i).getDesc());

        }else if (getItemViewType(i)==IMAGE_TEXT){

            ImageHolder holder;
            if (view == null){
                view = View.inflate(context, R.layout.item_img_layout,null);
                holder = new ImageHolder();

                holder.textView = view.findViewById(R.id.text_title);
                holder.imageView = view.findViewById(R.id.image_view);

                view.setTag(holder);

            }else {
                holder = (ImageHolder) view.getTag();
            }


            //图片
            holder.textView.setText(list.get(i).getDesc());
            ImageLoader.getInstance().displayImage(list.get(i).getImages().get(0),holder.imageView, ImageLoaderUtil.gettupianyuanjiao());

        }

        return view;
    }

    private class TextHolder{
        TextView textView;
    }

    private class ImageHolder{
        TextView textView;
        ImageView imageView;
    }
}
