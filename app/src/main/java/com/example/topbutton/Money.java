package com.example.topbutton;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Money extends AppCompatActivity {
    private MyDBHelper dbHelper;
    private SQLiteDatabase db;
    private EditText et_name;
    private EditText et_money;
    private TextView tvPay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money);
        et_name=(EditText)findViewById(R.id.et_name);
        et_money=(EditText)findViewById(R.id.et_money);
        tvPay=(TextView) findViewById(R.id.tvPay);
        et_money.getText();
        dbHelper=new MyDBHelper(this,"UserStore.db",null,1);
        db=dbHelper.getWritableDatabase();


    }

    public void Pay(View view){
        String code=et_name.getText().toString();
        String money=et_money.getText().toString();
        if (query(code)){
            if(update(code,money)) {
                Intent intent = new Intent(Money.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(this,"充值成功",Toast.LENGTH_LONG).show();
            }
        }else{
            if(insert(code,money)) {
                Intent intent = new Intent(Money.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(this,"充值成功",Toast.LENGTH_LONG).show();
            }
        }
    }

    public boolean insert(String code,String money){
        db.beginTransaction();
        ContentValues values=new ContentValues();
        values.put("codenumber",code);
        values.put("balance",money);
        db.insert("money",null,values);
        db.setTransactionSuccessful();
        db.endTransaction();
        return true;
    }
    public boolean query(String code){
        String select="select * from money where codenumber=?";
        Cursor cursor=db.rawQuery(select,new String[]{code});
        if (cursor.getCount()>0){
            cursor.close();
            return true;
        }
        cursor.close();
        return false;
    }
    public boolean update(String code,String money){
        db.beginTransaction();
        db.execSQL("update money set balance=balance+? where codenumber=?",new String[]{money,code});
        db.setTransactionSuccessful();
        db.endTransaction();


        return true;
    }
}
