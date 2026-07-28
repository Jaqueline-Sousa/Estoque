package Controller;

import com.jaqueline.estoque.util.GerenciadorTela;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.TextFlow;

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

            GerenciadorTela.getIntancia().trocarTela(event, "menu.fxml", "Sistema de Estoque - login");




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
