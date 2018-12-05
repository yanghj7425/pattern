package chapter8.factory;

import chapter8.factory.leifeng.IFactory;
import chapter8.factory.leifeng.LeiFen;
import chapter8.factory.leifeng.VolunteerFactory;
import org.junit.Test;

public class LeiFenFactoryTest {


    @Test
    public void test() {
        IFactory iFactory = new VolunteerFactory();

        LeiFen leiFeng = iFactory.createLeiFen();

        leiFeng.action();
    }
}
