
package views;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class RandevuController implements Initializable {

    @FXML
    private TableView<?> randevuListele;
    @FXML
    private TableColumn<?, ?> tblClID;
    @FXML
    private TableColumn<?, ?> tblClDoktorAdi;
    @FXML
    private TableColumn<?, ?> tblClHastaAdi;
    @FXML
    private TableColumn<?, ?> tblClTarihi;
    @FXML
    private Button randevuSil;
    
    private ObservableList rList = FXCollections.observableArrayList();
       
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void randevuEkleDialog(ActionEvent event) throws IOException {
        FXMLLoader fXMLLoader = new FXMLLoader(getClass().getResource("randevuEkle.fxml"));
        Parent parent = fXMLLoader.load();
        RandevuEkleController randevuEkle = fXMLLoader.<RandevuEkleController>getController();
        randevuEkle.setRandevuList(rList);
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
 
        stage.setScene(scene);
        stage.showAndWait();

    }

    @FXML
    private void randevuDuzenleDialog(ActionEvent event) {
    }
    
}
