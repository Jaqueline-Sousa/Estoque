package com.jaqueline.estoque.controller;

import com.jaqueline.estoque.util.GerenciadorTela;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Map;

public class LoginController {
    @FXML
    private TextField usuario;

    @FXML
    private PasswordField senha;

    @FXML
    private TextFlow erroDados;


    private Map<String, String> usuariosCadastrados = Map.of(
           "admin@gmail.com", "admin",
           "jaqueline@gmail.com", "986861",
           "funci@gmail.com", "1234"
   );

    @FXML
    protected void aoApertarBotao(ActionEvent event) throws IOException {

        String usuarioDigitado = usuario.getText().toLowerCase();
        String senhaDigitada = senha.getText();

        if ( usuariosCadastrados.containsKey(usuarioDigitado) && usuariosCadastrados.get(usuarioDigitado).equals(senhaDigitada) ){

            GerenciadorTela.getIntancia().trocarTela(event, "menu.fxml", "Sistema de Estoque -  Menu");

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
