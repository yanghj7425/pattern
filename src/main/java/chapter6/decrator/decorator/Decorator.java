package chapter6.decrator.decorator;

import chapter6.decrator.component.Person;

public abstract class Decorator implements Person {

    protected Person person;

    public void decorator(Person person) {
        this.person = person;
    }

    public void show() {
        if (person != null) {
            person.show();
        }
    }
}
