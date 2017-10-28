
public class Admin extends Member{
 private void book_room(Room r) {
	 this.MyBookings.add(r);
	 
 }
 private void respond_Req(Request req) {
	 
	 req.setStatus(true);
	 
 }
 
	@Override
	protected void ViewRooms() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void Cancel_Bookings() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void Display_Page() {
		// TODO Auto-generated method stub
		
	}

}
