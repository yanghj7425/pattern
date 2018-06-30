package chapter24.chain.handler;

public abstract class Handler {

    protected Handler handler;

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public abstract void handlerProcess(int resources);
}
