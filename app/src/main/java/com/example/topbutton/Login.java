package com.example.topbutton;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private MyDBHelper dbHelper;
    private EditText username;
    private EditText userpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        dbHelper=new MyDBHelper(this,"UserStore.db",null,1);
    }
    //点击注册按钮进入注册页面
    public void registerClick(View view){
        Intent intent=new Intent(Login.this,Register.class);
        startActivity(intent);
    }
    //点击登录按钮
    public void loginClicked(View view){
        username=(EditText)findViewById(R.id.et_user_name);
        userpassword=(EditText)findViewById(R.id.et_psw);
        String userName=username.getText().toString();
        String passWord=userpassword.getText().toString();
        if (login(userName,passWord)){
//            Toast.makeText(MainActivity.this,"登录成功",Toast.LENGTH_LONG).show();
            Intent intent=new Intent(Login.this,MainActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(Login.this,"账号或密码错误",Toast.LENGTH_LONG).show();
        }
    }
    //验证登录
    public boolean login(String username,String password){
        SQLiteDatabase db=dbHelper.getWritableDatabase();
        String sql="select * from userData where name=? and password=?";
        Cursor cursor=db.rawQuery(sql,new String[]{username,password});
        if (cursor.moveToFirst()){
            cursor.close();
            return true;
        }
        return false;
    }
}
