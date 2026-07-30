package com.jaqueline.estoque.controller;

import com.jaqueline.estoque.util.GerenciadorTela;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class MenuController {

    public Button btnRelatorio;

    @FXML
    protected void aoVisualizarEstoque(ActionEvent event) throws IOException{
        GerenciadorTela.getIntancia().trocarTela(event, "estoque.fxml", "Sistema de Estoque - estoque");
    }

    @FXML
    protected void aoCadastrarProdutos(ActionEvent event) throws IOException {
        GerenciadorTela.getIntancia().trocarTela(event, "produto.fxml","Sistema de Estoque - Produto");
    }

    @FXML
    protected void aoGerarRelatorio(ActionEvent event) throws IOException {
        GerenciadorTela.getIntancia().trocarTela(event, "relatorio.fxml","Sistema de Estoque - Relatorio");

    }

    @FXML
    protected void aoSair(ActionEvent event) throws IOException {
        GerenciadorTela.getIntancia().trocarTela(event, "login.fxml", "Sistema de Estoque - login");

    }
}
