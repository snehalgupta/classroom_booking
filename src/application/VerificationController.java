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

   
    
	 @FXML
	    Button signup;
	    
	    @FXML
	    Button back;
	   
	  
	    @FXML
	    TextField validk;
	    
    
    String type;
   String key;
    @FXML
    private void homepage(ActionEvent event) throws IOException{
    	Stage stage = null; 
        Parent root = null; 
        stage=(Stage) signup.getScene().getWindow();
        if(validk.equals(key)){
        
        
        root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));}
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
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


