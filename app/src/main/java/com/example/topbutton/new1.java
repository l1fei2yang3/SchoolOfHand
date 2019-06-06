package com.example.topbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class new1 extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;
    private TextView textTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new1);
        textView=(TextView)findViewById(R.id.text_view);
        textTitle=(TextView)findViewById(R.id.text_Title);
        imageView=(ImageView)findViewById(R.id.image_new);
        textTitle.setText("我校与市委组织部联合举办2019年度全市村党组织书记示范培训班");
        textView.setText(" 3月22日，2019年信阳市村党组织书记示范培训班（第一期）在江苏省华西干部学院正式开班。市委组织部部委会成员师磊，华西村党校副校长、华西纪检委副主任朱蕴海，华西干部学院培训部主任吴云娣，我校继续教育学院培训科科长张凯参加开班仪式。朱蕴海在开班仪式上致欢迎辞，师磊作了动员讲话。就做好此次全市村党组织书记培训工作，师磊提出三点意见。一是提升认识，深刻理解重要意义；二是把握重点，切实提高能力素质；三是珍惜机遇，确保培训取得实效。师磊希望参加培训的村党组织书记们珍" +
                "惜这次难得的学习机会，静下心来，潜心学习，深入思考，力求学有所得" +
                "、学有所悟、学有所用 此次培训共有来自平桥区、潢川县、淮滨县的100余名村党组织书记参加。开班仪式结束后，培训班学员参观了华西村吴仁宝老书记旧居、社会主义富华西展览馆。随后进行了为期5天的理论与实践教学活动。华西村党委书记为培训学员作了专题讲座。（继续教育学院）。");
    }
}
