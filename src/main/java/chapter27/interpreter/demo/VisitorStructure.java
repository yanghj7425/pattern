package chapter27.interpreter.demo;

import chapter27.interpreter.demo.person.Person;
import chapter27.interpreter.demo.state.State;

import java.util.ArrayList;
import java.util.List;

public class VisitorStructure {

    List<Person> list;

    public VisitorStructure() {
        list = new ArrayList<>();
    }

    public boolean attachPerson(Person person) {
        return list.add(person);
    }


    public int show(State state) {
        for (Person person : list) {
            person.accept(state);
        }
        return list.size();
    }

}
