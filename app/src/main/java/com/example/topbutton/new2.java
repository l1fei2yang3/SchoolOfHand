package com.example.topbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class new2 extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;
    private TextView textTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new2);
        textView=(TextView)findViewById(R.id.text_view);
        textTitle=(TextView)findViewById(R.id.text_Title);
        imageView=(ImageView)findViewById(R.id.image_new);
        textTitle.setText("我校召开2019年春季校园食品安全责任落实与知识培训暨学校食品安全与营养健康管理规定学习动员会");
        textView.setText("3月27日下午，我校在综合楼一楼会议室召开2019年春季校园食品安全责任落实与知识培训暨学校食品安全与营养健康管理规定学习动员会。副校长文宗锋，信阳市食品安全监督所所长曲顺珍，食品安全监督员薛建国、万坤，校后勤服务总公司党总支书记肖世文以及各食堂管理人员、工作人员参加会议。会议由肖世文主持。\n" +
                " 会上，曲顺珍从食品安全形势、食品安全问题发生的特点以及企业落实主体责任等方面作了详细的指导和讲解。\n" +
                "       薛建国就学校食堂和校园食品安全知识展开培训，包括食品安全存在的问题、食品安全犯罪典型案件及相关法律法规等内容。\n" +
                "       学校食品安全和食堂工作事关学校教学秩序的稳定和师生的身体健康。我校将学生食堂规范化管理列为2019年后勤工作的重点，将“全心全意为师生服务”作为食堂工作的宗旨，将“师生满意度”作为衡量食堂工作水平的标尺，将“食品安全、菜品多样、价格合理”作为食堂工作的目标。将责任转化成实践中的高标准、严要求、抓细节、勤工作、献真情，打造出一支过硬的员工队伍，努力开创学校食堂工作的新局面。（后勤服务总公司）");
    }
}
