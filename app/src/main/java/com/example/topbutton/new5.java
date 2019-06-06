package com.example.topbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class new5 extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;
    private TextView textTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new5);
        textView=(TextView)findViewById(R.id.text_view);
        textTitle=(TextView)findViewById(R.id.text_Title);
        imageView=(ImageView)findViewById(R.id.image_new);
        textTitle.setText("我校举办信阳四高校提升公共艺术教育水平研讨会");
        textView.setText("为深入学习贯彻习近平总书记在看望参加全国政协十三届二次会议的文艺界社科界委员时的重要讲话精神，3月26日下午，我校在综合办公楼720会议室举办了“深入学习贯彻习总书记重要讲话精神，提升高校公共艺术教育水平”专题研讨会。会议邀请信阳师范学院公共艺术教育中心主任杨健，信阳学院艺术学院院长吴柏林、党总支书记陈今强，信阳职业技术学院公共艺术教育中心主任刘松与文学艺术学院全体公共艺术教育教师一起研讨交流。" +
                " 研讨会上，与会专家和老师们畅所欲言，讨论热烈。大家一致认为，习近平总书记在看望参加全国政协十三届二次会议的文艺界社科界委员时的重要讲话，为中国文艺指明了前进的方向。作为高校艺术教育工作者，要自觉践行社会主义核心价值观，要有信仰、有情怀、有担当，主动肩负起启迪思想、陶冶情操、温润心灵的职责，承担起以文化人、以文育人、以文培元的使命；要与时代同行，多练真功，勤业精业，拿出我们真正的好课、好作品、好文章、好成果；要善于采用鲜活的教学方法，让艺术“活”起来，让更多的非艺术专业的学生受到艺术美的熏陶。\n" +
                "       大家还讨论交流了公共艺术教育的课程设置、教材建设、师资培训、学术交流及如何丰富校园艺术活动等，共同学习了省教育厅副巡视员李金川在2019年全省学校体卫艺工作会议上的讲话精神，讨论了如何筛选梳理高校艺术教育工作亮点等问题。（文学艺术学院 陈娅）");
    }
}
