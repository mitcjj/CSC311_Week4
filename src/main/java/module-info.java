module org.example.csc311_week4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.csc311_week4 to javafx.fxml;
    exports org.example.csc311_week4;
}