import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Student extends Member{
	public Student(College thisCollege, List<Room> myBookings, String name, String email, String password) {
		super(thisCollege, myBookings, name, email, password);
		// TODO Auto-generated constructor stub
	}
	private List<Course> TimeTable;
	public  List<Request> MY_Req;

	public List<Course> search(List<String> r) {
		List<Course> returncourse = null;
		for(String sesa :r) {
//			for(Course c:thisCollege.CourseList) {
//				if(c.findkeyword(sesa)) {
//					returncourse.add(c)
//
//				}
//		}
		}
		return returncourse;
	}

	public Request Booking() {
		return null;
		
	}

	public List<Course> getTimeTable() {
		return TimeTable;
	}

	public void setTimeTable(List<Course> timeTable) {
		TimeTable = timeTable;
	}

	public List<Request> getMY_Req() {
		return MY_Req;
	}

	public void setMY_Req(List<Request> mY_Req) {
		MY_Req = mY_Req;
	}
	
	public	void	serialize(Student s1)	throws	IOException	{
		
		ObjectOutputStream out	=	null;	
		try	{	
			out	=	new	ObjectOutputStream	(new FileOutputStream("Student/"+s1.Name+".txt"));	
			out.writeObject(s1);	
			}	
		finally
		{	
				out.close();	
			}
			}
	public	static	Student deserialize(String u) throws	IOException,	ClassNotFoundException {ObjectInputStream	in	=	null;	
									try	{	
										String fo="Student/"+u;
									in	=		new	ObjectInputStream	(	new	FileInputStream(fo));	
													Student	s1	=	(Student)	in.readObject();		
													return s1;

									}	finally	{	
													in.close();	
									}	
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

	
	
}
