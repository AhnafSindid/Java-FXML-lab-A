module com.mycompany.module5lab5 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.module5lab5 to javafx.fxml;
    exports com.mycompany.module5lab5;
}
