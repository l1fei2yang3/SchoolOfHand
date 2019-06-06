package com.example.topbutton;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewSwitcher;

import java.util.ArrayList;

public class DisplayImageActivity extends Activity implements ViewSwitcher.ViewFactory {
    private ArrayList<Integer>data;
    private int position;
    private ImageSwitcher imageSwitcher;
    private GestureDetector detector;
    private  final String TAG ="net.hw.helloworld";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_image);

        Intent intent=getIntent();
        data=intent.getIntegerArrayListExtra("data");
        position=intent.getIntExtra("position",0);
        imageSwitcher=(ImageSwitcher)findViewById(R.id.imageswitcher1);
        imageSwitcher.setFactory(this);


        detector=new GestureDetector(this, new GestureDetector.OnGestureListener() {
            @Override
            public boolean onDown(MotionEvent e) {
                Log.i(TAG,"onDown");
                return false;
            }

            @Override
            public void onShowPress(MotionEvent e) {
                Log.i(TAG,"onShowPress");
            }

            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                Log.i(TAG,"onSingleTapUp");
                return false;
            }

            @Override
            public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
                Log.i(TAG,"onScrol1");
                return false;
            }

            @Override
            public void onLongPress(MotionEvent e) {
                Log.i(TAG,"onLongPress");
            }

            @Override
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                Log.i(TAG,"onFling");
                //手势往左滑动
                if ((e2.getX()-e1.getX())>data.size()){
                    position--;
                    if (position<0){
                        position=data.size()-1;
                    }

                }else  if((e2.getX()-e1.getX())<0){
                    position++;
                    if (position>data.size()){
                        position=data.size()-1;
                    }

                }
//
                imageSwitcher.setImageResource(data.get(position));
                return false;
            }
        });
    }
    public boolean onTouchEvent(MotionEvent event){
        return detector.onTouchEvent(event);
    }

//    public void doShowPrevious(View v){
//        position--;
//        if (position<0){
//            position=data.size()-1;
//        }
//        imageSwitcher.setImageResource(data.get(position));
//
//    }

//    public void doShowNext(View v){
//        position++;
//        if (position>data.size()){
//            position=0;
//        }
//        imageSwitcher.setImageResource(data.get(position));
//    }

    @Override
    public View makeView() {
        ImageView view =new ImageView(this);
        view.setLayoutParams(new ImageSwitcher.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT));
        view.setScaleType(ImageView.ScaleType.FIT_CENTER);
        view.setImageResource(data.get(position));
        return view;
    }
}

