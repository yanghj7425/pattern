package chapter27.interpreter.element;

import chapter27.interpreter.visitor.Action;

public interface Person {
    void accept(Action action);
}
