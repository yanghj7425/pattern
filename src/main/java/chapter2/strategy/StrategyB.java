package chapter2.strategy;

public class StrategyB implements Strategy {
    @Override
    public String algorithmStrategy() {

        return getClass().getName();
    }
}
