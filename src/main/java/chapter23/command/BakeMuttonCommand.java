package chapter23.command;

public class BakeMuttonCommand extends Command {
    public BakeMuttonCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void execute() {
        barbecuer.bakeMutton();
        System.out.println(getClass().getName());
    }
}
