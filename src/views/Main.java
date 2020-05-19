
package views;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application{
    @Override
    public void init() throws Exception{
        super.init();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        primaryStage.setTitle("Dentist Appointment");
        primaryStage.setScene(new Scene(root,1038,881));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void stop() throws Exception{
        
        super.stop();
    }
    
}
