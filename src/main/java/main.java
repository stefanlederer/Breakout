import Components.Dimensions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;

/**
 * Created by stefanlederer on 26.01.17.
 */
public class main {

    static Dimensions dimension;
    static JFrame mainFrame;
    static JPanel startPanel;

    private static void mainFrame() {
        mainFrame = new JFrame();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = dimension.getStartScreenWidth();
        int height = dimension.getStartScreenHeight();
        int screenWidth = dimension.getScreenWidth();
        int screenHeight = dimension.getScreenHeight();
        mainFrame.setPreferredSize(new Dimension( width, height));
        mainFrame.setLocation((screenWidth/2 - width/2), (screenHeight/2 - height/2));

        startPanel = new JPanel();
        mainFrame.add(startPanel);
        mainFrame.getContentPane().add(startPanel, BorderLayout.CENTER);

        JLabel heading = new JLabel("BREAKOUT");
        heading.setPreferredSize(new Dimension(screenWidth, height / 100 * 40));
        heading.setVerticalAlignment(SwingConstants.CENTER);
        heading.setHorizontalAlignment(SwingConstants.CENTER);
//        heading.setBorder(BorderFactory.createLineBorder(Color.black));
        heading.setForeground(Color.BLUE);
        heading.setFont(new Font("Serif", Font.PLAIN, 40));
        startPanel.add(heading);

        final JLabel startGame = new JLabel("Start");
        startGame.setPreferredSize(new Dimension(screenWidth / 100 * 50, height / 100 * 16));
        startGame.setHorizontalAlignment(SwingConstants.CENTER);
//        startGame.setBorder(BorderFactory.createLineBorder(Color.black));
        startGame.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        startPanel.add(startGame);

        JLabel settingsGame = new JLabel("Settings");
        settingsGame.setPreferredSize(new Dimension(screenWidth / 100 * 50, height / 100 * 16));
        settingsGame.setHorizontalAlignment(SwingConstants.CENTER);
//        settingsGame.setBorder(BorderFactory.createLineBorder(Color.black));
        settingsGame.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        startPanel.add(settingsGame);

        JLabel quitGame = new JLabel("Quit Game");
        quitGame.setPreferredSize(new Dimension(screenWidth / 100 * 50, height / 100 * 16));
        quitGame.setHorizontalAlignment(SwingConstants.CENTER);
//        quitGame.setBorder(BorderFactory.createLineBorder(Color.black));
        quitGame.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        startPanel.add(quitGame);

        startGame.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                new GameFrame();
            }
        });

        quitGame.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                mainFrame.dispatchEvent(new WindowEvent(mainFrame, WindowEvent.WINDOW_CLOSING));
            }
        });

        mainFrame.pack();
        mainFrame.setVisible(true);
    }

    public static void main(String args[]) {
        dimension = new Dimensions();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                mainFrame();
            }
        });
    }
}
