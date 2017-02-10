package Components;

import java.awt.*;

/**
 * Created by stefanlederer on 26.01.17.
 */
public class Dimensions {

    private static Dimension screenDimension;
    static int move;

    public Dimensions() {
        screenDimension = Toolkit.getDefaultToolkit().getScreenSize();
    }

    public static int getScreenWidth() {
        return (int) screenDimension.getWidth();
    }

    public static int getScreenHeight() {
        return (int) screenDimension.getHeight();
    }

    public static int getStartScreenWidth() {
        return 800;
    }

    public static int getStartScreenHeight() {
        return 600;
    }

    public static int getPlayerWidth() {
        return 100;
    }

    public static int getPlayerHeight() {
        return 10;
    }

    public static int getPlayerStartHeight() {
        return getStartScreenHeight() - getPlayerHeight() - 10;
    }

    public static int getPlayerStartWidth() {
        return getStartScreenWidth() / 2 - getPlayerWidth() / 2;
    }

    public static void setPlayerMove(int m) {
        move += m;
    }

    public static int getPlayerPostion() {
        return getPlayerStartWidth() + move;
    }

    public static int getBallSize() {
        return 15;
    }

    public static int getBallStartPosition() {
        return getScreenHeight() / 2;
    }

    public static int getObjectHeight() {
        return 15;
    }

    public static int getObjectMinWidth() {
        return 80;
    }

    public static int getObjectMaxWidth() {
        return 90;
    }

    public static int getObjectPositionHeight() {
        return 190;
    }

}
