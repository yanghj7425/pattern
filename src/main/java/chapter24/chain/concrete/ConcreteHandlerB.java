package chapter24.chain.concrete;

import chapter24.chain.handler.Handler;

public class ConcreteHandlerB extends Handler {
    @Override
    public void handlerProcess(int resources) {
        if (resources >= 20) {
            handler.handlerProcess(resources);
            return;
        }
        System.out.println(getClass().getName());
    }
}
