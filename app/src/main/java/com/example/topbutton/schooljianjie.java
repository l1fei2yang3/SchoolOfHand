package com.example.topbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class schooljianjie extends AppCompatActivity {
    private TextView textView;
    private TextView textTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schooljianjie);
        textView=(TextView)findViewById(R.id.text_view);
        textTitle=(TextView)findViewById(R.id.text_Title);
        textTitle.setText("学院简介");
        textView.setText("信阳农林学院是一所公办全日制普通本科学校，座落于历史文化名城信阳。信阳地处河南省南部，东邻安徽、南接湖北，楚风豫韵交汇交融，素有“北国江南，江南北国”之美誉，是中国著名的宜居之城、旅游之城、创业之城，其优越的地理区位、优美的自然环境、深厚的文化底蕴和活跃的地方建设，为莘莘学子学习深造提供了优越条件。\n" +
                "       学校前身为信阳农业高等专科学校，办学历史可追溯到1910年成立的汝宁府中等实业学堂。一百多年来，学校发扬“艰苦创业、负重奋进、团结拼搏、追求卓越”的精神，秉承“志向立高远、学问做精细”的校训，已建成一所以农林学科专业为特色，农学、工学、管理学、文学、理学等多学科协调发展的与区域经济社会发展相适应的应用型普通高校，为社会培养各类人才10余万人，为河南经济社会发展作出了重要贡献。\n" +
                "       学校校园占地1430余亩，校舍建筑面积44.5万余平方米。在校学生1.49余万人，教职工910余人，其中专任教师800余人，具有高级专业技术职务教师220余人，具有博士、硕士学位教师610余人。有国家教学名师1人，全国优秀教师1人，全国十佳双创典型导师1人，全国技术能手1人，教育部高等学校教学指导分委员会委员2人，河南省教学名师2人，省管专家、学术技术带头人、省级骨干教师等高层次人才40余人，省级优秀教学团队2个，省级创新型科技团队1个，省级优秀基层教学组织5个。\n" +
                "       学校设有农学院、林学院、水产学院、茶学院、牧医工程学院、食品学院、园艺学院、规划与设计学院、信息工程学院、工商管理学院、财经学院、外国语学院、生物与制药工程学院、旅游管理学院、马克思主义学院、文学艺术院、体育学院、国际交流与合作部、继续教育学院共19个教学单位，设置有植物保护、种子科学与工程、农学、设施农业科学与工程、林学、园林、水产养殖学、水族科学与技术、茶学、动物医学、动物科学、食品科学与工程、食品质量与安全、园艺、城乡规划、风景园林、环境设计、网络工程、数字媒体技术、物流管理、物联网工程、电子商务、市场营销、财务管理、审计学、商务英语、翻译、制药工程、酒店管理、旅游管理等30个本科专业和若干专业方向，以及畜牧兽医、烹调工艺与营养、会计、休闲体育、文秘等20多个专科专业。\n" +
                "       学校教学科研仪器设备总值8500余万元，建有农学、林学、水产养殖、茶学、动物医学、食品科学与工程等各类实验室45个，稳定的校内外实习实训基地200余个，国家级职业教育实训基地2个，省级示范性实训基地4个，省级实验教学示范中心1个，农林实习场1个。图书馆面积2.8万平方米，现代图书管理系统完善，馆藏图书120万余册，学术期刊1000多种，可利用电子图书35万册（种）。建有较完善的计算机网络服务体系。\n" +
                "       学校坚持“质量立校，特色兴校，人才强校”的办学思想，坚持以育人为中心、以提高人才培养质量为核心的教学理念，围绕立德树人根本任务和“三全育人”新要求，实施“质量提升，内涵带动”发展战略，大力推进教育教学改革，狠抓本科教学质量提升工程及学科专业建设，培育重点学科，强化特色专业，走产学研合作道路，形成了鲜明的办学特色。有省级重点学科培育学科1项，省级及以上特色优势专业15个，其中中央财政支持提升专业服务能力项目建设专业2个、河南省高等学校专业综合改革试点项目3个（本科）；有国家级精品课程4门，河南省精品课程7门，河南省精品资源课程2门，河南省精品在线开放课程1门。获省级教学成果50项，其中省级教学成果特等奖1项，一等奖7项，二等奖17项。\n" +
                "       学校坚持以提高科学研究水平和科技服务能力为目标，强化科技创新与服务平台建设，牵头组建了河南省茶产业技术创新战略联盟、河南省水库生态渔业产业技术创新战略联盟、河南省食药用真菌产业技术创新战略联盟，河南省油茶产业技术创新战略联盟，获批建立河南省豫南农作物有害生物绿色防控院士工作站、河南省博士后研发基地和7个省级工程（技术）研究中心、20个市厅级工程技术研究中心、1个省级和8个市级重点实验室，1个市级星创天地。面向信阳及周边地区粮食、林果、水产、茶叶、畜禽、花卉、食品加工、食用菌、中草药等产业发展，积极开展应用研究、技术开发和成果转化，近年来承担省部级以上教学科研项目300多项，获得省部级奖80余项，获国家专利400余项。获批建立国家级培育示范基地1个、省级培训基地5个、省级培育机构1个、省级科普示范基地1个，省级产学研合作试点项目6个。市校联合建有信阳马克思主义学院、信阳农民大学，学校联合企业行业共建信阳家居学院、物流学院、旅游规划设计研究院等合作平台，联合10余家政府机构与100余家企业组建有产学研合作联盟，积极推进政、产、学、研深化合作，支持地方经济社会发展和脱贫攻坚，近年依托河南省博士服务团、科普及适用技术传播工程项目、省市科技特派员、省“三区”人才支持计划科技人员专项计划、驻村第一书记等为载体，积极服务地方经济社会发展，助力大别山革命老区脱贫攻坚，每年开展各类服务活动千余场次。\n" +
                "       在省市领导大力支持和全校教职工的不懈努力下，学校办学赢得多方肯定，先后获有“省级文明学校”“省级文明单位”“河南省园林单位”“河南省高等学校先进党委”“河南省高等学校党建工作先进单位”“河南省学校行风建设先进单位”“河南省职业教育工作先进单位”“河南省普通高校大中专毕业生就业工作先进集体”“河南省科技特派员工作先进集体”“河南省农业科技工作先进单位”“河南最具就业竞争力示范院校”“河南省依法治校示范校”“河南省高校知识产权综合能力专项行动十快高校”“河南省高校科技管理工作先进集体”等荣誉称号，2015年、2016年连续获得两届中国“互联网+”大学生创新创业大赛全国总决赛银奖。\n" +
                "       站在新时代新起点，在习近平新时代中国特色社会主义思想引领下，在党的十九大精神鼓舞下，全校师生紧紧围绕学校党代会提出的奋斗目标，坚持发展新理念，聚焦本科教育新要求，不忘初心，奋力前行，以饱满的热情、昂扬的斗志掀开建设特色鲜明应用型大学新篇章，为推进学校全面协调快速发展而努力奋斗。");
    }

}
