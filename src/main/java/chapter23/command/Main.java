package chapter23.command;

public class Main {


    public static void main(String[] args) {
        Barbecuer boy = new Barbecuer();

        Waiter girl = new Waiter();

        Command bakeMutton = new BakeChickenWingCommand(boy);
        Command bakeChickenWing = new BakeMuttonCommand(boy);

        girl.setCommand(bakeChickenWing);

        girl.setCommand(bakeMutton);

        girl.notifyCommander();
    }
}
