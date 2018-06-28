package chapter23.command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    List<Command> list = new ArrayList<>();

    public void setCommand(Command command) {
        list.add(command);
    }


    public void notifyCommander() {
        for (Command command : list){
            command.execute();
        }
    }
}
