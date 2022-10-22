package xuanke;

public class Course {
	 String number;
	 String name;
	 String place;
	 String time;
	 Teacher teacher;
	 Course(String a,String b,String c,String d){
	     number=a;
	     name=b;
	     place=c;
	     time=d;
	 }
	 public void setTeacher(Teacher t){
	     this.teacher=t;
	 }
}
