package xuanke;

public class XuankeSystem {
    public static void main(String[] args) {
        Course gdsx=new Course("001","高等数学","教101","周一8：00——9：40");
        Course xxds=new Course("002","线性代数","教102","周二8：00——9：40");
        Course java=new Course("003","Java","教201","周三1：30——3：10");
        Course cyy=new Course("004","C语言","教202","周四1：30——3：10");
        Course dxwl=new Course("005","大学物理","教203","周五8：00——9：40");
        Course tiyu=new Course("006","体育","体育馆","周五10：00——11：40");

        Teacher wang=new Teacher("0001","王老师","男", new Course[]{gdsx,xxds});
        Teacher zhang=new Teacher("0002","张老师","男",new Course[]{java,cyy});
        Teacher li=new Teacher("0003","李老师","女",new Course[]{dxwl});
        Teacher shi=new Teacher("004","石老师","男",new Course[]{tiyu});

        gdsx.setTeacher(wang);
        xxds.setTeacher(wang);
        java.setTeacher(zhang);
        cyy.setTeacher(zhang);
        dxwl.setTeacher(li);
        tiyu.setTeacher(shi);

        Student liu=new Student("202001","刘同学","男",new Course[3]);
        Student zhao=new Student("202002","赵同学","女",new Course[3]);
         
        liu.xuanke(gdsx);
        liu.xuanke(xxds);
        liu.xuanke(java);
        zhao.xuanke(cyy);
        zhao.xuanke(dxwl);
        zhao.xuanke(tiyu);
        liu.tuike(gdsx);
        zhao.tuike(cyy);

        System.out.println("学生编号:"+liu.number+
                "\n学生姓名:"+liu.name+
                "\n学生性别:"+liu.sex);

        for(int i = 0; i<liu.course.length; i++){
            System.out.println("课程编号:"+liu.course[i].number+"\t课程名称:"+liu.course[i].name+"\t上课时间:"
                    +liu.course[i].time+"\t上课地点:"+liu.course[i].place+"\t教师:"+liu.course[i].teacher.name);
        }

        System.out.println("\n"+"学生编号:"+zhao.number+
                "\n学生姓名:"+zhao.name+
                "\n学生性别:"+zhao.sex);

        for(int i = 0; i<zhao.course.length; i++){
            System.out.println("课程编号:"+zhao.course[i].number+"\t课程名称:"+zhao.course[i].name+"\t上课时间:"
                    +zhao.course[i].time+"\t上课地点:"+zhao.course[i].place+"\t教师:"+zhao.course[i].teacher.name);
        }
    }
}
