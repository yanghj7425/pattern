package chapter14.entrust.subject;


import chapter14.entrust.observer.Observer;

public interface Subject {

    void attach(Observer observer, String method, Object... params);

    void detach(Observer observer);

    void notifyObserver();

}
