package chapter14.observer;

import org.junit.Test;

public class ObserverTest {


    @Test
    public void observerTest() {

        ReceptorSubject receptor = new ReceptorSubject("1");
        StockObserver stock = new StockObserver("observer", receptor);
        WatchTVObserver watchTV = new WatchTVObserver("observer", receptor);

        receptor.attach(stock);
        receptor.attach(watchTV);

        // receptor.detach(stock);  //out : WatchTVObserver  //说明： equals  方法和  hashcode 方法

        receptor.notifyObserver();
    }//:~ out:
    /**
     * StockObserver
     * WatchTVObserver
     * Process finished with exit code 0
     */
}
