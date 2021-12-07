module me.cxii112.comboard {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    requires coreapi;

    opens me.cxii112.comboard to javafx.fxml;
    exports me.cxii112.comboard;
}
