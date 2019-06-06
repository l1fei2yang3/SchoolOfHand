package com.example.topbutton;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Query extends AppCompatActivity {
    private MyDBHelper dbHelper;
    private SQLiteDatabase db;
    private EditText et_name;
    private TextView tvPay;
    private TextView ba;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query);
        et_name=(EditText)findViewById(R.id.et_name);
        tvPay=(TextView) findViewById(R.id.tvPay);
        ba=(TextView) findViewById(R.id.balance);
        dbHelper=new MyDBHelper(this,"UserStore.db",null,1);
        db=dbHelper.getWritableDatabase();
    }
    public void que(View view){
        String code=et_name.getText().toString();
        query(code);

    }
    public boolean query(String code){
        String select="select balance from money where codenumber=?";
        Cursor cursor=db.rawQuery(select,new String[]{code});
        if (cursor.moveToFirst()){
            int balance=cursor.getInt(cursor.getColumnIndex("balance"));
            ba.setText(Integer.toString(balance));
            cursor.close();
            return true;
        }
        cursor.close();
        return false;
    }
}
