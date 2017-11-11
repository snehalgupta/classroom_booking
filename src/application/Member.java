package application;

import java.io.Serializable;
import java.util.List;

public abstract class Member implements Serializable {
	public College thisCollege;
	public List<Room> MyBookings;
	public String Name;
	public Member(College thisCollege, List<Room> myBookings, String name, String email, String password) {
		super();
		this.thisCollege = thisCollege;
		MyBookings = myBookings;
		Name = name;
		this.email = email;
		this.password = password;
	}
	public String email;
	public String password;
	
	public abstract void ViewRooms() ;
	public abstract void Cancel_Bookings() ;
	public abstract void Display_Page() ;
	
	 
	
	public List<Room> getMyBookings() {
		return MyBookings;
	}
	public void setMyBookings(List<Room> myBookings) {
		MyBookings = myBookings;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}






