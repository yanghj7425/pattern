package chapter27.interpreter.demo;

import chapter27.interpreter.demo.person.Person;
import chapter27.interpreter.demo.person.impl.Man;
import chapter27.interpreter.demo.person.impl.Woman;
import chapter27.interpreter.demo.state.State;
import chapter27.interpreter.demo.state.impl.FailureState;
import chapter27.interpreter.demo.state.impl.RunState;
import chapter27.interpreter.demo.state.impl.SuccessState;

public class Client {

    public void init() {

        VisitorStructure visitorStructure = new VisitorStructure();
        Person man = new Man();
        Person woMan = new Woman();

        visitorStructure.attachPerson(man);
        visitorStructure.attachPerson(woMan);

        State success = new SuccessState();
        State failure = new FailureState();
        State run = new RunState();


        visitorStructure.show(success);
        visitorStructure.show(failure);
        visitorStructure.show(run);


    }

    public static void main(String[] args) {
        new Client().init();
    }
}
