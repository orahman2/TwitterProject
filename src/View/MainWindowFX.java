package View;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.chart.BubbleChart;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Omar on 8/13/2016.
 */

public class MainWindowFX extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Twiiter Client");
        TextField searchField = new TextField();
        Button searchButton = new Button("search");
        searchButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                searchField.setText("clicked");
            }
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(searchField);
        layout.getChildren().add(searchButton);

        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}