package chapter16.state;

import org.junit.Test;

public class StateTest {

    @Test
    public void stateTest() {
        Work work = new Work(2);
        work.goOnProgram();
        work.setHour(4);
        work.goOnProgram();
    }
}
