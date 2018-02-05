package com.example.hello.myapprikao20171017;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.hello.myapprikao20171017.util.JsonStringCallaBack;
import com.example.hello.myapprikao20171017.util.NetDataUtil;
import com.example.hello.myapprikao20171017.view.XListView;
import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity implements XListView.IXListViewListener {
    private XListView xlv;
    private List<DataDataBean.DataBean> list = new ArrayList<>();
    private MyAdapert myAdapter;

    private int page_num = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        xlv=(XListView)findViewById(R.id.xlv);
        xlv.setPullRefreshEnable(true);
        xlv.setPullLoadEnable(true);
        xlv.setXListViewListener(this);
        getDataFromNet();
    }

    private void getDataFromNet() {

        NetDataUtil.getData(MainActivity.this, "http://www.yulin520.com/a2a/impressApi/news/mergeList?pageSize=5&page=" + page_num, new JsonStringCallaBack() {
            @Override
            public void getJsonString(String json) {
                //在这里解析
                Gson gson = new Gson();

                DataDataBean dataDataBean = gson.fromJson(json, DataDataBean.class);

                list.addAll(dataDataBean.getData());
                Log.d("TAG","+++++++++++++++++++++++"+list);
                //设置适配器
                setAdapter();

                //停止加载
                xlv.stopLoadMore();
            }
        });
    }

    private void setAdapter() {
        if (myAdapter == null) {

            myAdapter = new MyAdapert(MainActivity.this, list);
            xlv.setAdapter(myAdapter);
        } else {
            myAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void onRefresh() {
        getDataRefresh();
    }

    /**
     * 下拉刷新数据的方法
     */
    private void getDataRefresh() {
        //当列表下拉刷新时，接口的页数设置为1，清除原来的列表数据，请求网络

        NetDataUtil.getData(MainActivity.this, "http://www.yulin520.com/a2a/impressApi/news/mergeList?pageSize=5&page=1", new JsonStringCallaBack() {
            @Override
            public void getJsonString(String json) {
                //在这里解析
                Gson gson = new Gson();

                DataDataBean dataDataBean = gson.fromJson(json, DataDataBean.class);
                //先清除所有
                list.clear();
                //再添加
                list.addAll(0, dataDataBean.getData());

                //设置适配器
                setAdapter();

                //停止刷新
                xlv.stopRefresh();
                //设置刷新时间
                String format = new SimpleDateFormat("HH:mm").format(new Date(System.currentTimeMillis()));
                xlv.setRefreshTime(format);
            }
        });
    }

    @Override
    public void onLoadMore() {
        page_num++;
        getDataFromNet();
    }



}
