import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Course {
public Room room_allocated;
public String TimeStamp;
public int audience;
public List<String> postconditions;
public List<String> preconditions;
public boolean findkeyword(String tomatch)
{
	for(String find : preconditions)
	{
		if(find.equals(tomatch))
		{
			return true;
		}
	}
	for(String find : postconditions)
	{
		if(find.equals(tomatch))
		{
			return true;
		}
	}
	return false;
}

public	void	serialize(Course s1)	throws	IOException	{
	
	ObjectOutputStream out	=	null;	
	try	{	
		out	=	new	ObjectOutputStream	(new FileOutputStream("Course/"+s1.getRoom_allocated()+".txt"));	
		out.writeObject(s1);	
		}	
	finally
	{	
			out.close();	
		}
		}
public	static	Course deserialize(String u) throws	IOException,	ClassNotFoundException {ObjectInputStream	in	=	null;	
								try	{	
									String fo="Course/"+u;
								in	=		new	ObjectInputStream	(	new	FileInputStream(fo));	
												Course	s1	=	(Course)	in.readObject();		
												return s1;

								}	finally	{	
												in.close();	
								}	
				}




public Room getRoom_allocated() {
	return room_allocated;
}
public void setRoom_allocated(Room room_allocated) {
	this.room_allocated = room_allocated;
}
public String getTimeStamp() {
	return TimeStamp;
}
public void setTimeStamp(String timeStamp) {
	TimeStamp = timeStamp;
}
public int getAudience() {
	return audience;
}
public void setAudience(int audience) {
	this.audience = audience;
}
public List<String> getPostconditions() {
	return postconditions;
}
public void setPostconditions(List<String> postconditions) {
	this.postconditions = postconditions;
}
public List<String> getPreconditions() {
	return preconditions;
}
public void setPreconditions(List<String> preconditions) {
	this.preconditions = preconditions;
}

}
