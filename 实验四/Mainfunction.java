package ѧ��ʵ�����ڹ���ѧģ��;

import java.util.List;
import java.util.Scanner;

public class Mainfunction {

 public static void main(String[] args) {
  Student student1 = new Student(100001, "����֪");
  Student student2 = new Student(100001, "FFJZZ");
  Laboratory computerRoom = new Laboratory("computerRoom001", "���������ʵ����");
  Laboratory compositionRoom = new Laboratory("compositionRoom001", "���ԭ��ʵ����");
  Prize.dePartureRoom(student1, computerRoom);
  Prize.dePartureRoom(student2, computerRoom);
  Prize.dePartureRoom(student1, compositionRoom);
  // ���������ʵ�����������
  int computerExcellentCount = 18;
  int computerPassCount = Prize.weekCount - computerExcellentCount;
  System.out.println("���������ʵ�����������:" + computerExcellentCount);
  System.out.println("���������ʵ���Һϸ����:" + computerPassCount);
  List<Student> computerStudentList = Prize.roomStudentMap.get(computerRoom.getId());
  if (computerStudentList != null) {
   for (int i = 0; i < computerStudentList.size(); i++) {
    Student student = (Student) computerStudentList.get(i);
    student.setExcellentCount(student.getExcellentCount() + computerExcellentCount);
    student.setPassCount(student.getPassCount() + computerPassCount);
   }
  }

  // ���ԭ��ʵ�����������
  int compositionExcellentCount = 18;
  int compositionPassCount = Prize.weekCount - compositionExcellentCount;
  System.out.println("���ԭ��ʵ�����������:" + compositionExcellentCount);
  System.out.println("���ԭ��ʵ���Һϸ����:" + compositionPassCount);

  List<?> compositionStudentList = Prize.roomStudentMap.get(compositionRoom.getId());
  if (compositionStudentList != null) {
   for (int i = 0; i < compositionStudentList.size(); i++) {
    Student student = (Student) compositionStudentList.get(i);
    student.setExcellentCount(student.getExcellentCount() + compositionExcellentCount);
    student.setPassCount(student.getPassCount() + compositionPassCount);
   }
  }

  System.out.println("���������������˰��׼:");
  @SuppressWarnings("resource")
Scanner scanner = new Scanner(System.in);
  while (true) {
   try {
    Prize.taxRate = Double.parseDouble(scanner.next());
    break;
   } catch (Exception e) {
    System.err.println("��˰��׼�����ʽ����ȷ");
    System.out.println("���������������˰��׼:");
   }
  }
  Prize.calculateAccout(student1);
  Prize.calculateAccout(student2);
 }

}