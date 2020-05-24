/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author RecepOrkun
 */
public class HastaController implements Initializable {

    @FXML
    private TableView<?> hastaListele;
    @FXML
    private Button hastaSil;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void hastaEkleDialog(ActionEvent event) {
    }

    @FXML
    private void hastaDuzenleDialog(ActionEvent event) {
    }


    
}
