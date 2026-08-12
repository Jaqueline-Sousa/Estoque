package com.jaqueline.estoque.controller;

import com.jaqueline.estoque.model.Usuario;
import com.jaqueline.estoque.model.UsuarioDAO;
import com.jaqueline.estoque.util.Constantes;
import com.jaqueline.estoque.util.GerenciadorTela;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.TextFlow;

import java.io.IOException;

public class CadastroController {

    @FXML
    private TextField usuarioCadastrar;

    @FXML
    private PasswordField senhaCadastrar;

    @FXML
    private PasswordField confirmarSenha;

    @FXML
    private Label usuarioInvalido;

    @FXML
    private TextFlow erroSenha;

    @FXML
    private Label senhaInvalida;

    private static UsuarioDAO dbUsuario = UsuarioDAO.getInstancia();

    @FXML
    protected void aoConfirmarCadastro(ActionEvent event) throws IOException {

        String usuario = usuarioCadastrar.getText();



        if (usuario.isBlank() || !usuario.matches(Constantes.REGEX_EMAIL.getValor()) ) {
            usuarioInvalido.setVisible(true);
            return;
        }

        String senha = senhaCadastrar.getText();
        if (senha.isBlank() || !senha.matches(Constantes.REGEX_SENHA.getValor())) {

            senhaInvalida.setVisible(true);
            return;
        }

        String senhaConfirmacao = confirmarSenha.getText();
        if (!senhaConfirmacao.equals(senha)) {
            erroSenha.setVisible(true);
            return;

        }

        Usuario novoUsuario = new Usuario(usuario, senha);
        dbUsuario.cadastrarUsuario(novoUsuario);

        GerenciadorTela.getIntancia().trocarTela(event, "Login.fxml", "Sistema de Estoque - Login");
    }


    @FXML
    protected void aoAcessarLogin(MouseEvent event) throws IOException {
        GerenciadorTela.getIntancia().trocarTela(event, "Login.fxml", "Sistema de Estoque - Login");

    }

}