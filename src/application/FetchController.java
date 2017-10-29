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


public class FetchController {

    @FXML
    Button timetable;
    @FXML
    Button myprof ;
    @FXML
    Button myroo;
    @FXML
    Button fetchc;
    @FXML
    Button back;
    @FXML
    AnchorPane Pane2;
    @FXML
    Button ap0;
    @FXML
    Button ap1;
    @FXML
    Button ap11;
    @FXML
    Button ap111;
    @FXML
    Button ap1111;
    @FXML
    Button ap1112;
    @FXML
    Button ap1113;
   
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
    private void myprofClick1(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) back.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Student.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
    @FXML
    private void couClick1(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) ap1.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Coursead.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
    @FXML
    private void couClick0(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) ap0.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Coursead.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
    @FXML
    private void couClick2(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) ap11.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Coursead.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
    @FXML
    private void couClick3(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) ap111.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Coursead.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
    @FXML
    private void couClick4(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) ap1111.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Coursead.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
    @FXML
    private void couClick5(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) ap1112.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Coursead.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
    @FXML
    private void couClick6(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) ap1113.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Coursead.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
}

