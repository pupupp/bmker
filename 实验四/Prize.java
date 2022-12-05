package ѧ��ʵ�����ڹ���ѧģ��;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Prize {
 public static final int x = 15;// ����15Ԫ
 public static final int y = 12;// ����12Ԫ
 public static Double taxRate = null;// ˰��
 public static final int weekCount = 18;// ������
 public static Map<String, List<Student>> roomStudentMap = null;

 public static void dePartureRoom(Student student, Laboratory classRoom) {
  System.out.println( classRoom.getRoomName() + "�����" + student.getName() + "");
  String roomId = classRoom.getId();
  if (roomStudentMap == null) {
   roomStudentMap = new HashMap<String, List<Student>>();
   List<Student> studentIdList = new ArrayList<Student>();
   studentIdList.add(student);
   roomStudentMap.put(roomId, studentIdList);
  } else {
   if (roomStudentMap.get(roomId) == null) {
    List<Student> studentIdList = new ArrayList<Student>();
    studentIdList.add(student);
    roomStudentMap.put(roomId, studentIdList);
   } else {
    List<Student> studentIdList = roomStudentMap.get(roomId);
    studentIdList.add(student);
    roomStudentMap.put(roomId, studentIdList);
   }
  }
 }

 public static void calculateAccout(Student student) {
  int excelentCount = student.getExcellentCount();
  int passCount = student.getPassCount();
  int priceBefore = x * excelentCount + y * passCount;
  System.out.println(student.getName() + "�ڹ���ѧ����" + priceBefore);
  double price = priceBefore - priceBefore * taxRate;
  System.out.println(student.getName() + "˰��ʵ������" + price);
 }

}