package com.example.hello.myweizuoming20171021.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hello.myweizuoming20171021.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 韦作铭 on 2017/10/21.
 */

public class Fragmenthome extends Fragment {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private List<String> list;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_frame_view,container,false);
        tabLayout = view.findViewById(R.id.tab);
        viewPager =view.findViewById(R.id.view_pager);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        list = new ArrayList<>();
        list.add("推荐");
        list.add("课程");
        list.add("实战");
        list.add("职业路径");



        //设置适配器
        viewPager.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()) {
            @Override
            public CharSequence getPageTitle(int position) {

                return list.get(position);
            }

            @Override
            public Fragment getItem(int position) {
                Fragment fragment = null;

                switch (position) {
                    case 0:
                        fragment = new Fragmenttuijian();
                        break;
                    case 1:
                        fragment = new Fragmentkecheng();
                        break;
                    case 2:
                        fragment = new Fragmentshizhan();
                        break;
                    case 3:
                        fragment = new Fragmentzhiyelujing();
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

        //关联
        tabLayout.setupWithViewPager(viewPager);
    }


}
