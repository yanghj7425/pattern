package chapter23.command;

public class BakeChickenWingCommand extends Command {

    public BakeChickenWingCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void execute() {
        barbecuer.bakeChickenWing();
        System.out.println(getClass().getName());
    }
}
