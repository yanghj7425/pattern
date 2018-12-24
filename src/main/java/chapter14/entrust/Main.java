package chapter14.entrust;

import chapter14.entrust.observer.Observer;
import chapter14.entrust.observer.StockObserver;
import chapter14.entrust.observer.WatchTVObserver;
import chapter14.entrust.subject.ReceptorSubject;
import chapter14.entrust.subject.Subject;

public class Main {

    public static void main(String[] args) {
        Subject subject = new ReceptorSubject();
        Observer stock = new StockObserver("Z.S", subject);
        Observer watchTV = new WatchTVObserver("W.W", subject);
        subject.attach(watchTV, "watchTVUpdate", "don`t watching TV. Please!");
        subject.attach(stock, "stockObserverUpdate", 200);

        subject.notifyObserver();
    }
}
