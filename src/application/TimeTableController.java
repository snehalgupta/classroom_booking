package application;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class TimeTableController {

    @FXML
    Button timetable;
    @FXML
    Button myprof ;
    @FXML
    Button myroo;
    @FXML
    Button fetchc;
    @FXML
    AnchorPane Pane3;
   
    @FXML
    private void ttClick(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) timetable.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("TimeTable.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
    @FXML
    private void myprofClick(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) myprof.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Student.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
    @FXML
    private void myrooClick(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) myroo.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("pending.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
    @FXML
    private void fetchcClick(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) fetchc.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("FETCH.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
}


