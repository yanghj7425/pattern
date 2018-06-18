package chapter8.factory.leifeng;

public class StudentFactory implements IFactory{


    public LeiFeng CreateLeiFeng() {
        return new Student();
    }
}
