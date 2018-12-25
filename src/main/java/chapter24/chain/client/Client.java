package chapter24.chain.client;

import chapter24.chain.concrete.ConcreteHandlerA;
import chapter24.chain.concrete.ConcreteHandlerB;
import chapter24.chain.concrete.ConcreteHandlerC;
import chapter24.chain.handler.Handler;

public class Client {

    public void client(int resources) {
        Handler h1 = new ConcreteHandlerA();
        Handler h2 = new ConcreteHandlerB();
        Handler h3 = new ConcreteHandlerC();

        h1.setHandler(h2);
        h2.setHandler(h3);

        h1.handlerProcess(resources);
    }
}
