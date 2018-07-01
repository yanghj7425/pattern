package chapter22.bridge;

/**
 *
 */
public class HandsetGame extends HandsetSoft {

    public HandsetGame() {
        super("game");
    }

    @Override
    public void run() {
        System.out.println(getClass().getName());
    }
}
