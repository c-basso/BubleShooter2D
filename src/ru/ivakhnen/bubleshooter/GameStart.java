package ru.ivakhnen.bubleshooter;

import javax.swing.*;

/**
 * Created by vlad on 22.08.15.
 */
public class GameStart {
    public static void main(String[] args) {

        GamePanel panel = new GamePanel();

        JFrame startFrame = new JFrame("Название");
        startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        startFrame.setContentPane(panel);
        startFrame.pack();
        startFrame.setLocationRelativeTo(null);
        startFrame.setVisible(true);

        panel.go();
    }
}
