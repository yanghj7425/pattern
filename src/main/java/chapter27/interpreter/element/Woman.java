package chapter27.interpreter.element;

import chapter27.interpreter.visitor.Action;

public class Woman implements Person {

    @Override
    public void accept(Action action) {
            action.womanReaction(this);
    }
}
