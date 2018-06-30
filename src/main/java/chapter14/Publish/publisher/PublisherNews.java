package chapter14.Publish.publisher;

import chapter14.Publish.subscribe.Subscribe;

public class PublisherNews extends Publisher {


    private String title;

    @Override
    public int notifySubscribe() {

        for (Subscribe subscribe : subscribes) {
            subscribe.setSubscribeState(getPublishState());
            subscribe.update();
        }

        return subscribes.size();
    }

    public PublisherNews(String title) {
        this.title = title;
    }
}