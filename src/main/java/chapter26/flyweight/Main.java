package chapter26.flyweight;

public class Main {

    public static void main(String[] args) {
        FlyWeightFactory factory = new FlyWeightFactory();
        FlyWeight flyWeight = factory.getFlyWeight("styleA");

        flyWeight.operation(20010);
        flyWeight.operation(19990);
    }
}
