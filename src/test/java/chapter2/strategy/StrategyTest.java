package chapter2.strategy;

import org.junit.Test;

public class StrategyTest {
    @Test
    public void strategyTest() {
        Client client = new Client();


      //  client.setStrategy(new StrategyB());
        client.getResult();
    }
}
