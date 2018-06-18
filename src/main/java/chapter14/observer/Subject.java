package chapter14.observer;


public interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObserver();

}
