package com.jaqueline.estoque;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private TextField usuario;

    @FXML
    private PasswordField senha;

    @FXML
    private TextFlow erroDados;

    private final String usuarioCadastrado = "Jaqueline@gmail.com";
    private final String senhaCadastrada = "986861";

    @FXML
    protected void aoApertarBotao(ActionEvent event) throws IOException {

        if ( usuarioCadastrado.equalsIgnoreCase(usuario.getText()) && senhaCadastrada.equals(senha.getText())){
            System.out.println("Login efetuado com Sucesso");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("home.fxml"));
            Scene scene = new Scene(loader.load());
            Stage stage = (Stage)  ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("home");
            stage.show();




            erroDados.setVisible(false);
        } else {
            erroDados.setVisible(true);
        }

    }
    @FXML
    protected void aoEsquecerSenha(){
        System.out.println("Voce esqueceu! Já não é problema meu.");
    }
}
