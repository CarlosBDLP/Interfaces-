module com.example.truebarra {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.truebarra to javafx.fxml;
    exports com.example.truebarra;
}