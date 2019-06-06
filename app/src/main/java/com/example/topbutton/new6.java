package com.example.topbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class new6 extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;
    private TextView textTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new6);
        textView=(TextView)findViewById(R.id.text_view);
        textTitle=(TextView)findViewById(R.id.text_Title);
        imageView=(ImageView)findViewById(R.id.image_new);
        textTitle.setText("副校长赵一鹏带队检查学生毕业实习情况");
        textView.setText("3月27日下午，副校长赵一鹏带领信息工程学院院长商信华一行四人到信阳市联智网络科技有限公司检查毕业生顶岗实习情况，并看望慰问毕业实习学生胡闪闪同学。\n" +
                "       赵一鹏一行与公司副总经理彭伟、项目主管孙文静进行了座谈，详细了解我校实习学生的工作表现，进一步了解公司对IT人才的需求状况及对人才培养工作的建议。赵一鹏对企业负责人在胡闪闪同学实习期间给予的关注和帮助表示了感谢。\n" +
                "       随后，赵一鹏与实习学生胡闪闪同学进行了亲切交流，详细了解她的工作实习内容和生活情况，听取了胡闪闪同学在实习期间的感受、感悟和收获，及时解决、解答实习过程中遇到的各种困难和问题。赵一鹏勉励胡闪闪同学增强自信，安心实习，在实习岗位勤奋工作，尽快熟悉实习岗位的工作，努力培养自己的学习能力，提高自己的专业应用能力，为将来就业打下坚实基础。胡闪闪同学对学校四年来给予的关注和帮助表达了感激之情，表示一定会珍惜实习机会，扎实工作，获得用人单位的认可，为学校争得荣誉。（信息工程学院）." +
                "");
    }
}
