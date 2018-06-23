package chapter17.adapter.concerte;

import chapter17.adapter.target.Player;

public class CommonPlayer extends Player {

    public CommonPlayer(String name) {
        super(name);
    }

    @Override
    public void LetsGo() {
        System.out.println(getClass().getName());
    }


}
