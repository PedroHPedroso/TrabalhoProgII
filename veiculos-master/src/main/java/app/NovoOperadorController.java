package app;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import modelo.Operador;
import util.Dao;

public class NovoOperadorController {
    @FXML
    private TextField campoLogin;
    @FXML
    private TextField campoSenha;
    
    @FXML
    private void cadastrarOperador(){
        Operador operador = new Operador();
        operador.setNome(campoLogin.getText());
        operador.setEndereco(campoSenha.getText());
        Dao<Operador> dao = new Dao(Operador.class); 
        dao.inserir(operador);
        limparCampos();
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setContentText("Operador cadastrado");
        alert.show();
    }
    @FXML
    private void limparCampos(){
        campoLogin.setText("");
        campoSenha.setText("");
       ;
    }
      
    @FXML
    private void voltarAoMenu() throws IOException{
        App.setRoot("menu");
    }
    
    
}
