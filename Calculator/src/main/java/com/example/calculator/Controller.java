package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    double firstNumber = 0;
    String operator = "";
    boolean isNewNumber = true;
    @FXML
    private TextField display;

    @FXML
    void bang(ActionEvent event) {
        double secondNumber = Double.parseDouble(display.getText());
        double result = 0;
        switch (operator) {
            case "+": result = firstNumber + secondNumber; break;
            case "-": result = firstNumber - secondNumber; break;
            case "x": result = firstNumber * secondNumber; break;
            case "/": result = firstNumber / secondNumber; break;
        }
        display.setText(String.valueOf(result));
        isNewNumber = true;
    }

    @FXML
    void handle(ActionEvent event) {
        Button btn = (Button) event.getSource();
        if(isNewNumber = true) {
            display.setText(btn.getText());
            isNewNumber = false;
        }else{
            display.setText(display.getText() + btn.getText());
        }
    }

    @FXML
    void tinh(ActionEvent event) {
        Button btn = (Button) event.getSource();
        firstNumber = Double.parseDouble(display.getText());
        operator = btn.getText();
        isNewNumber = true;
    }

}
