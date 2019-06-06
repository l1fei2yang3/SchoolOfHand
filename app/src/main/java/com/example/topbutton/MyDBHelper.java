package com.example.topbutton;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class MyDBHelper extends SQLiteOpenHelper {
//    public static final String CREATE_USERDATA="create table userData("+"id integer primary key autoincrement,"+
//            "name text,"+"password text,"+"monery_id integer)";
//    public static final String CREATE_MONERY="create table monery("+"id integer primary key autoincrement,"+
//            "number bigint,"+"balance text)";//建立一个卡表，里面有卡号和余额
    private Context mContext;
    public MyDBHelper(Context context, String name, SQLiteDatabase.CursorFactory cursorFactory, int version){
        super(context,name,cursorFactory,version);
        mContext=context;
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
//        db.execSQL(CREATE_USERDATA);
//        db.execSQL(CREATE_MONERY);
//
//        Toast.makeText(mContext,"创建数据库成功",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        onCreate(db);
    }
}
