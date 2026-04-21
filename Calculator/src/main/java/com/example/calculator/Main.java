package com.example.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("calculator-view.fxml"));
        Scene sc = new Scene(loader.load());
        primaryStage.setTitle("Máy tính");
        primaryStage.setScene(sc);
        primaryStage.show();
    }
}
