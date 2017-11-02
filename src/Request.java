import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Request implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 4867907038588692507L;
String purpose;
int ReqNum;
Room prefered_room;
int Capacity;
int pending_days;
boolean status;
public Request(String purpose, int reqNum, Room prefered_room, int capacity, int pending_days, boolean status) {
	this.purpose = purpose;
	ReqNum = reqNum;
	this.prefered_room = prefered_room;
	Capacity = capacity;
	this.pending_days = pending_days;
	this.status = status;
}
public String getPurpose() {
	return purpose;
}
public void setPurpose(String purpose) {
	this.purpose = purpose;
}
public int getReqNum() {
	return ReqNum;
}
public void setReqNum(int reqNum) {
	ReqNum = reqNum;
}
public Room getPrefered_room() {
	return prefered_room;
}
public void setPrefered_room(Room prefered_room) {
	this.prefered_room = prefered_room;
}
public int getCapacity() {
	return Capacity;
}
public void setCapacity(int capacity) {
	Capacity = capacity;
}
public int getPending_days() {
	return pending_days;
}
public void setPending_days(int pending_days) {
	this.pending_days = pending_days;
}
public boolean isStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}






public	void	serialize(Request s1)	throws	IOException	{
	
	ObjectOutputStream out	=	null;	
	try	{	
		out	=	new	ObjectOutputStream	(new FileOutputStream("Request/"+(s1.getReqNum())+".txt"));	
		out.writeObject(s1);	
		}	
	finally
	{	
			out.close();	
		}
		}
public	static	Request deserialize(String u) throws	IOException,	ClassNotFoundException {ObjectInputStream	in	=	null;	
								try	{	
									String fo="Request/"+u;
								in	=		new	ObjectInputStream	(	new	FileInputStream(fo));	
												Request	s1	=	(Request)	in.readObject();		
												return s1;

								}	finally	{	
												in.close();	
								}	
				}




















}
