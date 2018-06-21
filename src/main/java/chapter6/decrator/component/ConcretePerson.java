package chapter6.decrator.component;

public class ConcretePerson implements Person {

    private String name;

    public void show() {
        System.out.printf(getClass().getSimpleName() + "\r\n");
    }
}
