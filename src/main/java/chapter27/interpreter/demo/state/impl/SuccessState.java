package chapter27.interpreter.demo.state.impl;

import chapter27.interpreter.demo.person.impl.Man;
import chapter27.interpreter.demo.person.impl.Woman;
import chapter27.interpreter.demo.state.State;

public class SuccessState implements State {
    @Override
    public void manReaction(Man man) {
        man.successPerson(man);
    }

    @Override
    public void womanReaction(Woman woman) {
        woman.successPerson(woman);
    }
}
