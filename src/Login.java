import java.io.BufferedReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Login {
	Member current_user;
	@SuppressWarnings("null")
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int Value =0;
		System.out.println("Satrt AFRESH");
		System.out.println("Enter 1 for databse");
		System.out.println("Enter 2 for prev session");
		Value=	Integer.parseInt(reader.readLine());
		College currCollege=new College();
		List<Student> StudentList = null; 
		List<Admin> AdminList = null;
		List<Faculty> FacultyList = null;

		List<Room> RoomList = null;
		List<Course> CourseList = null; 
		List<Request>  RequestList=null;


		if(Value==1)
		{
			/**
			 * LOAD FROM DATABASE
			 */
			System.out.println("LOADING");
		}
		else
		{
			try {
				//File CollegeFile= new File("College.txt");
				{
					//College
					currCollege=College.deserialize();
				}
				{
					//Student

					File StudentFile= new File("Student/");
					for(String s :StudentFile.list())
					{
					StudentList.add(Student.deserialize(s));
					}

					File RoomFile= new File("Room/");
					for(String s :RoomFile.list())
					{
					RoomList.add(Room.deserialize(s));
					}
					File CourseFile= new File("Course/");
					for(String s :CourseFile.list())
					{
					CourseList.add(Course.deserialize(s));
					}
					File FacultyFile= new File("Faculty/");
					for(String s :FacultyFile.list())
					{
					FacultyList.add(Faculty.deserialize(s));
					}
					File AdminFile= new File("Admin/");
					for(String s :AdminFile.list())
					{
					AdminList.add(Admin.deserialize(s));
					}
					File RequestFile= new File("Request/");
					for(String s :RequestFile.list())
					{
					RequestList.add(Request.deserialize(s));
					}
					
String[] arrr=reader.readLine().split(" ");





				}

			}
			catch(Exception FileNotFound)
			{

			}

















		}


	}
}
