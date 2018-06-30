package chapter14.Publish.publisher;

import chapter14.Publish.subscribe.Subscribe;

public class PublisherMove extends Publisher {

    private String title;


    public PublisherMove(String title) {
        this.title = title;
    }


    @Override
    public int notifySubscribe() {
        for (Subscribe subscribe : subscribes) {
            subscribe.setSubscribeState(getPublishState());
            subscribe.update();
        }

        return subscribes.size();
    }
}
