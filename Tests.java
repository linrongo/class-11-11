
public class Tests {
	private String Name;
	private String date;
	private int roomNum;
	
	public Tests() {
		Name = null;
		date = null;
		roomNum = -1;
	}
	
	public Tests(String name, String date, int room) {
		this.Name = name;
		this.date = date;
		this.roomNum = room;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	

}
