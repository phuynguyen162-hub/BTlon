package com.example.nvtuan7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainController {

    @FXML
    private Button btn;
    @FXML
    private Button btn2;
    @FXML
    private VBox productContainer;

    @FXML
    void Handle(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Product.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void Handle2(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Product2.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
