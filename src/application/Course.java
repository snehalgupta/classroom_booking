package application;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
class event{
	String day;
	String start;
	String end;
	List<Room> venue;
	
	public event(String n1,String n2,String n3,List<Room> n4){
		day=n1;
		start=n2;
		end=n3;
		venue=n4;
	}
	
	public String toString(){
		String ans=day+" "+start+" "+end;
		return ans;
	}
}
public class Course {
public String ismandatory;
public String name;
public String Code;
public String Instructor;
public int credits;
public String acronym;
public 	ArrayList<event> arr ;
public String[] preconditions;
public String[] postconditions;
public int audience;

public Course(String n1,String n2,String n3,String n4,int n5,String n6,ArrayList<event> n7,String[] n8,String[] n9){
	ismandatory=n1;
	name=n2;
	Code=n3;
	Instructor=n4;
	credits=n5;
	acronym=n6;
	arr=n7;
	preconditions=n8;
	postconditions=n9;
}

public String toString(){
	String ans=" ";
	String sd=ismandatory+" "+name+" "+Code+" "+Instructor+" "+credits+" "+acronym+"\n"+arr.size();
	String zx="";
	for(int i=0;i<arr.size();i++){
		zx+=arr.get(i).toString()+"\n";
	}
	ans=sd+"\n"+zx+postconditions[0];
	return ans;
}
public boolean findkeyword(String tomatch)
{
	/*for(String find : preconditions)
	{
		if(find.equals(tomatch))
		{
			return true;
		}
	}*/
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
		out	=	new	ObjectOutputStream	(new FileOutputStream("Course/"+".txt"));	
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





public int getAudience() {
	return audience;
}
public void setAudience(int audience) {
	this.audience = audience;
}
public String[] getPostconditions() {
	return postconditions;
}
public void setPostconditions(String[] postconditions) {
	this.postconditions = postconditions;
}
public String[] getPreconditions() {
	return preconditions;
}
public void setPreconditions(String[] preconditions) {
	this.preconditions = preconditions;
}

}
