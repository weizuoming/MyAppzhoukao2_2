package com.example.hello.myweizuoming20171021;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

import com.example.hello.myweizuoming20171021.adapert.MyAdapter;
import com.example.hello.myweizuoming20171021.bean.DataDataBean;
import com.example.hello.myweizuoming20171021.fragment.Fragmenthome;
import com.example.hello.myweizuoming20171021.fragment.Fragmentuser;
import com.example.hello.myweizuoming20171021.fragment.Fragmentxiangfa;
import com.example.hello.myweizuoming20171021.fragment.Fragmentxiazai;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout dl;

    private RelativeLayout rl;
    private List<DataDataBean.ResultsBean> list = new ArrayList<>();

    private MyAdapter myAdapter;
    private int page_num=1;
    private RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = (RadioGroup) findViewById(R.id.radio_group);
        dl = (DrawerLayout) findViewById(R.id.drawer_layout);
        //主内容区域的布局

        //抽屉布局
        rl = (RelativeLayout) findViewById(R.id.drawer_relative);
        ImageView imageView=(ImageView)findViewById(R.id.image_touxiang) ;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dl.closeDrawer(rl);
            }
        });

        //设置点击事件

        //抽屉的监听事件
        dl.setDrawerListener(new DrawerLayout.DrawerListener() {

            /**
             *
             * @param drawerView
             * @param slideOffset 表示的抽屉拖出来的宽度,,像素值
             */
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {

            }

            /**
             * 抽屉打开了
             * @param drawerView
             */
            @Override
            public void onDrawerOpened(View drawerView) {

            }

            /**
             * 抽屉关闭
             * @param drawerView
             */
            @Override
            public void onDrawerClosed(View drawerView) {

            }

            /**
             * 抽屉的状态改变
             *
             * idle -- 表示与导航视图没有交互,静止
             dragging -- 表示目前有与导航视图的交互,拖拽的状态
             settling -- 表示有与导航视图的交互，并且导航视图正在关闭或打开
             * @param newState
             */
            @Override
            public void onDrawerStateChanged(int newState) {
                Log.i("zhaungtai---",newState+"---");
            }
        });
        //默认显示
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,new Fragmenthome()).commit();

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rb1:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,new Fragmenthome()).commit();
                        break;
                    case R.id.rb2:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,new Fragmentxiangfa()).commit();
                        break;
                    case R.id.rb3:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,new Fragmentxiazai()).commit();
                        break;
                    case R.id.rb4:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,new Fragmentuser()).commit();
                        break;
                    default:
                        break;
                }
            }
        });
    }
    }

