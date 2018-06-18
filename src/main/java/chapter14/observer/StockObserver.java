package chapter14.observer;

public class StockObserver extends Observer {

    public StockObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println(getClass().getSimpleName());
    }
}
