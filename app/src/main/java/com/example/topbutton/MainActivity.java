package com.example.topbutton;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.ListFragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private TabLayout.Tab one;
    private TabLayout.Tab two;
    private TabLayout.Tab three;
    private TabLayout.Tab four;


    List<String> mTitle;
    List<Fragment> mFragment;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //将TabLayout与ViewPager绑定在一起
        mTabLayout=(TabLayout)findViewById(R.id.tabLayout);
        mViewPager=(ViewPager)findViewById(R.id.viewPager);


        mTitle=new ArrayList<>();
        mTitle.add("新闻");
        mTitle.add("校园");
        mTitle.add("我的");
        mTitle.add("设置");

        mFragment=new ArrayList<>();
        mFragment.add(new Fragment());
        mFragment.add(new Fragment());
        mFragment.add(new Fragment());
        mFragment.add(new Fragment());



        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                if (position==1){
                    return new Fragment2();
                }else if (position==2){
                    return new Fragment3();
                }else if (position==3){
                    return new Fragment4();
                }
                return new Fragment1();
            }

            @Override
            public int getCount() {
                return mFragment.size();
            }




            @Override
            public CharSequence getPageTitle(int position) {
                return mTitle.get(position);
            }
        });
        mTabLayout.setupWithViewPager(mViewPager);
        mViewPager.setOffscreenPageLimit(2);

        //指定Tab的位置
        one=mTabLayout.getTabAt(0);
        two=mTabLayout.getTabAt(1);
        three=mTabLayout.getTabAt(2);
        four=mTabLayout.getTabAt(3);
        //设置Tab的图标
        one.setIcon(R.mipmap.ic_news_s);
        two.setIcon(R.mipmap.ic_campus_s);
        three.setIcon(R.mipmap.ic_person_s);
        four.setIcon(R.mipmap.ic_more_s);






    }

}
