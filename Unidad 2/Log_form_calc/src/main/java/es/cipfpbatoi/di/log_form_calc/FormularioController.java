package es.cipfpbatoi.di.log_form_calc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;

import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class FormularioController extends DatosController implements Initializable {

    @FXML
    private TextField nombre;

    @FXML
    private TextField apellido;

    @FXML
    private TextArea comentario;

    @FXML
    private ToggleGroup genero;

    @FXML
    private RadioButton GHombre;

    @FXML
    private RadioButton GMujer;

    @FXML
    private ChoiceBox<String> ciudad;

    @FXML
    private ChoiceBox<String> sistema;

    @FXML
    private Slider tiempoPC;

    @FXML
    private DatePicker fecha;

    @FXML
    private Button botonRegistro;

    public void elegirCiudad(MouseEvent mouseEvent) {
        ciudad.getItems().setAll("Jijona", "Alicante", "Barcelona");
    }

    public void elegirSistema(MouseEvent mouseEvent) {
        sistema.getItems().setAll("Windows", "Linux", "iOS");
    }

    @FXML
    void nuevoUsuario(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(Menu.class.getResource("datos.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 500);
        stage.setTitle("Usuario creado");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
        System.out.println("Usuario guardado ");

        DatosController datosController = (DatosController) fxmlLoader.getController();
        datosController.nombreLabel.setText(nombre.getText());
        datosController.apellidoLabel.setText(apellido.getText());
        datosController.comentarioLabel.setText(comentario.getText());
        datosController.ciudadLabel.setText(ciudad.getValue());

        if (GHombre.isSelected()) {
            datosController.generoLabel.setText(GHombre.getText());
        } else if (GMujer.isSelected()) {
            datosController.generoLabel.setText(GMujer.getText());
        } else
            datosController.generoLabel.setText("Indefinido");

        datosController.sistemaLabel.setText(sistema.getValue());
        datosController.horasPc.setText(String.valueOf((int) tiempoPC.getValue()));
        datosController.sistemaLabel.setText(sistema.getValue());
        datosController.fechaRealizacion.setText(String.valueOf(fecha.getValue()));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}