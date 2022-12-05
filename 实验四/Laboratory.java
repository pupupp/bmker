package 学生实验室勤工俭学模拟;

public class Laboratory {
	  private String id;
	  private String roomName;

	  public Laboratory(String id, String roomName) {
	   this.id = id;
	   this.roomName = roomName;
	  }

	  public String getId() {
	   return id;
	  }

	  public void setId(String id) {
	   this.id = id;
	  }

	  public String getRoomName() {
	   return roomName;
	  }

	  public void setRoomName(String roomName) {
	   this.roomName = roomName;
	  }
	 }
