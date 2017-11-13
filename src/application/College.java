package application;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class College implements Serializable {

	public List<Member> MemberList;
	public List<Admin> adminList;
	public List<Faculty> FacultyList;
	public List<Student> StudentList;
	public List<Request> RequestList;
	public List<Course> CourseList;
	public List<event> events;
	public List<Room> rooms;
	public HashSet<String> emails;
	public HashMap<String,event> hashmap;
	
	public College(){
		MemberList=new ArrayList<Member>();
		adminList=new ArrayList<Admin>();
		FacultyList=new ArrayList<Faculty>();
		StudentList=new ArrayList<Student>();
		RequestList=new ArrayList<Request>();
		CourseList=new ArrayList<Course>();
		events=new ArrayList<event>();
		rooms=new ArrayList<Room>();
		hashmap=new HashMap<String,event>();
		emails=new HashSet<String>();
	}
	public	void	serialize()	throws	IOException	{

		ObjectOutputStream out	=	null;	
		try	{	
			out	=	new	ObjectOutputStream	(new FileOutputStream("Admin/"+"IIITD"+".txt"));	
			out.writeObject(this);	
		}	
		finally
		{	
			out.close();	
		}
	}
	public	static College deserialize(String u) throws	IOException,	ClassNotFoundException {ObjectInputStream	in	=	null;	
	try	{	
		String fo="Admin/"+"IIITD";
		in	=		new	ObjectInputStream	(	new	FileInputStream(fo));	
		College	s1	=	(College)	in.readObject();		
		return s1;

	}	finally	{	
		in.close();	
	}	
	}
	
	public List<Member> getMemberList() {
		return MemberList;
	}
	public void setMemberList(List<Member> memberList) {
		MemberList = memberList;
	}
	public List<Admin> getAdminList() {
		return adminList;
	}
	public void setAdminList(List<Admin> adminList) {
		this.adminList = adminList;
	}
	public List<Faculty> getFacultyList() {
		return FacultyList;
	}
	public void setFacultyList(List<Faculty> facultyList) {
		FacultyList = facultyList;
	}
	public List<Request> getRequestList() {
		return RequestList;
	}
	public void setRequestList(List<Request> requestList) {
		RequestList = requestList;
	}
	
	
	

public	void	serialize(College s1)	throws	IOException	{
	
	ObjectOutputStream out	=	null;	
	try	{	
		out	=	new	ObjectOutputStream	(new FileOutputStream("College/"+s1.hashCode()+".txt"));	
		out.writeObject(s1);	
		}	
	finally
	{	
			out.close();	
		}
		}
public	static	College deserialize() throws	IOException,	ClassNotFoundException {ObjectInputStream	in	=	null;	
								try	{	
									String fo="College.txt";
								in	=		new	ObjectInputStream	(	new	FileInputStream(fo));	
												College	s1	=	(College)	in.readObject();		
												return s1;

								}	finally	{	
												in.close();	
								}	
				}


	
}
