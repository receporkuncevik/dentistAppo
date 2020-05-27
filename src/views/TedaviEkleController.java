package views;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.DisCekimi;
import model.Doktor;
import model.Dolgu;
import model.DosyaIslemleri;
import model.Ortodonti;
import model.Tedavi;

/**
 * FXML Controller class
 *
 * @author RecepOrkun
 */
public class TedaviEkleController implements Initializable {

    @FXML
    private TextField txtId;
    @FXML
    private Button btnKaydet;
    @FXML
    private Button btnIptal;
    @FXML
    private TextField txtAd;
    @FXML
    private TextArea txtAciklama;

    private static ObservableList<Tedavi> tedaviList;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    void tedaviEkle(ActionEvent event) {
        int tedaviID = Integer.parseInt(txtId.getText().trim());
        String tedaviAdi = txtAd.getText().trim();
        String tedaviAciklama = txtAciklama.getText().trim();
        if ("Dolgu".equals(tedaviAdi)) {
            Tedavi t1 = new Dolgu(tedaviID, tedaviAdi, tedaviAciklama);
            tedaviList.add(t1);
            DosyaIslemleri.dosyayaYaz(tedaviList, "src/dosyalar/tedavi.txt");
        } else if ("Dis Cekimi".equals(tedaviAdi)) {
            Tedavi dc = new DisCekimi(tedaviID, tedaviAdi, tedaviAciklama);
            tedaviList.add(dc);
            DosyaIslemleri.dosyayaYaz(tedaviList, "src/dosyalar/tedavi.txt");
        }     
        closeStage(event);
    }

    @FXML
    void tedaviEkleClose(ActionEvent event) {
        closeStage(event);
    }

    private void closeStage(ActionEvent event) {
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    public static void setTedaviList(ObservableList<Tedavi> tedaviList) {
        TedaviEkleController.tedaviList = tedaviList;
    }

}
