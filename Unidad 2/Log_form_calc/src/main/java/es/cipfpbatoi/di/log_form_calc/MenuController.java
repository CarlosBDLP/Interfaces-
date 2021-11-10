package es.cipfpbatoi.di.log_form_calc;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {

    @FXML
    void Login(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(Menu.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
        System.out.println("Abriendo  login");
    }

    @FXML
    void Formulario(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(Menu.class.getResource("formulario.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 462);
        stage.setTitle("Formulario");
        stage.setScene(scene);
        stage.show();
        System.out.println("Abriendo formulario");
    }

    @FXML
    void Calculadora(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(Menu.class.getResource("calculadora.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 346, 480);
        stage.setTitle("Calculadora");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
        System.out.println("Abriendo calculadora");
    }
}
//pantalla2Controller v2pantalla2Controller(pantalla2Controller) fmxloader.getController();
//v2pamtalla2Controller.label2.setText(txtfield.getText())
