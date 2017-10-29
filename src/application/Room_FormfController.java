package application;

import java.io.IOException;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class Room_FormfController {

    @FXML
    Button btn0;
    @FXML
    Button btn1;
    @FXML
    Label label;
   
   
    @FXML
    private void btn0Click(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) btn0.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Faculty.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
    @FXML
    private void btn1Click(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) btn1.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("View_Roomsf.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
      
}

