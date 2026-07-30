package com.jaqueline.estoque;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.stream.BaseStream;

public class LoginApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LoginApplication.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 500);
        stage.setTitle("Pagina da Jaqueline!");
        stage.getIcons().add(new Image(LoginApplication.class.getResourceAsStream("img/packages.png")));
        stage.setScene(scene);
        stage.show();
    }
}
