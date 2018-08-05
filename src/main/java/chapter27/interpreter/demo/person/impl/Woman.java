package chapter27.interpreter.demo.person.impl;

import chapter27.interpreter.demo.person.Person;
import chapter27.interpreter.demo.state.State;

public class Woman extends Person {
    @Override
    public void accept(State state) {
        state.womanReaction(this);
    }

}
