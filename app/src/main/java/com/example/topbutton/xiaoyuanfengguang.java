package com.example.topbutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class xiaoyuanfengguang extends AppCompatActivity {

    private GridView gridView;
    private gridview_item adapter;
    private ArrayList<Integer> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaoyuanfengguang);
        gridView=(GridView)findViewById(R.id.gridView1);
        data=new ArrayList<Integer>();
        adapter=new gridview_item(this,data);
        gridView.setAdapter(adapter);
        data.addAll(getData());
        adapter.notifyDataSetChanged();
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(xiaoyuanfengguang.this,DisplayImageActivity.class);
                intent.putIntegerArrayListExtra("data",data);
                intent.putExtra("position",position);
                startActivity(intent);
            }
        });
    }
    public List<Integer> getData() {
        List<Integer>data=new ArrayList<Integer>();
        data.add(R.drawable.school);
        data.add(R.drawable.school1);
        data.add(R.drawable.school2);
        data.add(R.drawable.school3);
        data.add(R.drawable.school4);
        data.add(R.drawable.school5);
        data.add(R.drawable.school6);
        data.add(R.drawable.school7);
        data.add(R.drawable.school8);
        data.add(R.drawable.school9);
        data.add(R.drawable.school10);
        data.add(R.drawable.school11);
        data.add(R.drawable.school12);
        data.add(R.drawable.school13);
        data.add(R.drawable.school14);
        data.add(R.drawable.school15);
        data.add(R.drawable.school16);
        data.add(R.drawable.school17);
        data.add(R.drawable.school18);
        data.add(R.drawable.school19);
        data.add(R.drawable.school20);
        data.add(R.drawable.school21);
        data.add(R.drawable.school22);
        data.add(R.drawable.school23);
        data.add(R.drawable.school24);
        data.add(R.drawable.school25);
        return data;
    }
}
