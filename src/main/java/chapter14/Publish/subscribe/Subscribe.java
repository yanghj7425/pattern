package chapter14.Publish.subscribe;

public abstract class Subscribe {


    private String subscribeState;


    public abstract void update();


    public String getSubscribeState() {
        return subscribeState;
    }

    public void setSubscribeState(String subscribeState) {
        this.subscribeState = subscribeState;
    }



}
