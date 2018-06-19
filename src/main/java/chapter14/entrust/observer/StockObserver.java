package chapter14.entrust.observer;


import chapter14.entrust.subject.Subject;

public class StockObserver extends Observer {

    public StockObserver(String name, Subject subject) {
        super(name, subject);
    }


    public void stockObserverUpdate(Integer dot) {
        System.out.println(getClass().getSimpleName() + "\t" + dot);
    }
}
