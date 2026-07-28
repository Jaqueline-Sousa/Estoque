package Controller;

import com.jaqueline.estoque.util.GerenciadorTela;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class MenuController {

    @FXML
    protected void aoVisualizarEstoque(ActionEvent event) throws IOException{
        GerenciadorTela.getIntancia().trocarTela(event, "estoque.fxml", "Sistema de Estoque - estoque");
    }

    @FXML
    protected void aoCadastrarProduto(ActionEvent event){

    }

    @FXML
    protected void aoGerarRelatorio(ActionEvent event){

    }

    @FXML
    protected void aoSair(ActionEvent event) throws IOException {
        GerenciadorTela.getIntancia().trocarTela(event, "login.fxml", "Sistema de Estoque - login");

    }
}
