package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class CourseController {

    
    @FXML
    Button back;
   
    @FXML
    private void homepage1(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) back.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Student.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
   
}

