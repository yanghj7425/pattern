package chapter14.entrust.observer;


import chapter14.entrust.subject.Subject;

public class WatchTVObserver extends Observer {


    public WatchTVObserver(String name, Subject subject) {
        super(name, subject);
    }

    public void watchTVUpdate(String string) {
        System.out.println(getClass().getSimpleName() + "\t" + string);
    }


}
