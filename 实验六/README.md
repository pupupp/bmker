# Java  实验六 学生选课模拟系统之文件输入输出  

## 一、实验目的
1.掌握文件输入输出；  
2.掌握对象序列化方法。

## 二、业务要求  
在实验三（学生选课模拟系统）的基础上，利用文件保存选课结果，过程如下：  
1.采用对象序列化的writeObject方法把选课结果存到硬盘文件系统中；  
2.采用对象序列化的readObject方法从文件中恢复对象，并操作学生的选课课表，实现退课操作；
3.打印课程对象信息，采用覆盖定义toString（）方法的方式。  
      
## 三、实验要求        
1.提交源程序到gitee或github    
2.代码仓库命名为“实验六文件输入输出”写实验报告文件（readme.md）  

## 四、实验步骤与思路         
步骤一：在保持实验三学生选课模拟系统的基础上,Course类,Student类,Teacher类,People类中的代码不变的情况下,在main类中即主函数中对代码进行修改就可以满足此次实验的需求。  
步骤二：我将学生的选课情况放入一个动态的数组中,首先先创建一个txt文件,其次用ObjectInputStream创建对象输出流,再将实例化好的数组对象即学生选好课的情况使用writeObject方法写入文件,最后关闭输出流。  
步骤三：当我需要进行选课操作时,我需要从文件中取出我们此前存入的对象,通过ObjectInputStream创建输入流,使用readObject()方法,从文件中读取,将读取好的放入一个新的列表中,通过for循环历遍整个列表,利用java.util.List.get(int index)方法,将获取的内容,Course类实例化的新对象course,最后通过用toString()语句,输出选课的具体情况
步骤四：类比选课的代码写出退课的相应代码，所用方法大体类似。
## 五、关键代码      
1.利用readObject()方法,从文件中读取,toString()语句,输出打印选课的情况。
```  
      try {
	ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
	List<Course> array = (List<Course>) in.readObject();
	for (int i = 0; i < array.size(); i++) {
	   Course course = array.get(i);
	   System.out.println("课程" + (i + 1) + course.toString());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
```
2.利用readObject()方法,从文件中读取,toString()语句,输出打印出退课后的课程情况。  
```
 try {
	ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
	List<Course> array = (List<Course>) in.readObject();
	student1.unSelectCourse(course1);
	System.out.println("学生1【退课】【课程1】后课程信息:");
	for (int i = 0; i < courseList1.size(); i++) {
	   Course course = courseList1.get(i);
	   System.out.printf("课程" + (i + 1) + course.toString());
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}









  


  

