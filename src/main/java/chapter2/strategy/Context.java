package chapter2.strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }


    public String getContextResult() {
        return strategy.algorithmStrategy();
    }
}
