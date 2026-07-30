module com.jaqueline.estoque {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.materialdesign2;


    opens com.jaqueline.estoque to javafx.fxml;
    opens com.jaqueline.estoque.controller to javafx.fxml;
    opens com.jaqueline.estoque.model to javafx.base;

    exports com.jaqueline.estoque;
}