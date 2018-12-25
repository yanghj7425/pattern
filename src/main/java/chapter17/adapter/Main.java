package chapter17.adapter;

import chapter17.adapter.adaptee.SpecificPlayer;
import chapter17.adapter.concerte.CommonPlayer;
import chapter17.adapter.target.Player;

public class Main {

    public static void main(String[] args) {
        Player commonPlayer = new CommonPlayer("common");

        Player specificPlayer = new SpecificPlayer("specificPlayer");

        commonPlayer.LetsGo();

        specificPlayer.LetsGo();
    }
}
