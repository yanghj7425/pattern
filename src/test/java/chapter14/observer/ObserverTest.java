package chapter14.observer;

import org.junit.Test;

public class ObserverTest {


    @Test
    public void observerTest() {

        ReceptorObserver receptor = new ReceptorObserver("1");

        StockHolder zhansan = new StockHolder("zhansan", receptor);
        WatcherTV lisi = new WatcherTV("lizi", receptor);
        StockHolder wanwu = new StockHolder("wanwu",receptor);
        receptor.attach(zhansan);
        receptor.attach(lisi);
        lisi.setObservableState(1);

        receptor.notifyObserver("The boss will be come back letter");
    }//:~ out:
    /**
     * StockObserver
     * WatchTVObserver
     * Process finished with exit code 0
     */
}
