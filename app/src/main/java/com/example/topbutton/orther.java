package com.example.topbutton;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class orther extends Activity {
    private ImageView imageView;
    private TextView textView;
    private TextView textTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orther);
        textView=(TextView)findViewById(R.id.text_view);
        textTitle=(TextView)findViewById(R.id.text_Title);
        imageView=(ImageView)findViewById(R.id.image_new);
        textTitle.setText("我校召开反诈防骗宣传进校园集中月活动动员会");
        textView.setText("3月27日下午，我校在在综合楼6楼会议室召开“反诈防骗宣传进校园集中月”活动动员会议。副校长王庆兵、文宗锋、黄松以及学校“反诈防骗宣传进校园集中月”活动领导小组成员参加会议。会议由副校长文宗锋主持。会上，保卫处处长李巨传达了信阳市打击治理电信网络新型违法犯罪工作市际联席会议精神和信反诈联席办〔2019〕1号《关于深入开展“反诈防骗宣传进校园集中月”活动的通知》文件精神，宣读了《信阳农林学院“反诈防骗宣传进校园集中月”活动实施方案》 。\n" +
                "       副校长文宗锋指出，近年来电信网络诈骗呈现新型性和频发性，各单位要立即行动，广泛宣传，常抓不懈，以此次活动为契机，形成长效机制，将反诈防骗工作深入到学院、班级、师生，在学生思想深处建立“防火墙”和“过滤网”，不断增强防骗意识，不断提升反诈能力，坚决压低发案率，构建和谐平安校园。\n" +
                "       副校长黄松就网络安全提出要求，要明确责任，做到谁主管谁负责、谁维护谁负责、谁使用谁负责。\n" +
                "       副校长王庆兵强调，各单位要高度重视，明确任务，压实责任，注重成效，确保此次“反诈防骗宣传进校园集中月”活动各项工作落到实处。（保卫处）");
    }
}
