package chapter6.decrator.component;

public class ConcretePerson extends Person {

    public void show() {
        System.out.printf(getClass().getSimpleName() +"\r\n");
    }
}
