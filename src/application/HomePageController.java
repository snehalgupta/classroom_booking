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


public class HomePageController {

    @FXML
    Button Admin;
    @FXML
    Button Faculty;
    @FXML
    Button Student;
    @FXML
    Button Login;
    @FXML
    AnchorPane Pane1;
   
    @FXML
    private void AdminClick(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SIGNUP.fxml"));
        stage=(Stage) Admin.getScene().getWindow();
        root = (Parent)fxmlLoader.load();
        SignupController controller = fxmlLoader.<SignupController>getController();
        controller.type="Admin";
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
    @FXML
    private void FacultyClick(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SIGNUP.fxml"));
        stage=(Stage) Faculty.getScene().getWindow();
        root = (Parent)fxmlLoader.load();
        SignupController controller = fxmlLoader.<SignupController>getController();
        controller.type="Faculty";
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
    @FXML
    private void StudentClick(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SIGNUP.fxml"));
        stage=(Stage) Student.getScene().getWindow();
        root = (Parent)fxmlLoader.load();
        SignupController controller = fxmlLoader.<SignupController>getController();
        controller.type="Student";
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
    @FXML
    private void LoginClick(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) Student.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Student.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
}