package views;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;


public class HomeController implements Initializable{
    @FXML
    private AnchorPane HomePane;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         /* AnchorPane pane = (AnchorPane) FXMLLoader.load(getClass().getResource("login.fxml"));
        HomePane.getChildren().setAll(pane); */
    }  
}
