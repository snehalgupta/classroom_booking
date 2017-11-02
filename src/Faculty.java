import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Faculty extends Member {
	public Faculty(College thisCollege, List<Room> myBookings, String email, String password) {
		super(thisCollege, myBookings, email, password, password);
		// TODO Auto-generated constructor stub
	}
	private void book_room(Room r) {
		 this.MyBookings.add(r);
		 
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
	public	void	serialize(Faculty s1)	throws	IOException	{
		
		ObjectOutputStream out	=	null;	
		try	{	
			out	=	new	ObjectOutputStream	(new FileOutputStream("Faculty/"+s1.Name+".txt"));	
			out.writeObject(s1);	
			}	
		finally
		{	
				out.close();	
			}
			}
	public	static	Faculty deserialize(String u) throws	IOException,	ClassNotFoundException {ObjectInputStream	in	=	null;	
									try	{	
										String fo="Faculty/"+u;
									in	=		new	ObjectInputStream	(	new	FileInputStream(fo));	
													Faculty	s1	=	(Faculty)	in.readObject();		
													return s1;

									}	finally	{	
													in.close();	
									}	
					}


}
