import Components.Dimensions;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by stefanlederer on 26.01.17.
 */
public class GameItems extends JPanel {

    public GameItems() {
        setBorder(BorderFactory.createLineBorder(Color.black));
    }

    public void paint(Graphics gameItems) {
        super.paintComponent(gameItems);
        drawPlayer(gameItems);
        drawBall(gameItems);
        drawObjects(gameItems);
    }

    private void drawPlayer(Graphics player) {
        player.fillRect(Dimensions.getPlayerPostion(), Dimensions.getPlayerStartHeight(), Dimensions.getPlayerWidth(), Dimensions.getPlayerHeight());
    }

    private void drawBall(Graphics ball) {
        ball.fillOval(Dimensions.getStartScreenWidth() / 2 - Dimensions.getBallSize() / 2, Dimensions.getBallStartPosition(), Dimensions.getBallSize(), Dimensions.getBallSize());
    }

    private void drawObjects(Graphics objects) {
        for (int a = 0; a < 3; a++) {
            int positionHeight = (int) (Dimensions.getObjectPositionHeight() + Dimensions.getObjectHeight() * (a * 1.1));
            int objectHeight = Dimensions.getObjectHeight();
            int positionWidth = 0;
            do {
                int objectWidth = (int) Math.round(Math.random() * 100 + 20);
                objects.fillRect(positionWidth, positionHeight, objectWidth, objectHeight);
                positionWidth = positionWidth + objectWidth + 2;
            } while (positionWidth + 120 <= Dimensions.getScreenWidth());
        }
    }
}
