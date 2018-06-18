package chapter7.proxy;

public class Proxy implements Subject {

    RelSubject relSubject;

    public void request() {

        relSubject.request();

    }

    public Proxy(RelSubject relSubject) {
        this.relSubject = relSubject;
    }
}
