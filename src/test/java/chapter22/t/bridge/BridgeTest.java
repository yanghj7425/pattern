package chapter22.t.bridge;

import chapter22.bridge.HandsetGame;
import chapter22.bridge.HandsetBrandA;
import chapter22.bridge.HandsetTel;
import org.junit.Test;

public class BridgeTest {

    @Test
    public  void bridge(){
        HandsetBrandA handsetBrandA = new HandsetBrandA();
        handsetBrandA.setHandsetSoft(new HandsetGame());
        handsetBrandA.run();


        handsetBrandA.setHandsetSoft(new HandsetTel());
        handsetBrandA.run();
    }
}
