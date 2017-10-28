import java.util.List;

public abstract class Member {
//	protected College thisCollege;
	protected List<Room> MyBookings;
	protected String email;
	protected String password;
	
	protected abstract void ViewRooms() ;
	protected abstract void Cancel_Bookings() ;
	protected abstract void Display_Page() ;
	
	
	
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






