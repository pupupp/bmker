package 学生实验室勤工俭学模拟;

import java.util.List;
import java.util.Scanner;

public class Mainfunction {

 public static void main(String[] args) {
  Student student1 = new Student(100001, "冯骥知");
  Student student2 = new Student(100001, "FFJZZ");
  Laboratory computerRoom = new Laboratory("computerRoom001", "计算机网络实验室");
  Laboratory compositionRoom = new Laboratory("compositionRoom001", "组成原理实验室");
  Prize.dePartureRoom(student1, computerRoom);
  Prize.dePartureRoom(student2, computerRoom);
  Prize.dePartureRoom(student1, compositionRoom);
  // 计算机网络实验室优秀次数
  int computerExcellentCount = 18;
  int computerPassCount = Prize.weekCount - computerExcellentCount;
  System.out.println("计算机网络实验室优秀次数:" + computerExcellentCount);
  System.out.println("计算机网络实验室合格次数:" + computerPassCount);
  List<Student> computerStudentList = Prize.roomStudentMap.get(computerRoom.getId());
  if (computerStudentList != null) {
   for (int i = 0; i < computerStudentList.size(); i++) {
    Student student = (Student) computerStudentList.get(i);
    student.setExcellentCount(student.getExcellentCount() + computerExcellentCount);
    student.setPassCount(student.getPassCount() + computerPassCount);
   }
  }

  // 组成原理实验室优秀次数
  int compositionExcellentCount = 18;
  int compositionPassCount = Prize.weekCount - compositionExcellentCount;
  System.out.println("组成原理实验室优秀次数:" + compositionExcellentCount);
  System.out.println("组成原理实验室合格次数:" + compositionPassCount);

  List<?> compositionStudentList = Prize.roomStudentMap.get(compositionRoom.getId());
  if (compositionStudentList != null) {
   for (int i = 0; i < compositionStudentList.size(); i++) {
    Student student = (Student) compositionStudentList.get(i);
    student.setExcellentCount(student.getExcellentCount() + compositionExcellentCount);
    student.setPassCount(student.getPassCount() + compositionPassCount);
   }
  }

  System.out.println("请输入国家最新纳税标准:");
  @SuppressWarnings("resource")
Scanner scanner = new Scanner(System.in);
  while (true) {
   try {
    Prize.taxRate = Double.parseDouble(scanner.next());
    break;
   } catch (Exception e) {
    System.err.println("纳税标准输入格式不正确");
    System.out.println("请输入国家最新纳税标准:");
   }
  }
  Prize.calculateAccout(student1);
  Prize.calculateAccout(student2);
 }

}