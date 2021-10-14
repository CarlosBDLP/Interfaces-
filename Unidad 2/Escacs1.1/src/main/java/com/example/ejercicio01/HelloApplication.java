package com.example.ejercicio01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.controlsfx.control.tableview2.filter.filtereditor.SouthFilter;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        stage.setTitle("Tablero");

        Group root = new Group();

        int c = 0;
        final int size = 50;
        int x = 0;
        int y = 0;

        for (int i = 0; i < 8; i++) {

            x = 0;

            for (int j = 0; j < 8; j++) {

                Rectangle rectangle = new Rectangle(size, size);

                if (i % 2 == 0) {

                    if (c % 2 == 0) rectangle.setFill(Color.GREY);
                    else rectangle.setFill(Color.LIGHTCYAN);

                } else {

                    if (c % 2 == 0) rectangle.setFill(Color.LIGHTCYAN);
                    else rectangle.setFill(Color.GREY);

                }


                rectangle.setX(x);
                rectangle.setY(y);

                Text text = new Text();
                text.setX(407);
                text.setY(200);
                text.setFill(Color.RED);

                root.getChildren().add(rectangle);
                root.getChildren().add(text);

                c++;
                x = x + 50;



                rectangle.setOnMouseClicked(mouseEvent -> {
                   text.setText("Esta posicion es  X " + rectangle.getX() + " y "+ "Esta es la posicion Y " + rectangle.getY());

                });


            }

            y = y + 50;


        }



        Scene scene = new Scene(root, 400, 400);
        stage.setScene(scene);
        stage.show();
    }



/*

    //Group root = new Group(rectangle1, rectangle2, rectangle3, rectangle4, rectangle5, rectangle6, rectangle7, rectangle8, rectangle10, rectangle11, rectangle12, rectangle13, rectangle14, rectangle15, rectangle16, rectangle17, rectangle19, rectangle20, rectangle21, rectangle22, rectangle23, rectangle24, rectangle25, rectangle26, rectangle28, rectangle29, rectangle30, rectangle31, rectangle32, rectangle33, rectangle34, rectangle35, rectangle37, rectangle38, rectangle39, rectangle40, rectangle41, rectangle42, rectangle43, rectangle44, rectangle46, rectangle47, rectangle48, rectangle49, rectangle50, rectangle51, rectangle52, rectangle53, rectangle55, rectangle56, rectangle57, rectangle58, rectangle59, rectangle60, rectangle61, rectangle62, rectangle64, rectangle65, rectangle66, rectangle67, rectangle68, rectangle69, rectangle70, rectangle71);
    Scene theScene = new Scene(root, 400, 400);
        stage.setScene(theScene);
        stage.show();
*/



    public static void main(String[] args) {
        launch();
    }
}