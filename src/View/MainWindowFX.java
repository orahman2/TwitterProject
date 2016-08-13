package View;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Created by Omar on 8/13/2016.
 */
public class MainWindowFX extends Application {
//    public MainWindowFX(String[] text) {
//        launch(text);
//    }

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
//        primaryStage.setTitle("Twiiter Client");
        primaryStage.show();
    }
}
