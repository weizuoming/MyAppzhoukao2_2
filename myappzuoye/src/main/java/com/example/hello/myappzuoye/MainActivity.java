package com.example.hello.myappzuoye;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.hello.myappzuoye.frment.FragmentGridView;
import com.example.hello.myappzuoye.frment.FragmentListView;
import com.example.hello.myappzuoye.frment.FragmentScrollView;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用pullToRefresh进行下拉刷新和上拉加载
 * 1.去github上下载压缩包,解压出来,把library复制出来改名,路径最好不要有中文
 * 2.使用import moundle导进这个库文件,添加库文件的依赖
 * 3.此时左下角可能会报错,只需要点击install...去下载16版本的sdk,还需要下载19版本的buildTools
 *
 * 查看代码可以看到
 *  PullToRefreshListView可以刷新的listView控件....间接继承了LinearLayout,是一个自定义的listView
 *  PullToRefreshGridView可以刷新的GridView控件
 *  PullToRefreshExpandableListView可以刷新的二级列表控件
 *  PullToRefreshScrollView可以刷新的ScrollView控件
 *  PullToRefreshWebView可以刷新的WebView控件
 */
public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private List<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = (TabLayout) findViewById(R.id.tl_tab);
        viewPager = (ViewPager) findViewById(R.id.view_pager);

        list = new ArrayList<>();
        list.add("推荐");
        list.add("热点");
        list.add("北京");
        //1.设置适配器...fragmnePagerAdapter....getChildFragmentManager...getFragmentManager
        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {

            //2.重写方法...返回的是viewPager当前页的标题
            @Override
            public CharSequence getPageTitle(int position) {
                return list.get(position);
            }

            @Override
            public Fragment getItem(int position) {//0...listView,1...gridView,2..scrollView
                Fragment fragment = null;
                switch (position){
                    case 0:
                        fragment = new FragmentListView();
                        break;
                    case 1:
                        fragment = new FragmentGridView();
                        break;
                    case 2:
                        fragment = new FragmentScrollView();
                        break;
                    default:
                        break;
                }


                return fragment;
            }

            @Override
            public int getCount() {
                return list.size();
            }
        });

        //3.tablayout与viewPager关联使用
        tabLayout.setupWithViewPager(viewPager);
    }
}
