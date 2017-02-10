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
        for(int a = 0; a <= 3; a++) {
            int positionHeight = Dimensions.getObjectPositionHeight() + Dimensions.getObjectHeight() * a;
            int objectPositionWidth = 0;
            int positionStartWidth;
            do {
                positionStartWidth = objectPositionWidth;
                int positionEndWidth = positionStartWidth + (int) Math.random() * 10 + 90;
//                objects.fillRect(objectPositionWidth,positionStartWidth, positionEndWidth, positionHeight);
                objects.fillRect(positionStartWidth, positionHeight, objectPositionWidth, positionEndWidth);
                objectPositionWidth = objectPositionWidth + positionEndWidth;
            } while (objectPositionWidth + Dimensions.getObjectMaxWidth() < Dimensions.getScreenHeight());
        }
    }
}
