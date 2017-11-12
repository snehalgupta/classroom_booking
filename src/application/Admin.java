package application;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Admin extends Member{

	public Admin(College thisCollege, List<Room> myBookings, String name, String email, String password) {
		super(thisCollege, myBookings, name, email, password);
		// TODO Auto-generated constructor stub
	}
	private void book_room(Room r) {
		this.MyBookings.add(r);

	}
	private void respond_Req(Request req) {

		req.setStatus(true);

	}

	@Override
	public void ViewRooms() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Cancel_Bookings() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Display_Page() {
		// TODO Auto-generated method stub

	}

	public	void	serialize()	throws	IOException	{

		ObjectOutputStream out	=	null;	
		try	{	
			out	=	new	ObjectOutputStream	(new FileOutputStream("Admin/"+this.Name+".txt"));	
			out.writeObject(this);	
		}	
		finally
		{	
			out.close();	
		}
	}
	public	static	Admin deserialize(String u) throws	IOException,	ClassNotFoundException {ObjectInputStream	in	=	null;	
	try	{	
		String fo="Admin/"+u;
		in	=		new	ObjectInputStream	(	new	FileInputStream(fo));	
		Admin	s1	=	(Admin)	in.readObject();		
		return s1;

	}	finally	{	
		in.close();	
	}	
	}



}
