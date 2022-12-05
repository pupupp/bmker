# 实验四学生实验室勤工俭学模拟

一、实验目的
1.掌握Java中类的定义；
2.掌握static、final等修饰符的用法；
3.了解异常的使用方法，并在程序中根据输入情况做异常处理

二、业务要求
1.某学校为了给学生提供勤工俭学机会，选派了部分学生参与实验室的卫生清洁工作。每个学生被分配若干间实验室，视实验室的清洁打分情况给予劳务补贴。 例如： 学生“张三”负责了“计算机网络实验室”、“组成原理实验室”的清洁情况，每周被检查。在某次检查中，“计算机网络实验室”卫生得“优”，“组成原理实验室”卫生得“及格”，一次“优”按x元记录补助，一次“及格”按y元记录补助。
（卫生标准分级、相应的等级补助标准，自行规定）
2.按国家的税务制度，劳务费应按国家规定纳税，请统计一学期学生的实际收入。（国家最新工资纳税标准，请自行检索）。

三、实验要求
1.设计系统中的类（如 学生、实验室等等）；
2.一学期按18周计；
3.每个学生负责的实验室数量不一定相同；
4.对学期勤工俭学收入和纳税进行统计，求得实际收入；
5.国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static final修饰定义。
6.根据处理情况，要在程序中考虑做异常处理。

四、实验步骤与思路
步骤一： 根据题中所说的需求，我先创建了CalculatePrice,Student,Classroom,Main四个类。
步骤二：在Student以及Classroom类中,与之前的实验类似,构建构造带有参数的构造方法,并且构建了能够通过调用构造的普通方法来完成类实例化，以及构建了能够获取类实例化一个具体对象各个参数的方法。
步骤三：在CalculatePrice类中,进行了对实验室的清洁情况不同,通过使用final关键字,规定了不同的补助标准以及一学期的周次.在此类中定了能够将实验室的打扫任务分给学生的方法,一个学生可以清扫多个实验室.在此类的最后,构建了能够根据国家规定纳税的标准,进行计算学生最后的劳务费的多少。
步骤四：在Main主类中,实例化了两个同学,两个实验室.并且对不同实验室优秀的情况进行赋值,根据“优”与“良”的情况,可以计算出“良”的次数,最后通过输入语句,输入国家的纳税标准,调用CalculatePrice类中所定义的方法,进行最后的计算.最后输出计算后的结果。

五、关键代码
1.使用private修饰符,修饰学生类的属性。

 private Integer id;
	private String name;
	private int excellentCount;
	private int passCount;
2.与Student类类似,Classroom类中,构造了带有两个参数的构造方法。

 public ClassRoom(String id, String roomName) {
		this.id = id;
		this.roomName = roomName;
	}
3.使用了static和final关键字,定义了一个静态不可更改的两个变量.即不同标准的补助金额。


	 public static final int x = 15;// 优秀15元
	public static final int y = 12;// 及格12元
4.声明了Map数组集合,存储双列数据的集合.第一个参数是实验室ID,另外一个学生ID。

           public static Map<String, List<Student>> roomStudentMap = null;     
5.将实验室分配给学生。

             if (roomStudentMap == null) {
	roomStudentMap = new HashMap<String, List<Student>>();
	List<Student> studentIdList = new ArrayList<Student>();
	studentIdList.add(student);
	roomStudentMap.put(roomId, studentIdList);
		
6.计算学生补助的税后值。

public static void calculateAccout(Student student) {
    int excelentCount = student.getExcellentCount();
    int passCount = student.getPassCount();
    int priceBefore = x * excelentCount + y * passCount;
    System.out.println(student.getName() + "勤工俭学收入" + priceBefore);
    double price = priceBefore - priceBefore * taxRate;
    System.out.println(student.getName() + "税后实际收入" + price);
	}

}
7.实例化两个学生对象,和两个实验室对象。

 Student student1 = new Student(100001, "张三");
        Student student2 = new Student(100001, "李四");
	ClassRoom computerRoom = new ClassRoom("computerRoom001", "计算机网络实验室");
	ClassRoom compositionRoom = new ClassRoom("compositionRoom001", "组成原理实验室");
8.将上述程序中输入语句输入的值赋给TaxRate,并且根据处理情况，在程序中考虑做异常处理。

while (true) {
	try {
	CaculatePrice.taxRate = Double.parseDouble(scanner.next());
	break;
		} catch (Exception e) 
{
	System.err.println("纳税标准输入格式不正确");
	System.out.println("请输入国家最新纳税标准:");
			}
		}
六、程序运行结果截图
输入图片说明
七、感想与心得
通过亲自动手设计学生实验室勤工俭学模拟系统，我对static,final等修饰符的用法有了进一步的认识,将老师在课堂上讲的理论的东西经过动手操作转化为实际上的东西,这使我更加掌握这些知识。
我明白了static可以修饰代码块和变量，而final可以修饰变量和类。static 表示静态的，从始至终只获得一块内存空间。而且这块空间的资源还具有“全局性”，就是说所有的成员都可以无条件引用,另外，static修饰的不用程序调用，只要该类被执行，static修饰的也被执行。final表示最终的,它修饰的类不能有子类。它修饰的变量是不可变的常数,所以final的变量要立刻赋值。
在编译时也遇到了很多报错，但根据错误提示多次修改，最终也得以改正。也发现了自己对和数组这部分知识点的掌握依旧不是很牢靠，要加深数组方面的学习。通过老师提出的修改建议，我知道了要将静态的方法单独创建一个类，方便程序的书写和阅读，也能避免很多错误。最后，也希望更加深入地去学习java的其它内容，提高自己的编程与逻辑分析能力。以及异常检测的必要性，给编写代码有了更精确的错误识别，便于程序员更改和增删，我会继续学习和练习。