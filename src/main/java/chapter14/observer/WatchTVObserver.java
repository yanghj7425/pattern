package chapter14.observer;


public class WatchTVObserver extends Observer {


    public WatchTVObserver(String name, Subject subject) {
        super(name, subject);
    }

    public void update() {
        System.out.println(getClass().getSimpleName());
    }



}
