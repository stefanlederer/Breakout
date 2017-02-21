import Components.Dimensions;

import javax.swing.*;
import java.awt.*;

/**
 * Created by stefanlederer on 26.01.17.
 */
public class GameItems extends JPanel {

    static int[][] objectList;

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
//        for (int a = 0; a < 3; a++) {
//            int positionHeight = (int) (Dimensions.getObjectPositionHeight() + Dimensions.getObjectHeight() * (a * 1.1));
//            int objectHeight = Dimensions.getObjectHeight();
//            int positionWidth = 0;
//            do {
//                int objectWidth = (int) Math.round(Math.random() * 100 + 20);
//                objects.fillRect(positionWidth, positionHeight, objectWidth, objectHeight);
//                positionWidth = positionWidth + objectWidth + 2;
//            } while (positionWidth + 120 <= Dimensions.getScreenWidth());
//        }
        for(int[] object: objectList) {
            objects.fillRect(object[0], object[1], object[2], object[3]);
        }
    }

    public static void calcObjects() {
        int count = 0;
        int[][] objectL = new int[1000][4];
        for (int a = 0; a < 3; a++) {
            int positionHeight = (int) (Dimensions.getObjectPositionHeight() + Dimensions.getObjectHeight() * (a * 1.1));
            int objectHeight = Dimensions.getObjectHeight();
            int positionWidth = 0;
            do {
                int objectWidth = (int) Math.round(Math.random() * 100 + 20);
                objectL[count][0] = positionWidth;
                objectL[count][1] = positionHeight;
                objectL[count][2] = objectWidth;
                objectL[count][3] = objectHeight;

                positionWidth = positionWidth + objectWidth + 2;
                count++;
            }while (positionWidth + 120 <= Dimensions.getScreenWidth());
        }
        objectList = new int[count+1][4];
        for (int i = 0; i <= count; i++) {
            objectList[i][0] = objectL[i][0];
            objectList[i][1] = objectL[i][1];
            objectList[i][2] = objectL[i][2];
            objectList[i][3] = objectL[i][3];
        }
    }
}
