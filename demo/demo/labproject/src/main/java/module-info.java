module com.example.labproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.labproject to javafx.fxml;
    exports com.example.labproject;
}