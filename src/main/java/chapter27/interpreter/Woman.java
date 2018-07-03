package chapter27.interpreter;

public class Woman implements Person{

    @Override
    public void accept(Action action) {
            action.womanReaction(this);
    }
}
