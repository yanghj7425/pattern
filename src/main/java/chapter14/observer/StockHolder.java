package chapter14.observer;

public class StockHolder extends Observable {

    @Override
    public void update(String message) {
        String fullStackName = getClass().getName();
        int state = getObservableState();

        if (state == 1) {
            System.out.println(fullStackName + "\tI`am business ~");
            return;
        }

        System.out.println(fullStackName + "I accept message :" + message);
    }

    public StockHolder(String name, Observer observer) {
        super(name, observer);
    }


}
