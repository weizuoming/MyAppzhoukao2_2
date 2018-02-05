package com.example.hello.myapprikao20171017;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hello.myapprikao20171017.util.ImageLoaderUtil;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

/**
 * Created by 韦作铭 on 2017/10/17.
 */

public class MyAdapert extends BaseAdapter {
    Context ct;
    List<DataDataBean.DataBean> list;
    private int TYTLE_ONLY = 0;//只有文字的形式
    private int IMAGE_LEFT = 1;//表示图片在左边,文字在右边

    public MyAdapert(Context ct, List<DataDataBean.DataBean> list) {
        this.ct = ct;
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
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        if (position%2 == 0){
            return TYTLE_ONLY;
        }else if (position %2==1){
            return IMAGE_LEFT;
        }
        return TYTLE_ONLY;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (getItemViewType(i) == TYTLE_ONLY){
            ImageRightHolder holder;
            if (view == null){
                view = View.inflate(ct, R.layout.item_list,null);
                holder = new ImageRightHolder();

                holder.textView = view.findViewById(R.id.txt_title);
                holder.imageView = view.findViewById(R.id.img);

                view.setTag(holder);
            }else {
                holder = (ImageRightHolder) view.getTag();
            }

            //赋值
            holder.textView.setText(list.get(i).getTitle());

            //显示图片
            ImageLoader.getInstance().displayImage(list.get(i).getImg(),holder.imageView, ImageLoaderUtil.getyuanjiaotupian());


        }else if (getItemViewType(i) == IMAGE_LEFT){
            TitleHolder holder;
            if (view == null){
                view = View.inflate(ct,R.layout.item_list2,null);
                holder = new TitleHolder();
                holder.textView = view.findViewById(R.id.txt_title);

                view.setTag(holder);
            }else {
                holder = (TitleHolder) view.getTag();
            }
            holder.textView.setText(list.get(i).getTitle());
        }


        return view;
    }
    private class TitleHolder{
        TextView textView;
    }

    private class ImageRightHolder{
        TextView textView;
        ImageView imageView;
    }
}
