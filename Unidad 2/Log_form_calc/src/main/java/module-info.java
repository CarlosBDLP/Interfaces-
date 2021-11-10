module es.cipfpbatoi.di.controlesmenus {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens es.cipfpbatoi.di.log_form_calc to javafx.fxml;
    exports es.cipfpbatoi.di.log_form_calc;
}