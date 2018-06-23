package chapter17.adapter.adaptee;

import chapter17.adapter.target.Player;

public class SpecificPlayer extends Player {

    public SpecificPlayer(String name) {
        super(name);
    }

    @Override
    public void LetsGo() {
        System.out.println(getClass().getName());
    }


}
