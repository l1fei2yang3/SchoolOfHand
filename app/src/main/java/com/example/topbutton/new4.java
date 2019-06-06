package com.example.topbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class new4 extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;
    private TextView textTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new4);
        textView=(TextView)findViewById(R.id.text_view);
        textTitle=(TextView)findViewById(R.id.text_Title);
        imageView=(ImageView)findViewById(R.id.image_new);
        textTitle.setText("信阳师范学院硕士生导师杨健应邀来我校作报告");
        textView.setText("3月26日，信阳师范学院公共艺术教育中心主任、硕士生导师杨健应邀来我校作了题为“音乐文化素养与人的全面发展”的学术讲" +
                "座。副校长赵一鹏与文学艺术学院、外国语学院近300多名师生听取了讲座。" +
                "杨健从马克思、恩格斯关于人的全面发展思想切入，阐述了音乐作为一种文化的载体，在不同历史时期、不同地域以及不同时代的不同表达；由音乐的价值与功能谈及“音乐与名人”，以及音乐与人的成长紧密相关。他指出，音乐是人们抒发、表现、寄托感情的艺术，又具有特殊的工具价值和寓教于乐的综合价值，音乐对人的人格养成、智力发展和心理健康都发挥着潜移默化的熏陶和感染作用。他希望大家以乐修身、以乐养人、以乐启智、以乐正身，终身以乐为伴，拥有一个美丽的人生。杨健还以饱满的热情与大家分享了多部中外名曲片段，他声情并茂的解说与吟唱，让师生们陶醉在一阵阵悦耳优美的旋律中。《黄河大合唱》、《红旗颂》等经典名曲的赏析，更是增强了在座师生对音乐的感知力，也激发了师生们浓烈的爱国之情。杨健通过丰富的知识储备和风趣幽默的演讲方式，将音乐从多个方面进行解读，使音乐的概念在师生们的头脑中更加清晰，讲座在热烈的掌声中圆满结束。" +
                " 杨健，现为世界（ISME）音乐教育学会会员、中国教育学会音乐教育专业委员会理事，河南省音乐家协会理事、河南省普通高校艺术教育教学指导委员会委员、信阳市音乐家协会副主席、信阳市优秀社科专家。主要研究方向为音乐教育学、音乐美学及器乐表演。主持省级教学质量工程2项，主持完成河南省教改课题2项，发表学术论文30余篇，创作歌曲5首，出版教材7部，获河南省教育厅教学成果奖6项，获河南省第二届音乐金钟奖金奖1项。（文学艺术学院 陈娅）");
    }
}
