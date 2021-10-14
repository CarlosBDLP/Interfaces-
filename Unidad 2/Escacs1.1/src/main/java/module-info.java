module com.example.ejercicio01 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.ejercicio01 to javafx.fxml;
    exports com.example.ejercicio01;
}