package com.example.topbutton;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class Fragment1 extends ListFragment {
    String[] presidents={
            "我校召开反诈防骗宣传进校园集中月活动动员会",
            "我校与市委组织部联合举办2019年度全市村党组织书记示范培训班  ",
            "我校召开2019年春季校园食品安全责任落实与知识培训暨学校食品安全与营养健康管理规定学习动... ",
            "我校召开落实省委巡视反馈意见整改工作动员会 ",
            "信阳师范学院硕士生导师杨健应邀来我校作报告 ",
            "我校举办信阳四高校提升公共艺术教育水平研讨会 ",
            "副校长赵一鹏带队检查学生毕业实习情况 ",
            "党委书记余作斌到农学院林学院调研 ",
            "映象网：信阳农林学院财经学院举办第三届大学生创新创业大赛 ",
            "人民周刊网：启迪创新思维 助推创业蓝图 信阳农林学院财经学院举办第三届大学生创新创业大赛 ",
            "映象网：信阳市农村党组织书记示范培训班在浙江农林大学开班 ",
            "信阳市农村党组织书记示范培训班在浙江农林大学开班 ",
            "副校长赵一鹏为林学园艺师生作新学期党课第一讲 ",
            "河南省教育厅学校安全工作专项督导组到我校检查指导工作 ",
            "河南日报客户端：深化校企合作产教融合 助推信阳产业创新发展 ",
            "河南省科技攻关计划（农业领域）项目验收会在我校召开 ",
            "我校召开2019年度学生工作会议 ",
            "我校召开学校安全工作推进会 ",
            "我校召开2019年工作会 ",
            "我校顺利通过省教育厅成人高等教育试点评估 ",
            "生物与制药工程学院赴郑州瑞龙制药参观交流 ",
            "学习雷锋好榜样 争做时代好青年 —— 我校广泛开展学雷锋志愿服务活动 ",
            "今日头条：信阳农林学院工商管理学院开展学雷锋志愿服务活动 ",
            "工商管理学院开展“关爱聋哑儿童 温暖无声世界”学雷锋志愿服务活动 ",
            "学校党委召开巡视反馈意见整改工作专题会 ",
            "省委第八巡视组向信阳农林学院党委反馈巡视情况 ",
            "我校召开2019年党委中心组（扩大）第二次集体学习会 ",
            "我校开展2019年春季义务植树活动 ",
            "农学院党总支与大河报信阳记者站联合开展“党旗引领”学雷锋志愿服务活动 ",
            "省委组织部来校宣布党委书记任职决定 ",
            "我校举办离退休“三八妇女节”活动 ",
            "校长郭长华检查校园绿化工作 ",
            "我校举办庆“三八”健步行活动 ",
    };
    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment1, container, false);

//      listView.setAdapter(arrayAdapter);
//        b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(getActivity(),orther.class);
//                startActivity(intent);
//            }
//        });
        return view;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,presidents));
    }
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
//        Toast.makeText(getActivity(),"你选择的是："+presidents[position],Toast.LENGTH_LONG).show();
        if (id == 0) {
            Intent intent = new Intent();
            intent.setClass(getActivity(), orther.class);
            startActivity(intent);
        } else if (id == 1) {
            Intent intent = new Intent();
            intent.setClass(getActivity(), new1.class);
            startActivity(intent);

        } else if (id == 2) {
            Intent intent = new Intent();
            intent.setClass(getActivity(), new2.class);
            startActivity(intent);
        }else if (id == 3) {
        Intent intent = new Intent();
        intent.setClass(getActivity(), new3.class);
        startActivity(intent);
        }else if (id == 4) {
            Intent intent = new Intent();
            intent.setClass(getActivity(), new4.class);
            startActivity(intent);
        }else if (id == 5) {
            Intent intent = new Intent();
            intent.setClass(getActivity(), new5.class);
            startActivity(intent);
        }
        else {
            Intent intent = new Intent();
            intent.setClass(getActivity(), new6.class);
            startActivity(intent);
            }


    }
}
