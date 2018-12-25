package chapter22;

import chapter22.bridge.HandsetBrandA;
import chapter22.bridge.HandsetGame;
import chapter22.bridge.HandsetTel;

public class Main {
    public static void main(String[] args) {
        HandsetBrandA handsetBrandA = new HandsetBrandA();
        handsetBrandA.attach(new HandsetTel());
        handsetBrandA.attach(new HandsetGame());
        handsetBrandA.run("game");
    }
}
