package View;

import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Created by Omar on 8/13/2016.
 */
public class MainWindowFX extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Twiiter Client");
        TextField textField = new TextField();
        primaryStage.show();
    }
}
