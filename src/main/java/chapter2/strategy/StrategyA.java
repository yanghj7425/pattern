package chapter2.strategy;

public class StrategyA implements Strategy {
    @Override
    public String algorithmStrategy() {

        return getClass().getName();
    }
}
