package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class CourseadController {

    
    @FXML
    Button back;
    @FXML
    Button add;
    @FXML
    Button drop;
    @FXML
    private void homepage1(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) back.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("FETCH.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
    @FXML
    private void homepage2(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) add.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("FETCH.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
    @FXML
    private void homepage3(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) drop.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("FETCH.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
}


