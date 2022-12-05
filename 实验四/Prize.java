package 学生实验室勤工俭学模拟;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Prize {
 public static final int x = 15;// 优秀15元
 public static final int y = 12;// 及格12元
 public static Double taxRate = null;// 税率
 public static final int weekCount = 18;// 总周数
 public static Map<String, List<Student>> roomStudentMap = null;

 public static void dePartureRoom(Student student, Laboratory classRoom) {
  System.out.println( classRoom.getRoomName() + "分配给" + student.getName() + "");
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
  System.out.println(student.getName() + "勤工俭学收入" + priceBefore);
  double price = priceBefore - priceBefore * taxRate;
  System.out.println(student.getName() + "税后实际收入" + price);
 }

}