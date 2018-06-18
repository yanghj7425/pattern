package chapter8.factory;

import chapter8.factory.calculate.AddCalculateFactory;
import chapter8.factory.calculate.Calculate;
import org.junit.Test;

public class AddFactoryTest {

    @Test
    public void addTest() {
        AddCalculateFactory addFactory = new AddCalculateFactory();
        Calculate calc = addFactory.getCalculate();
        double ret = calc.getResult();
        System.out.println(ret);
    }
}
