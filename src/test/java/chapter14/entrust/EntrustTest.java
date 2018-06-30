package chapter14.entrust;

import chapter14.entrust.observer.StockObserver;
import chapter14.entrust.observer.WatchTVObserver;
import chapter14.entrust.subject.ReceptorSubject;
import org.junit.Test;

public class EntrustTest {


    @Test
    public void entrustTest() {


        ReceptorSubject receptor = new ReceptorSubject();

        StockObserver stock = new StockObserver("stock", receptor);
        WatchTVObserver watchTV = new WatchTVObserver("watchTV", receptor);

        receptor.attach(watchTV, "watchTVUpdate", "don`t watching TV. Please!");
        receptor.attach(stock, "stockObserverUpdate", 200);


        receptor.notifyObserver();
    }


}
