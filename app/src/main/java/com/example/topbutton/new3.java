package com.example.topbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class new3 extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;
    private TextView textTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new3);
        textView=(TextView)findViewById(R.id.text_view);
        textTitle=(TextView)findViewById(R.id.text_Title);
        imageView=(ImageView)findViewById(R.id.image_new);
        textTitle.setText("我校召开落实省委巡视反馈意见整改工作动员会");
        textView.setText(" 3月28日上午，我校在综合办公楼一楼会议室召开落实省委巡视反馈意见整改工作动员会，全体校领导和全校中层干部参加会议。会议由校长郭长华主持。" +
                "会上，党委副书记刘光生从指导思想、整改原则、整改目标、整改任务和措施、整改步骤、组织领导、工作要求等七个方面就落实省委第八巡视组巡视反馈意见整改工作作了具体安排。\n" +
                "       党委书记余作斌在讲话中指出，要深入学习贯彻习近平新时代中国特色社会主义思想和党的十九精神，学习贯彻习近平总书记关于巡视工作的重要讲话精神，学习贯彻省委书记王国生在听取十届省委第五轮巡视工作专题会上的讲话精神，紧紧围绕省委第八巡视组指出的问题，全面部署整改落实工作，提高思想认识，明确目标任务，压紧压实责任，以坚定的决心和信心，将问题改彻底、改到位，推动巡视整改高质量完成和学校事业高质量发展。\n" +
                "       余作斌就切实做好巡视整改工作提出三点意见，第一，巡视整改是政治任务，要以对党绝对忠诚的政治高度提升思想认识。抓好巡视整改是做到“两个维护”的试金石，是推动党的建设高质量的必然要求，是推动学校事业发展高质量的重要契机，要把整改工作作为一项极其严肃的重大政治任务，按照习近平总书记提出的“五个持续”的重要要求，以强烈的政治责任感，坚决抓好巡视反馈问题的整改落实。第二，巡视整改是政治担当，要以壮士断腕的决心抓好整改。对巡视反馈意见指出的问题，要以主动认领的自觉、闻过则喜的胸襟、敢于担当的品格，一件不落、一招不让坚决整改。要强化措施抓整改，严密有序抓整改，立足长效抓整改，举一反三抓整改，提升标准抓整改，确保在规定时间内整改到位。第三，巡视整改是政治责任，要以强有力的组织领导确保整改任务落地见效。要强化政治担当，坚持政治标准，以领导到位推动工作到位，以责任落实保障工作落实，以追责问责倒逼负责尽责，在整改落实上见真章、动真格、求实效。\n" +
                "       就落实此次动员会精神，郭长华强调三点要求，一要及时传达贯彻，抓紧动员部署，引导全校上下把思想和行动统一到校党委决策部署上来，以高度的政治责任感和强烈的政治担当，坚决抓好整改落实。二要夯实工作责任，扎实有力推进，做到“人人肩上有担子，个个心中有责任”，有条不紊地抓好各项工作落实。三要加强督查督办，确保落实到位，巡视整改工作领导小组办公室要及时跟踪督办，切实推动巡视整改工作圆满完成。（党委宣传部 徐大伟）");
    }
}
