package lesson8;

import javax.swing.*;
import java.awt.*;


public class Dialog extends JFrame {

        private GameWindow gameWindow;

        public Dialog(){
        this.gameWindow = gameWindow;
        setTitle("Игра закончена");

        setLayout(new FlowLayout());
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        add(new JLabel("Кто с играл:"));
        add(new JButton("???"));

        setSize(400,200);
        setVisible(true);
    }

}

