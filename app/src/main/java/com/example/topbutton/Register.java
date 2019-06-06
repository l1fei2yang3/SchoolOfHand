package com.example.topbutton;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    private MyDBHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        dbHelper=new MyDBHelper(this,"UserStore.db",null,1);
    }
    public void login(View view){
        EditText editText_name=(EditText)findViewById(R.id.et_user_name);
        EditText editText_psw=(EditText)findViewById(R.id.et_psw);
        String newname=editText_name.getText().toString();
        String password=editText_psw.getText().toString();
        if (CheckIsDataAlreadyInDBorNot(newname)){
            Toast.makeText(this,"该用户名已经被注册，注册失败",Toast.LENGTH_LONG).show();
        }else {
            if (insert(newname,password)){
                Toast.makeText(this,"注册成功",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(Register.this,Login.class);
                startActivity(intent);
            }
        }
    }
    //向数据库插入数据
    public boolean insert(String username,String password){
        SQLiteDatabase db=dbHelper.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put("name",username);
        values.put("password",password);
        db.insert("userData",null,values);
        db.close();
        return true;
    }
    //检验用户名是否已经存在
    public boolean CheckIsDataAlreadyInDBorNot(String value){
        SQLiteDatabase db=dbHelper.getWritableDatabase();
        String Query="select * from userData where name=?";
        Cursor cursor=db.rawQuery(Query,new String[]{value});
        if (cursor.getCount()>0){
            cursor.close();
            return true;
        }
        cursor.close();
        return false;
    }
}
