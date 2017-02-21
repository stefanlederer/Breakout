/**
 * Created by stefanlederer on 04.02.17.
 */

import Components.Dimensions;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameFrame extends main implements KeyListener {

    static JPanel gamePanel;
    GameItems gameItems;

    public GameFrame() {
        mainFrame.getContentPane().remove(startPanel);
        mainFrame.setResizable(false);
        gamePanel = new JPanel();
        mainFrame.add(gamePanel);

        GameItems.calcObjects();
        mainFrame.add(gameItems = new GameItems());
        mainFrame.addKeyListener(this);

        mainFrame.getContentPane().invalidate();
        mainFrame.getContentPane().validate();

        mainFrame.pack();
    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        int left = 37;
        int right = 39;
        if(e.getKeyCode() == left) {
            Dimensions.setPlayerMove(-10);
            gameItems.repaint();
        }
        if(e.getKeyCode() == right) {
            Dimensions.setPlayerMove(10);
            gameItems.repaint();
        }
    }

    public void keyReleased(KeyEvent e) {

    }

}
