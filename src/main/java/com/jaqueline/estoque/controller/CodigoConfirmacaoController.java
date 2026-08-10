package com.jaqueline.estoque.controller;

import com.jaqueline.estoque.service.RecuperacaoSenhaService;
import com.jaqueline.estoque.util.GerenciadorTela;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CodigoConfirmacaoController {

    @FXML
    private Label codigoRecuperacao;

    @FXML
    private TextField codigoInformado;

    @FXML
    private Label codigoInvalido;

    private final RecuperacaoSenhaService service = new RecuperacaoSenhaService();


    @FXML
    protected void aoValidarCodigo(ActionEvent event) throws IOException {
   String codigo = codigoInformado.getText();
   if (service.validarCodigo(codigo)){
       codigoInvalido.setVisible(true);
       return;
   }
        GerenciadorTela.getIntancia().trocarTela(event, "novaSenha.fxml","Nova Senha");


    }
}
