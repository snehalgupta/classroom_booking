package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.util.Properties;    
import javax.mail.*;    
import javax.mail.internet.*; 

public class SignupController {
	College college;
    @FXML
    Button signup;
    
    @FXML
    Button back;
   
    @FXML
    AnchorPane Pane7;
    
    @FXML
    TextField emailid;
    @FXML
    TextField first;
    @FXML
    TextField last;
    @FXML
    PasswordField passwd;
    
    String type;
   
    @FXML
    private void homepage(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) signup.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Verification.fxml"));
        root = (Parent)fxmlLoader.load();
        //System.out.println(emailid.getText());
        double key=Math.random()*10000+1;
        String keys=String.valueOf(key);
        Mailer.send("snehalgupta10@gmail.com","student1001",emailid.getText(),"Confirmation key",keys);
        VerificationController controller = fxmlLoader.<VerificationController>getController();
        controller.type=type;
        controller.key=keys;
        controller.name=first.getText()+" "+last.getText();
        controller.email=emailid.getText();
        controller.passwd=passwd.getText();
        controller.college=college;
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       
       }
    
    @FXML
    private void homepage1(ActionEvent event) throws IOException{
        Stage stage = null; 
        Parent root = null; 
        stage=(Stage) back.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
   
}

class Mailer{  
    public static void send(String from,String password,String to,String sub,String msg){  
          //Get properties object    
          Properties props = new Properties();    
          props.put("mail.smtp.host", "smtp.gmail.com");    
          props.put("mail.smtp.socketFactory.port", "465");    
          props.put("mail.smtp.socketFactory.class",    
                    "javax.net.ssl.SSLSocketFactory");    
          props.put("mail.smtp.auth", "true");    
          props.put("mail.smtp.port", "465");    
          //get Session   
          Session session = Session.getDefaultInstance(props,    
           new javax.mail.Authenticator() {    
           protected PasswordAuthentication getPasswordAuthentication() {    
           return new PasswordAuthentication(from,password);  
           }    
          });    
          //compose message    
          try {    
           MimeMessage message = new MimeMessage(session);    
           message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));    
           message.setSubject(sub);    
           message.setText(msg);    
           //send message  
           Transport.send(message);    
           System.out.println("message sent successfully");    
          } catch (MessagingException e) {throw new RuntimeException(e);}    
             
    }  
}  

