package chapter16.state;

public class ForenoonState extends State {
    @Override
    protected void mustBeDone(Work work) {
        System.out.println("do work");
    }
}
