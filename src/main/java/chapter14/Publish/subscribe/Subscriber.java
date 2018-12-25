package chapter14.Publish.subscribe;

import chapter14.Publish.publisher.Publisher;

public class Subscriber extends Subscribe {

    private Publisher publisher;

    private String name;


    @Override
    public void update() {
        setSubscribeState(publisher.getPublishState());
        if ("0".equals(getSubscribeState())) {
            System.out.println("sate can`t be solve");
            return;
        }
        System.out.println(name + "\t:\t" + getClass().getName() + publisher.getClass().getName());
    }

    public Subscriber(Publisher publisher, String name) {
        this.publisher = publisher;
        this.name = name;
    }
}
