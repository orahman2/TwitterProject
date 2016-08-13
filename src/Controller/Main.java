package Controller;

import Model.SearchResultsGenerator;
import View.MainWindow;
import View.MainWindowFX;
import javafx.application.Application;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Omar on 8/8/2016.
 */
public class Main implements Observer{

    public static void main(String[] args) {

        Application.launch(MainWindowFX.class);
    }

    @Override
    public void update(Observable o, Object arg) {
        if( arg instanceof String){
            new SearchResultsGenerator(this, arg);
        }
    }
}