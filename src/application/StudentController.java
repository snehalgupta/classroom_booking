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


public class StudentController {

    @FXML
    Button timetable;
    @FXML
    Button myprof ;
    @FXML
    Button myroo1 ;
    @FXML
    Button cou1 ;
    @FXML
    Button cou2 ;
    @FXML
    Button cou3 ;
    @FXML
    Button myroo;
    @FXML
    Button fetchc;
    @FXML
    Button logout;
    @FXML
    AnchorPane Pane2;
   
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
        root = FXMLLoader.load(getClass().getResource("View_Rooms.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
    @FXML
    private void myroo1Click(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) myroo1.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("pendings.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
    @FXML
    private void couClick1(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) cou1.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Course.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
    @FXML
    private void couClick2(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) cou2.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Course.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
    @FXML
    private void couClick3(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) cou3.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Course.fxml"));
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
    @FXML
    private void logoutClick(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) logout.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
}

