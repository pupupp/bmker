
### 一、实验目的
1. 掌握权限访问控制修饰符的使用；
2. 掌握继承的使用。

### 二、业务要求
1. 保持实验二的代码和readme版本不变；
2. 新建代码仓库，在实验二代码的基础上完成本次实验；
3. 业务过程同实验二，但在类的设计上，采用父类-子类的继承关系定义。
4. 测试实体类分别存放于不同的package中，验证权限访问控制、继承后属性及方法的可见性。

### 三、程序设计过程
1. 首先阅读题目，分析出需要寻找Student类和Teacher类的共同属性，并且创建新的People类作为他们的父类，这两个类作为People的子类继承属性。
2. 以实验二的程序为基础，将Student类、Teacher类共同的属性：number、name、sex、course的定义提出来放到父类People中，并且使用extends让Student类和Teacher类成为People的子类，从而继承父类中的这四个属性。

### 四、流程图
![输入图片说明]![](../../image.png)
### 五、关键代码
1. 新添加的People类，作为Student和Teacher的父类。
```java
public class Student extends People {
    Student(String a,String b,String c,Course[] d){
         number=a;
	 name=b;
	 sex=c;
	 course=d;
    }
```
2. Student类继承People类，
```java
public class Student extends People{
    public Student(String a,String b,char c,Course[] d,int e){
        number=a;
        name=b;
        sex=c;
        course=d;
    }
```
3. Teacher类继承People类，
```java
public class Teacher extends People{
    public Teacher(String a,String b,char c,Course[] d,int e){
        number=a;
        name=b;
        sex=c;
        course=d;
    }
```
### 六、系统运行截图
![输入图片说明](%E5%AE%9E%E9%AA%8C2%E8%BF%90%E8%A1%8C%E7%BB%93%E6%9E%9C%E6%88%AA%E5%9B%BE.jpg)
### 七、感想与体会
本次实验主要是掌握继承和权限访问控制修饰符的使用。大部分代码都是基于实验二的，只需要找到两个类中相同的属性然后提出来新建父类就可以完成了，是较为简单的一次实验。但是能够自己来进行实验，可以让自己更加深刻的记住关于继承的使用方法，在未来的实际编写中能够更加熟练的去使用。
