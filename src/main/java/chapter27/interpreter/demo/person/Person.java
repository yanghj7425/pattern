package chapter27.interpreter.demo.person;

import chapter27.interpreter.demo.state.State;

public abstract class Person {
    public abstract void accept(State state);

    public void successPerson(Object o) {
        System.out.println(o.getClass().getSimpleName() + "\tsuccessful");
    }

    public void failurePerson(Object o) {
        System.out.println(o.getClass().getSimpleName() + "\t failure");
    }


    public void runPerson(Object o) {
        System.out.println(o.getClass().getSimpleName() + "\t run");
    }
}
