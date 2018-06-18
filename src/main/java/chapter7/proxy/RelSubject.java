package chapter7.proxy;

public class RelSubject implements Subject {


    public void request() {
        System.out.println(getClass().getSimpleName());
    }
}
