package chapter13.bulider;

import org.junit.Test;

public class BuliderTest {

    @Test
    public void buliderTest() {
        Bulider bulider = new ConcreteBuliderY();
        Director director = new Director(bulider);

        director.construct();

        bulider.getResult();
    }

}
