package xuanke;

public class XuankeSystem {
    public static void main(String[] args) {
        Course gdsx=new Course("001","�ߵ���ѧ","��101","��һ8��00����9��40");
        Course xxds=new Course("002","���Դ���","��102","�ܶ�8��00����9��40");
        Course java=new Course("003","Java","��201","����1��30����3��10");
        Course cyy=new Course("004","C����","��202","����1��30����3��10");
        Course dxwl=new Course("005","��ѧ����","��203","����8��00����9��40");
        Course tiyu=new Course("006","����","������","����10��00����11��40");

        Teacher wang=new Teacher("0001","����ʦ","��", new Course[]{gdsx,xxds});
        Teacher zhang=new Teacher("0002","����ʦ","��",new Course[]{java,cyy});
        Teacher li=new Teacher("0003","����ʦ","Ů",new Course[]{dxwl});
        Teacher shi=new Teacher("004","ʯ��ʦ","��",new Course[]{tiyu});

        gdsx.setTeacher(wang);
        xxds.setTeacher(wang);
        java.setTeacher(zhang);
        cyy.setTeacher(zhang);
        dxwl.setTeacher(li);
        tiyu.setTeacher(shi);

        Student liu=new Student("202001","��ͬѧ","��",new Course[3]);
        Student zhao=new Student("202002","��ͬѧ","Ů",new Course[3]);
         
        liu.xuanke(gdsx);
        liu.xuanke(xxds);
        liu.xuanke(java);
        zhao.xuanke(cyy);
        zhao.xuanke(dxwl);
        zhao.xuanke(tiyu);
        liu.tuike(gdsx);
        zhao.tuike(cyy);

        System.out.println("ѧ�����:"+liu.number+
                "\nѧ������:"+liu.name+
                "\nѧ���Ա�:"+liu.sex);

        for(int i = 0; i<liu.course.length; i++){
            System.out.println("�γ̱��:"+liu.course[i].number+"\t�γ�����:"+liu.course[i].name+"\t�Ͽ�ʱ��:"
                    +liu.course[i].time+"\t�Ͽεص�:"+liu.course[i].place+"\t��ʦ:"+liu.course[i].teacher.name);
        }

        System.out.println("\n"+"ѧ�����:"+zhao.number+
                "\nѧ������:"+zhao.name+
                "\nѧ���Ա�:"+zhao.sex);

        for(int i = 0; i<zhao.course.length; i++){
            System.out.println("�γ̱��:"+zhao.course[i].number+"\t�γ�����:"+zhao.course[i].name+"\t�Ͽ�ʱ��:"
                    +zhao.course[i].time+"\t�Ͽεص�:"+zhao.course[i].place+"\t��ʦ:"+zhao.course[i].teacher.name);
        }
    }
}
