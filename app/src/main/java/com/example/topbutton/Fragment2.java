package com.example.topbutton;

import android.content.Intent;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Fragment2 extends Fragment {
    private ImageView gongimg;
    private View mView;
    private ViewPager mViewPaper;
    private List<ImageView> images;
    private List<View> dots;
    private int currentItem;
    //记录上一次点的位置
    private int oldPosition = 0;
    //存放图片的id，可以根据自己的需求进行修改
    private int[] imageIds = new int[]{
            R.drawable.school,
            R.drawable.scoool1,
            R.drawable.scool2
    };
    //存放图片的标题
    private String[] titles = new String[]{
            "轮播1",
            "轮播2",
            "轮播3"
    };
    private ViewPagerAdapter adapter;
    private ScheduledExecutorService scheduledExecutorService;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView=inflater.inflate(R.layout.activity_fragment2,null);
//        Button btn1=(Button)view.findViewById(R.id.btn1);
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(getActivity(),orther.class);
//                startActivity(intent);
//            }
//        });
        ImageView gongimg=(ImageView) mView.findViewById(R.id.gongimg);
        ImageView xiaoyuanjianjie=(ImageView)mView.findViewById(R.id.xiyuanjianjie);
        ImageView xiaoyuanfengguang=(ImageView)mView.findViewById(R.id.xiaofeng);
        ImageView chongzhi=(ImageView)mView.findViewById(R.id.chongzhi);
        chongzhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Money.class);
                startActivity(intent);
            }
        });
        gongimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),gonggao.class);
                startActivity(intent);
            }
        });
        xiaoyuanjianjie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),schooljianjie.class);
                startActivity(intent);
            }
        });
        xiaoyuanfengguang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),xiaoyuanfengguang.class);
                startActivity(intent);
            }
        });
        setView();
        return mView;
    }
    private void setView() {
        mViewPaper = (ViewPager) mView.findViewById(R.id.vp);
        //显示的图片
        images = new ArrayList<ImageView>();
        for (int i = 0; i < imageIds.length; i++) {
            ImageView imageView = new ImageView(getActivity());
            imageView.setBackgroundResource(imageIds[i]);
            images.add(imageView);
        }
//显示的小点
        dots = new ArrayList<View>();
        dots.add(mView.findViewById(R.id.dot_0));
        dots.add(mView.findViewById(R.id.dot_1));
        dots.add(mView.findViewById(R.id.dot_2));
        adapter = new ViewPagerAdapter();
        mViewPaper.setAdapter(adapter);
        mViewPaper.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                dots.get(position).setBackgroundResource(R.drawable.new01);
                dots.get(oldPosition).setBackgroundResource(R.drawable.new02);
                oldPosition = position;
                currentItem = position;
            }
            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {

            }
            @Override
            public void onPageScrollStateChanged(int arg0) {

            }
        });
    }
    /*定义的适配器*/
    public class ViewPagerAdapter extends PagerAdapter {
        @Override
        public int getCount() {
            return images.size();
        }
        @Override
        public boolean isViewFromObject(View arg0, Object arg1) {
            return arg0 == arg1;
        }
        @Override
        public void destroyItem(ViewGroup view, int position, Object object) {
// TODO Auto-generated method stub
//          super.destroyItem(container, position, object);
//          view.removeView(view.getChildAt(position));
//          view.removeViewAt(position);
            view.removeView(images.get(position));
        }
        @Override
        public Object instantiateItem(ViewGroup view, int position) {
// TODO Auto-generated method stub
            view.addView(images.get(position));
            return images.get(position);
        }
    }
    /**
     * 利用线程池定时执行动画轮播
     */

    @Override
    public void onStart() {
// TODO Auto-generated method stub
        super.onStart();
        scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleWithFixedDelay(
                new ViewPageTask(),
                2,
                2,
                TimeUnit.SECONDS);
    }
//此处可以修改数字，改变轮播定时时间

/**
 * 图片轮播任务
 * @author liuyazhuang
 *
 */
private class ViewPageTask implements Runnable{
    @Override
    public void run() {
        currentItem = (currentItem + 1) % imageIds.length;
        mHandler.sendEmptyMessage(0);
    }
}
/**
 * 接收子线程传递过来的数据
 */
private Handler mHandler = new Handler(){
    public void handleMessage(android.os.Message msg) {
        mViewPaper.setCurrentItem(currentItem);
    };
};
    @Override
    public void onStop() {
        // TODO Auto-generated method stub
        super.onStop();
        if(scheduledExecutorService != null){
            scheduledExecutorService.shutdown();
            scheduledExecutorService = null;
        }
    }

}