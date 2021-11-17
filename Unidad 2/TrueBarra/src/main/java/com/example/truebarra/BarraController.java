package com.example.truebarra;

import javafx.animation.Animation;
import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class BarraController  implements Initializable {

    @FXML
    private ProgressBar barraCargar;

    @FXML
    private ImageView IconoPan;


    public BarraController() {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        TranslateTransition dash = new TranslateTransition();
        dash.setDuration(Duration.millis(1000));
        dash.setFromX(10);
        dash.setToX(353);
        dash.setNode(IconoPan);
        // dash.setAutoReverse(true);
        // dash.play();

        RotateTransition rotate = new RotateTransition();
        //rotate.setCycleCount(2);
        rotate.setDuration(Duration.millis(2000));

        rotate.setAxis(Rotate.Z_AXIS);
        rotate.setByAngle(360);
        rotate.setAutoReverse(true);
        rotate.setNode(IconoPan);
        //rotate.setAutoReverse(true);
        // rotate.play();

        ParallelTransition parallel = new ParallelTransition(dash,rotate);
        parallel.setCycleCount(Animation.INDEFINITE);
        parallel.setAutoReverse(true);
        parallel.play();
    }

}
