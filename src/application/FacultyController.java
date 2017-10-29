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


public class FacultyController {

    @FXML
    Button tt;
    @FXML
    Button myprof ;
    @FXML
    Button cou1;
    @FXML
    Button cou2;
    @FXML
    Button cou3;
    @FXML
    Button viewroom;
    @FXML
    Button myroom;
    @FXML
    Button logout;
    @FXML
    AnchorPane Pane5;
   
    @FXML
    private void ttClick(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) tt.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("TimeTablefaculty.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
    @FXML
    private void myprofClick(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) myprof.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Faculty.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
    @FXML
    private void myrooClick(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) myroom.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("pending.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
    @FXML
    private void viewroomClick(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) viewroom.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("View_Roomsf.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
    @FXML
    private void LoginClick(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) logout.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
    @FXML
    private void cou1Click(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) cou1.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Coursef.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
    @FXML
    private void cou2Click(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) cou2.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Coursef.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
    @FXML
    private void cou3Click(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) cou3.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Coursef.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
}
