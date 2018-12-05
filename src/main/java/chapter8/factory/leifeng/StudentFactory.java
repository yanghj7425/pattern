package chapter8.factory.leifeng;

public class StudentFactory implements IFactory{


    public LeiFen createLeiFen() {
        return new Student();
    }
}
