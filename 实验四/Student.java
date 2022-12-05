package 学生实验室勤工俭学模拟;

public class Student {
	  private Integer id;
	  private String name;
	  private int excellentCount;
	  public int passCount;

	  public Student(Integer id, String name) {
	   this.id = id;
	   this.name = name;
	  }

	  public Integer getId() {
	   return id;
	  }

	  public void setId(Integer id) {
	   this.id = id;
	  }

	  public String getName() {
	   return name;
	  }

	  public void setName(String name) {
	   this.name = name;
	  }

	  public int getExcellentCount() {
	   return excellentCount;
	  }

	  public void setExcellentCount(int excellentCount) {
	   this.excellentCount = excellentCount;
	  }

	  public int getPassCount() {
	   return passCount;
	  }

	  public void setPassCount(int passCount) {
	   this.passCount = passCount;
	  }
	 }