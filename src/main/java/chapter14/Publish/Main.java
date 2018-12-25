package chapter14.Publish;

import chapter14.Publish.publisher.Publisher;
import chapter14.Publish.publisher.PublisherNews;
import chapter14.Publish.subscribe.Subscriber;

public class Main {

    public static void main(String[] args) {

        Publisher publisher = new PublisherNews("move");

        publisher.attach(new Subscriber(publisher, "hh"));
        publisher.attach(new Subscriber(publisher, "yy"));

        System.out.println(publisher.notifySubscribe());

    }
}
