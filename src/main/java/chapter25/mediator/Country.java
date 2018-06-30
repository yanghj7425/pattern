package chapter25.mediator;

public abstract class Country {
    void getMessage(String msg) {
        System.out.println(getClass().getName() + "\tI got Message:\t" + msg);
    }
}
