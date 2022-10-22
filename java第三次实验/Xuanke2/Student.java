package xuanke;
import java.util.Arrays;
import java.util.Objects;
public class Student extends People {
	 	public Student(String a,String b,String c,Course[] d){
	    number=a;
	    name=b;
	    sex=c;
	    course=d;
	    }
	    //选课
	    void xuanke(Course t) {
	    	for(int i=0;i<this.course.length;i++){
	    		if (course[i]==null) {
	    		course[i]=t;
	    		break;
	    		}
	    	}
	    }
	    //退课
	    void tuike(Course t){
	        for(int i=0;i<this.course.length;i++){
	            if(Objects.equals(t.name, course[i].name)){
	                for(int j=1;j<this.course.length-i;j++){
	                    course[i+j-1]=course[i+j];
	                }
	                course = Arrays.copyOf(course, course.length-1);
	            }
	        }
	    }
}
