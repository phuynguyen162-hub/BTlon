module com.example.nvtuan7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.nvtuan7 to javafx.fxml;
    exports com.example.nvtuan7;
}