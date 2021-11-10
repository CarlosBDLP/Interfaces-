package es.cipfpbatoi.di.log_form_calc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

    public class LoginController extends DatosController implements Initializable {

        @FXML
        private Label TitleText;

        @FXML
        private Button loginButton;

        @FXML
        private Label passLabel;

        @FXML
        private TextField passText;

        @FXML
        private Label userLabel;

        @FXML
        private TextField userText;

        @FXML
        public Label errorLabel = new Label();

        @FXML
        private Label successLabel;

        @FXML
        void iniciarSesion(ActionEvent event) {
            String username = "Carlos";
            String password = "kolda";

            if (!userText.getText().equals(username) || !passText.getText().equals(password)) {
                errorLabel.setVisible(true);
                successLabel.setVisible(false);
            } else {
                errorLabel.setVisible(false);
                successLabel.setVisible(true);
            }
        }
    }
