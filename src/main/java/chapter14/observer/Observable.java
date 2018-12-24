package chapter14.observer;

public abstract class Observable {

    // 被观察者状态
    private int observableState;

    //被观察者名称
    private String name;

    //观察者
    private Observer observer;

    public  abstract void update(String message);

    public Observable(String name, Observer observer) {
        this.name = name;
        this.observer = observer;
    }

    public int getObservableState() {
        return observableState;
    }

    public void setObservableState(int observableState) {
        this.observableState = observableState;
    }
}
