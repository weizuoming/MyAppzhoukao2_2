package com.example.hello.myapprikao15;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    private List<DataDataBean.ResultBean.DataBean> list = new ArrayList<>();
    private MyAdapter myAdapter;
    private int page_num = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView)findViewById(R.id.lv);
        getDataFromNet();
    }
    private void getDataFromNet() {

        NetDataUtil.getData(MainActivity.this, "http://v.juhe.cn/toutiao/index?type=top&key=dbedecbcd1899c9785b95cc2d17131c5" , new JsonStringCallaBack() {
            @Override
            public void getJsonString(String json) {
                //在这里解析
                Gson gson = new Gson();

                DataDataBean dataDataBean = gson.fromJson(json, DataDataBean.class);

                list.addAll(dataDataBean.getResult().getData());
//                 list=dataDataBean.getResult().getData();
                //设置适配器
                myAdapter = new MyAdapter(MainActivity.this, list);
                lv.setAdapter(myAdapter);

                //停止加载

            }
        });
    }

    private void setAdapter() {
        if (myAdapter == null) {

            myAdapter = new MyAdapter(MainActivity.this, list);
            lv.setAdapter(myAdapter);
        } else {
            myAdapter.notifyDataSetChanged();
        }
    }
}
