package chapter17.adapter;

import chapter17.adapter.adaptee.SpecificPlayer;
import chapter17.adapter.concerte.CommonPlayer;
import chapter17.adapter.target.Player;
import org.junit.Test;

public class AdapterTest {

    @Test
    public void adapterTest() {
        Player commonPlayer = new CommonPlayer("common");

        Player specificPlayer = new SpecificPlayer("specificPlayer");

        commonPlayer.LetsGo();


        specificPlayer.LetsGo();
    }
}
