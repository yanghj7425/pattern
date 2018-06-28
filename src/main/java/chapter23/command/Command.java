package chapter23.command;

/**
 * @description 指令类
 */
public abstract class Command {

    Barbecuer barbecuer;

    public Command(Barbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }

    /**
     * @description 执行指令
     */
    public abstract void execute();
}
