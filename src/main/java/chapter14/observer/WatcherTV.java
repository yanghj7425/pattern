package chapter14.observer;


public class WatcherTV extends Observable {

    @Override
    public void update(String message) {
        int state = getObservableState();
        String fullStackName = getClass().getName();

        if (state == 1) {
            System.out.println(fullStackName + "\tI`am business ~");
            return;
        }

        System.out.println(fullStackName + "\t I accept message :" + message);
    }

    public WatcherTV(String name, Observer observer) {
        super(name, observer);
    }
}
