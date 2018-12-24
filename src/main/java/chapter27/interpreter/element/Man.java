package chapter27.interpreter.element;

import chapter27.interpreter.visitor.Action;

public class Man implements Person {
    @Override
    public void accept(Action action) {
        action.manReaction(this);
    }


    public void cheerUp() {
        System.out.println(getClass().getSimpleName() + " when I fail I will Cheer up  and fighting again");
    }
}
