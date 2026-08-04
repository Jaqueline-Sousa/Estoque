package com.jaqueline.estoque.controller;

import com.jaqueline.estoque.model.EstoqueDAO;
import com.jaqueline.estoque.util.GerenciadorTela;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;


public class RelatorioController {

    @FXML
    private Label lblTotalProdutos;

    @FXML
    private Label lblValorTotal;

    @FXML
    private Label lblEstoqueBaixo;

    private final EstoqueDAO dadosEstoque = EstoqueDAO.getInstancia();

    @FXML
    public void initialize(){

        NumberFormat formaoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        int totalProdutos = dadosEstoque.listarProdutos().size();
        lblTotalProdutos.setText(String.valueOf(totalProdutos));

        double valorTotalEstoque = dadosEstoque.calcularValorTotalEstoque();
        lblValorTotal.setText(formaoMoeda.format(valorTotalEstoque));

        long estoqueBaixo = dadosEstoque.calcularEstoqueBaixo(10);
        lblEstoqueBaixo.setText(String.valueOf(estoqueBaixo));

        // conversao de tipos
        // Inteiro ou Double para String -> string.valueOf(numero) (1) saida -> "1"
        // String ou Double para inteiro -> Intereger.parseInt( string) ("1") saida _> 1
        // Inteiro ou String para double -> Double.parseDoubles("8.5") _> saída 8.5
        // String para boolean -> Boolean.parseBoolean( "true") -> saída true


    }


    @FXML
    protected void aoVoltarAoMenu(ActionEvent event) throws IOException{
        GerenciadorTela.getIntancia().trocarTela(event, "menu.fxml","Sistema de Estoque - Menu");
    }
}
