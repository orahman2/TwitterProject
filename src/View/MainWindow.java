package View;

import Controller.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

/**
 * Initial window launched when program is booted.
 * Contains search panel and results Panel
 */
public class MainWindow extends JFrame{

    public MainWindow(Main main) {
        new Subclass(main);
    }
    private class Subclass extends Observable{

        private Search searchBar;

        public Subclass(Main main) {
            addObserver(main);
            setSize(new Dimension(500, 300));
            setLayout(new BorderLayout());
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            add(searchBar = new Search(), BorderLayout.NORTH);
        }

        private class Search extends JPanel {

            private JTextField searchField;
            private JButton searchButton;

            private Search() {
                setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

                searchField = new JTextField();
                add(searchField);

                searchButton = new JButton("search");
                searchButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setChanged();
                        notifyObservers(searchField.getText());
                    }
                });
                add(searchButton);
            }
        }
    }
}