package chapter27.interpreter;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

    private List<Person> personList = new ArrayList<>();

    public void attach(Person person) {
        personList.add(person);
    }


    public void show(Action action) {
        for (Person person : personList) {
            person.accept(action);
        }
    }

}
