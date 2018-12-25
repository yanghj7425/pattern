package chapter14.observer;

public class Main {
    public static void main(String[] args) {
        Observer observer = new ReceptorObserver("TH");
        Observable stock = new StockHolder("H.J", observer);
        observer.attach(stock);
        observer.notifyObserver("haha ~");
    }
}
