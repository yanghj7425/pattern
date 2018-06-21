package chapter16.state;

public class SleepState extends State {
    @Override
    protected boolean isFinished(Work work) {
        return true;
    }

}
