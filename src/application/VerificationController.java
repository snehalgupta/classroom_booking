package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class VerificationController {

		College college;
    
	 @FXML
	    Button signup;
	    
	    @FXML
	    Button back;
	   
	  
	    @FXML
	    TextField validk;
	    
    
    String type;
   String key;
   String name;
   String email;
   String passwd;
    @FXML
    private void homepage(ActionEvent event) throws IOException{
    	Stage stage = null; 
        Parent root = null; 
        stage=(Stage) signup.getScene().getWindow();
        if(validk.getText().equals(key)){
        	if(type.equals("Admin")){
        		Admin a1=new Admin(college,name,email,passwd);
        		college.MemberList.add(a1);
        		college.adminList.add(a1);
        		a1.thisCollege=college;
        		a1.serialize();
        	}
        	else if(type.equals("Faculty")){
        		Faculty f1=new Faculty(college,name,email,passwd);
        		college.MemberList.add(f1);
        		college.FacultyList.add(f1);
        		f1.thisCollege=college;
        		f1.serialize();
        	}
        	else if(type.equals("Student")){
        		Student s1=new Student(college,name,email,passwd);
        		college.MemberList.add(s1);
        		college.StudentList.add(s1);
        		s1.thisCollege=college;
        		s1.serialize();
        	}
        root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();}
        else{
        	System.out.println("NOt a valid key");
        }
       }
    
    @FXML
    private void homepage1(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) back.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("SIGNUP.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
   
}


