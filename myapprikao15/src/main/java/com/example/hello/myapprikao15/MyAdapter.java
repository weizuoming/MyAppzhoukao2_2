package com.example.hello.myapprikao15;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

/**
 * Created by 韦作铭 on 2017/10/18.
 */

public class MyAdapter extends BaseAdapter{
    Context context;
    List<DataDataBean.ResultBean.DataBean> list;

    public MyAdapter(Context context, List<DataDataBean.ResultBean.DataBean> list) {
        this.context = context;
        this.list = list;
    }


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
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageHolder holder;
        if (view == null){
            view = View.inflate(context, R.layout.item_list,null);
            holder = new ImageHolder();

            holder.textView = view.findViewById(R.id.txt_title);
            holder.imageView = view.findViewById(R.id.img);

            view.setTag(holder);

        }else {
            holder = (ImageHolder) view.getTag();
        }

        holder.textView.setText(list.get(i).getTitle());
        //图片
//        Log.i("----",list.get(i).getImages().get(0)+"?imageView2/0/w/100");
        ImageLoader.getInstance().displayImage(list.get(i).getThumbnail_pic_s(),holder.imageView, ImageLoaderUtil.gettupianyuanjiao());


        return view;
    }
     class ImageHolder{
    TextView textView;
    ImageView imageView;
    }
}
