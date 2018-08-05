package chapter27.interpreter.demo.state;

import chapter27.interpreter.demo.person.impl.Man;
import chapter27.interpreter.demo.person.impl.Woman;

public interface State {
    void manReaction(Man man);

    void womanReaction(Woman woman);

}
