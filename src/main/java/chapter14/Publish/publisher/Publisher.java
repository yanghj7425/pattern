package chapter14.Publish.publisher;

import chapter14.Publish.subscribe.Subscribe;

import java.util.ArrayList;
import java.util.List;

public abstract class Publisher {

    protected List<Subscribe> subscribes = new ArrayList<>();

    private String publishState;


    public void attach(Subscribe subscribe) {
        subscribes.add(subscribe);
    }

    public void detach(Subscribe subscribe) {
        subscribes.remove(subscribe);
    }

    public abstract int notifySubscribe();

    public String getPublishState() {
        return publishState;
    }

    public void setPublishState(String publishState) {
        this.publishState = publishState;
    }
}
