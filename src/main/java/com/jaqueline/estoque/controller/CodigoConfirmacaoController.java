package com.jaqueline.estoque.controller;

import com.jaqueline.estoque.service.RecuperacaoSenhaService;
import com.jaqueline.estoque.util.GerenciadorTela;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CodigoConfirmacaoController {

    @FXML
    private Label codigoRecuperacao;

    @FXML
    private TextField codigoInformado;

    @FXML
    private Label codigoInvalido;

    private  RecuperacaoSenhaService service;

    public void codigoConfirmacao(RecuperacaoSenhaService service, String codigoGerado){
        this.service = service;
        codigoRecuperacao.setText(codigoGerado);
    }



    @FXML
    protected void aoValidarCodigo() throws IOException {

        String codigo = codigoInformado.getText();
        if (!service.validarCodigo(codigo)){
           codigoInvalido.setVisible(true);
           return;
       }

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/jaqueline/estoque/novaSenha.fxml"));
        Parent root =  fxmlLoader.load();

        NovaSenhaController controller = fxmlLoader.getController();
        controller.novaSenha(service);

        Scene scene = new Scene(root);
        Stage stage = (Stage) codigoRecuperacao.getScene().getWindow();
        stage.setTitle("Nova Senha");
        stage.setScene(scene);
        stage.show();


    }
}
