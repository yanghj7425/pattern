package chapter27.interpreter.visitor;

import chapter27.interpreter.element.Man;
import chapter27.interpreter.element.Woman;

public interface Action {
    void manReaction(Man man);
    void womanReaction(Woman woman);
}
