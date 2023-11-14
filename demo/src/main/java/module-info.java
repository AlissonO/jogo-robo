module engtelecom.poo {
    requires javafx.controls;
    requires javafx.fxml;

    opens engtelecom.poo to javafx.fxml;
    exports engtelecom.poo;
}
