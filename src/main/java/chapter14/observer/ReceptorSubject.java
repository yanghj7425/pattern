package chapter14.observer;

import java.util.ArrayList;
import java.util.List;

public class ReceptorSubject implements Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    private String receptorSubjectState;


    public ReceptorSubject(String receptorSubjectState) {
        this.receptorSubjectState = receptorSubjectState;
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public String getReceptorSubjectState() {
        return receptorSubjectState;
    }
}
