package application;
	


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import com.opencsv.CSVReader;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.*;

import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			ArrayList<Student> StudentList = new ArrayList<Student>(); 
			ArrayList<Admin> AdminList = new ArrayList<Admin>();
			ArrayList<Faculty> FacultyList = new ArrayList<Faculty>();
			HashSet<Room> RoomList = new HashSet<Room>();
			ArrayList<Course> CourseList = new ArrayList<Course>(); 
			ArrayList<Request>  RequestList=new ArrayList<Request>();
			String csvFilename = "./src/Sample.csv";
			CSVReader csvReader = new CSVReader(new FileReader(csvFilename));
			String[] row = null;
			String day;
			String start=" ";
			String temp;
			String end=" ";
			String room;
			String ismandatory;
			String name;
			String Code;
			String Instructor;
			int credits;
			String acronym;
			ArrayList<String> days=new ArrayList<String>();
			days.add("Monday");
			days.add("Tuesday");
			days.add("Wednesday");
			days.add("Thursday");
			days.add("Friday");
			
			ArrayList<event> arr=new ArrayList<event>() ;
			List<String> preconditions=new ArrayList<String>();
			List<String> postconditions=new ArrayList<String>();
			List<Room> roo=new ArrayList<Room>();
			int audience ;
			row=csvReader.readNext();
			while((row = csvReader.readNext()) != null) {
				int py=0;
				ismandatory=row[0];
				name=row[1];
				Code=row[2];
				Instructor=row[3];
				credits=Integer.parseInt(row[4]);
				acronym=row[5];
				//System.out.println(name);
				for(int ey=6;ey<=10;ey++){
				temp=row[ey];
				int idx=0;
				if(temp.length()>0){
				for(int x=0;x<temp.length();x++){
					if(temp.charAt(x) == '-'){
						start=temp.substring(0,x);
						idx=x+1;
					}
					if(temp.charAt(x) == '$'){
						end=temp.substring(idx,x);
						Room r1=new Room(temp.substring(x+1));
						roo.add(r1);
						RoomList.add(r1);
					}
				}
				event e1=new event(days.get(py),start,end,roo);
				arr.add(e1);}
				//System.out.println("here1");
				/*if(roo.size()>0){
					System.out.println(roo.get(0).Room_number);
				}*/
				py+=1;
				//arr.add(e1);
				roo=new ArrayList<Room>();
				}
				String[] arq=row[11].split(" : ");
				if(row[11].length()>0){
				for(int j1=0;j1<arq.length;j1++){
					//System.out.println(arq[j1]);
					int co= 0;
					String dayz=" ";
					String startz=" ";
					String endz=" ";
					int endindex=0;
					int sez=0;
					int findi=0;
					ArrayList<Room> rooz=new ArrayList<Room>();
					for(int j2=0;j2<arq[j1].length();j2++){
						if(arq[j1].charAt(j2)=='$'){
							//System.out.println("yes");
							co+=1;
							if(co == 1){
								dayz=arq[j1].substring(0,j2-1);
								endindex=j2;
							}
							else if(co == 2){
								sez=j2;
								for(int iz=endindex+1;iz<j2;iz++){
									if(arq[j1].charAt(iz) == '-'){
										startz=arq[j1].substring(endindex+1,iz);
										endz=arq[j1].substring(iz+1,j2);
									}
								}
							}
						}
						else if(co == 2){
							co=1;
							int ecz=j2-1;
							for(int yuz=j2;yuz<arq[j1].length();yuz++){
								
								if(arq[j1].charAt(yuz) == ';'){
									Room r9=new Room(arq[j1].substring(ecz+1,yuz));
									rooz.add(r9);
									RoomList.add(r9);
									ecz=yuz;
									endindex=yuz;
								}
							}
						}
					}
					event e2=new event(dayz,startz,endz,rooz);
					/*System.out.println(dayz+" "+startz+" "+endz);
					for(int iu=0;iu<rooz.size();iu++){
						System.out.print(rooz.get(iu).Room_number+" ");
					}
					System.out.println();*/
					arr.add(e2);
					//System.out.println("here2");
				}
				}
					int co= 0;
					String dayz=" ";
					String startz=" ";
					String endz=" ";
					int endindex=0;
					int sez=0;
					int findi=0;
					ArrayList<Room> rooz=new ArrayList<Room>();
					for(int j2=0;j2<row[12].length();j2++){
						if(row[12].charAt(j2)=='$'){
							//System.out.println("yes");
							co+=1;
							if(co == 1){
								dayz=row[12].substring(0,j2-1);
								endindex=j2;
							}
							else if(co == 2){
								sez=j2;
								for(int iz=endindex+1;iz<j2;iz++){
									if(row[12].charAt(iz) == '-'){
										startz=row[12].substring(endindex+1,iz);
										endz=row[12].substring(iz+1,j2);
									}
								}
							}
						}
						else if(co == 2){
							co=1;
							int ecz=j2-1;
							for(int yuz=j2;yuz<row[12].length();yuz++){
								
								if(row[12].charAt(yuz) == ';'){
									Room r9=new Room(row[12].substring(ecz+1,yuz));
									rooz.add(r9);
									RoomList.add(r9);
									ecz=yuz;
									endindex=yuz;
								}
							}
						}
					}
					if(row[12].length()>0){
					event e2=new event(dayz,startz,endz,rooz);
					/*System.out.println(dayz+" "+startz+" "+endz);
					for(int iu=0;iu<rooz.size();iu++){
						System.out.print(rooz.get(iu).Room_number+" ");
					}
					System.out.println();*/
					arr.add(e2);}
					//System.out.println("herer3");
					String[] precw=row[13].split(" ");
					String[] postw=row[14].split(" ");
					/*if(precw.length>0){
						System.out.println(precw[0]);
					}
					if(postw.length>0){
						System.out.println(postw[0]);
					}*/
					Course c1=new Course(ismandatory,name,Code,Instructor,credits,acronym,arr,precw,postw);
					CourseList.add(c1);
					arr=new ArrayList<event>();
			}
			csvReader.close();
			for(int io=0;io<CourseList.size();io++){
				System.out.println(CourseList.get(io));
			}
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			int Value =0;
			System.out.println("Start AFRESH");
			System.out.println("Enter 1 for databse");
			System.out.println("Enter 2 for prev session");
			Value=	Integer.parseInt(reader.readLine());
			College currCollege=new College();
			


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
				catch(Exception e)
				{
					e.printStackTrace();
				}


			 FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(Main.class.getResource("HomePage.fxml"));
	            AnchorPane rootLayout = (AnchorPane) loader.load();

	            // Show the scene containing the root layout.
	            Scene scene = new Scene(rootLayout);
	            primaryStage.setScene(scene);
	            primaryStage.show();
		}
			}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
