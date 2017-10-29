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


public class AdminController {

    @FXML
    Button myprof;
    @FXML
    Button viewreq;
    @FXML
    Button bookr;
    @FXML
    Button logout;
    @FXML
    Button back;
    @FXML
    AnchorPane Pane4;
   
    @FXML
    private void myprofClick(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) myprof.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Admin.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
    @FXML
    private void viewreqClick(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) viewreq.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Requests.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
    @FXML
    private void bookrClick(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) bookr.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("View_Rooms.fxml"));
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


