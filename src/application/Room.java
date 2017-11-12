package application;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Room implements Serializable {
private boolean availabilty;
public String Room_number;
private int Capacity;


public Room(String n1){
	Room_number=n1;
}
public boolean isAvailabilty() {
	return availabilty;
}
public void setAvailabilty(boolean availabilty) {
	this.availabilty = availabilty;
}
public String getRoom_number() {
	return Room_number;
}
public void setRoom_number(String room_number) {
	Room_number = room_number;
}
public int getCapacity() {
	return Capacity;
}
public void setCapacity(int capacity) {
	Capacity = capacity;
}
public Room(boolean availabilty, String room_number, int capacity) {
	super();
	this.availabilty = availabilty;
	Room_number = room_number;
	Capacity = capacity;
}

public	void	serialize()	throws	IOException	{
	
	ObjectOutputStream out	=	null;	
	try	{	
		out	=	new	ObjectOutputStream	(new FileOutputStream("./Room/"+Room_number+".txt"));	
		out.writeObject(this);	
		}	
	finally
	{	
			out.close();	
		}
		}
public	static	Room deserialize(String u) throws	IOException,	ClassNotFoundException {ObjectInputStream	in	=	null;	
								try	{	
									String fo="Room/"+u;
								in	=		new	ObjectInputStream	(	new	FileInputStream(fo));	
												Room	s1	=	(Room)	in.readObject();	
												return s1;
								}	finally	{	
												in.close();	
								}	
				}


}

