module com.jaqueline.estoque {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jaqueline.estoque to javafx.fxml;
    exports com.jaqueline.estoque;
}