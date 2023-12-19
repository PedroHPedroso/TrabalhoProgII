package app;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import modelo.Veiculo;
import util.Dao;

public class NovoVeiculoController {
    @FXML
    private TextField campoMarca; 
    
    @FXML
    private TextField campoModelo; 
    
    @FXML
    private TextField campoPlaca;
            
    @FXML
    private void cadastrarVeiculo(){
        Veiculo veiculo = new Veiculo ();
        veiculo.setMarca(campoMarca.getText());
        veiculo.setModelo(campoModelo.getText());
        veiculo.setPlaca(campoPlaca.getText());
        Dao<Veiculo> dao = new Dao(Veiculo.class); 
        dao.inserir(veiculo);
        limparCampos();
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("Veiculo cadastrado");
        alert.show();
    }
    
    @FXML
    private void limparCampos(){
        campoMarca.setText("");
        campoModelo.setText("");
        campoPlaca.setText("");
       
    }
      
    @FXML
    private void voltarAoMenu() throws IOException{
        App.setRoot("menu");
    }
    
}

