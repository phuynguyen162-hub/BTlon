package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window;
    Scene scene1, scene2;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        //scence1
        Label label = new Label("Hello");
        Button btn = new Button("Ấn vào, nếu là chó.");
        btn.setOnAction(actionEvent -> {
            window.setScene(scene2);
        });
        Button troll = new Button("Nếu bạn là con người.");
        VBox layout1 = new VBox();
        layout1.getChildren().addAll(label,btn, troll);
        scene1 = new Scene(layout1, 300, 200);

        //scene2
        Label label1 = new Label("Biết ngay mà:))");
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(label1);
        scene2 = new Scene(layout2,300,200);

        window.setScene(scene1);
        window.show();
    }
}
