package Inheritence;

public class Room {
	private int roomno;
	private String roomtype;
	private double roomarea;
	private String ACmachine;
	
	void setdata(int roomno,String roomtype,double roomarea,String ACmachine) {
		this.roomno = roomno;
		this.setRoomtype(roomtype);
		this.roomarea=roomarea;
		this.ACmachine=ACmachine;
	}
	
	void displaydata() {
		System.out.println("roomno: "+roomno+" roomtype "+roomarea+" AC machine: "+ACmachine);
	}

	public String getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
}
