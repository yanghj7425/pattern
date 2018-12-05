package chapter8.factory.leifeng;

public class Main {

    public static void main(String[] args) {
        IFactory iFactory = new StudentFactory();
        LeiFen leiFen = iFactory.createLeiFen();
        leiFen.action();
    }
}

