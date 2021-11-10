package es.cipfpbatoi.di.log_form_calc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

public class CalculadoraController extends MenuController implements Initializable {

        @FXML
        private TextField resultadoDisplay;

        @FXML
        private Button borrar;

        @FXML
        private Button cero;

        @FXML
        private Button cinco;

        @FXML
        private Button coma;

        @FXML
        private Button cuatro;

        @FXML
        private Button dividir;

        @FXML
        private Button dos;

        @FXML
        private Button igual;

        @FXML
        private Button multiplicar;

        @FXML
        private Button nueve;

        @FXML
        private Button ocho;

        @FXML
        private Button restar;

        @FXML
        private Button seis;

        @FXML
        private Button siete;

        @FXML
        private Button sumar;

        @FXML
        private Button tres;

        @FXML
        private Button uno;

        double resultado = 0;
        double entrada1;
        double entrada2;
        int ps;
        int punto;

        @FXML
        void Calculo(ActionEvent event) {

            if (event.getSource() == uno) {
                resultadoDisplay.appendText("1");
            } else if (event.getSource() == dos) {
                resultadoDisplay.appendText("2");
            } else if (event.getSource() == tres) {
                resultadoDisplay.appendText("3");
            } else if (event.getSource() == cuatro) {
                resultadoDisplay.appendText("4");
            } else if (event.getSource() == cinco) {
                resultadoDisplay.appendText("5");
            } else if (event.getSource() == seis) {
                resultadoDisplay.appendText("6");
            } else if (event.getSource() == siete) {
                resultadoDisplay.appendText("7");
            } else if (event.getSource() == ocho) {
                resultadoDisplay.appendText("8");
            } else if (event.getSource() == nueve) {
                resultadoDisplay.appendText("9");
            } else if (event.getSource() == cero) {
                resultadoDisplay.appendText("0");
            } else if (event.getSource() == coma && punto == 0) {
                resultadoDisplay.appendText(".");
                punto = 1;

            } else if (event.getSource() == borrar) {
                resultadoDisplay.setText("");
                entrada1 = 0;
                entrada2 = 0;
                ps = 0;
                punto = 0;
            } else if (event.getSource() == sumar) {
                entrada1 = Double.parseDouble(resultadoDisplay.getText());
                resultadoDisplay.setText("");
                ps = 1;
                punto = 0;
            } else if (event.getSource() == restar) {
                entrada1 = Double.parseDouble(resultadoDisplay.getText());
                resultadoDisplay.setText("");
                ps = 2;
                punto = 0;
            } else if (event.getSource() == multiplicar) {
                entrada1 = Double.parseDouble(resultadoDisplay.getText());
                resultadoDisplay.setText("");
                ps = 3;
                punto = 0;
            } else if (event.getSource() == dividir) {
                entrada1 = Double.parseDouble(resultadoDisplay.getText());
                resultadoDisplay.setText("");
                ps = 4;
                punto = 0;
            } else if (event.getSource() == igual && (ps > 0)) {
                entrada2 = Double.parseDouble(resultadoDisplay.getText());

                DecimalFormat td = new DecimalFormat("#.00");

                switch (ps) {
                    case 1:
                        resultado = entrada1 + entrada2;
                        resultadoDisplay.setText(String.valueOf(td.format(resultado)));
                        break;

                    case 2:
                        resultado = entrada1 - entrada2;
                        resultadoDisplay.setText(String.valueOf(td.format(resultado)));
                        break;

                    case 3:
                        resultado = entrada1 * entrada2;
                        resultadoDisplay.setText(String.valueOf(td.format(resultado)));
                        break;

                    case 4:
                        resultado = entrada1 / entrada2;
                        resultadoDisplay.setText(String.valueOf(td.format(resultado)));
                        break;
                }
                ps = 0;
            }
        }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}
