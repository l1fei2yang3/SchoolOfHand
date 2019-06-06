package com.example.topbutton;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class gridview_item extends BaseAdapter {
    private Context context;
    private List<Integer> data;

    public gridview_item(Context context,List<Integer>data){
        super();
        this.context=context;
        setData(data);

    }
    public void setData(List<Integer>data){
        if (data==null){
            data=new ArrayList<Integer>();
        }
        this.data=data;
    }


    @Override
    public int getCount() {
            return this.data.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView==null){
            holder=new ViewHolder();
            convertView=LayoutInflater.from(context).inflate(R.layout.activity_gridview_item,null);
            holder.image=convertView.findViewById(R.id.iv_gridview_item_image);
            convertView.setTag(holder);
        }else{
            holder=(ViewHolder)convertView.getTag();
        }
        holder.image.setImageResource(data.get(position));
        return convertView;
    }
    private class ViewHolder{
        ImageView image;
    }
}
