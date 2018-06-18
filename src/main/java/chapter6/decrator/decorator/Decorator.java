package chapter6.decrator.decorator;

import chapter6.decrator.component.Person;

public abstract class Decorator extends Person {

    protected Person person;

    public void decorator(Person person) {
        this.person = person;
    }

    @Override
    public void show() {
        if (person != null) {
            person.show();
        }
    }
}
