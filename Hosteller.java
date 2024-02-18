package com.src;

public class Hosteller extends Student {
	
	private String hostelName;
	private int roomNumber;
	
	public String getHostelName() {
		return hostelName;
	}
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	@Override
	public String toString() {
		return "Hosteller [hostelName=" + hostelName + ", roomNumber=" + roomNumber + ", studentId=" + studentId
				+ ", name=" + name + ", departmentId=" + departmentId + ", gender=" + gender + ", phone=" + phone + "]";
	}
	
	
	

}
