package chapter27.interpreter;

public class Man implements Person {
    @Override
    public void accept(Action action) {
        action.manReaction(this);
    }
}
