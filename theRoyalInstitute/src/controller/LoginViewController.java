package controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class LoginViewController {
    public JFXPasswordField pwdPassword;
    public JFXTextField txtEmail;

    public void LoginOnAction(ActionEvent actionEvent) throws IOException {
//        String email = txtEmail.getText().trim();
//        String password = pwdPassword.getText().trim();
//
//        if (email.length()>0 && password.length()>0){
//            if (email.equalsIgnoreCase("tharindugamage0414@gmail.com") && password.equalsIgnoreCase("1234")){

                URL resource = this.getClass().getResource("/view/Dashboardview.fxml");
                Parent load = FXMLLoader.load(resource);
                Scene scene = new Scene(load);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
//            }else {
//                new Alert(Alert.AlertType.WARNING,"Try Again !!", ButtonType.OK,ButtonType.NO).show();
//            }
//        }else {
//            new Alert(Alert.AlertType.WARNING,"Empty !!", ButtonType.OK, ButtonType.NO).show();
//        }
    }
}
