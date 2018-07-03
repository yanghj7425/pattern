package chapter14.observer;


public interface Observer {
    void attach(Observable observer);

    void detach(Observable observer);

    void notifyObserver(String message);

}
