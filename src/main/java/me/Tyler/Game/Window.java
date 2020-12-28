package me.Tyler.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Window extends Canvas {

    public static boolean bool;
    public static JFrame f;

    public Window(int height, int width, String title, Main game) {
        f = new JFrame(title);

        f.setPreferredSize(new Dimension(width, height));
        f.setMaximumSize(new Dimension(width, height));
        f.setMinimumSize(new Dimension(width, height));

        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.add(game);
        f.setVisible(true);

        game.start();
    }

}
