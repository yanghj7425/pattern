package chapter14.entrust.subject;


import chapter14.entrust.event.EventHandler;
import chapter14.entrust.observer.Observer;

public class ReceptorSubject implements Subject {


    private EventHandler eventHandler;


    public ReceptorSubject() {
        eventHandler = new EventHandler();
    }

    public void attach(Observer observer, String methodName, Object... params) {
        eventHandler.addEvent(observer, methodName, params);
    }

    public void detach(Observer observer) {

    }

    public void notifyObserver() {
        eventHandler.notifyEvents();
    }


}
