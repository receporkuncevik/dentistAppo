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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.Randevu;
import model.Doktor;
import model.Tedavi;
import static views.HastaController.hList;


public class RandevuEkleController implements Initializable {

    @FXML
    private TextField txtId;
    @FXML
    private Button btnKaydet;
    @FXML
    private Button btnIptal;
    @FXML
    private ComboBox<String> cmbDoktor;
    @FXML
    private ComboBox<String> cmbTedavi;
    @FXML
    private DatePicker dateTarih;
    
    private static ObservableList<Randevu> randevuList;
    ObservableList<String> hastaAdi = FXCollections.observableArrayList();

    public static void setRandevuList(ObservableList<Randevu> randevuList) {
        RandevuEkleController.randevuList = randevuList;
    }
    @FXML
    private TextField txtHasta;
    @FXML
    private ComboBox<String> cmbSaat;
    
    private ObservableList<String> saatListesi=FXCollections.observableArrayList("9:00","9:30","10:00","10:30","11:00","11:30",
            "13:00","13:30","14:00","14:30","15:00","15:30","16:00","16:30");
    
 

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cmbDoktor.setValue("Lütfen Doktor Seçiniz.");
        cmbDoktor.setItems(Doktor.getDoktorAdiFromFile());
        txtHasta.setEditable(false);
        cmbTedavi.setValue("Lütfen Tedavi Seçiniz.");
        cmbTedavi.setItems(Tedavi.getTedaviAdiFromFile()); 
        cmbSaat.setValue("Lütfen Saat Seçiniz");
        cmbSaat.setItems(saatListesi);
    }    

    @FXML
    private void randevuKaydet(ActionEvent event) {
        
    }

    @FXML
    private void randevuEkleKapat(ActionEvent event) {
    }

    @FXML
    private void hastaEkleDialog(ActionEvent event) throws IOException {
        FXMLLoader fXMLLoader = new FXMLLoader(getClass().getResource("hastaEkle.fxml"));
        Parent parent = fXMLLoader.load();
        HastaEkleController hastaEkleController = fXMLLoader.<HastaEkleController>getController();
        hastaEkleController.setHastaList(hList);
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);

        stage.setScene(scene);
        stage.showAndWait();
    }
    
}
