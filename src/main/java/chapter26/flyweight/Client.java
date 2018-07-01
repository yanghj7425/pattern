package chapter26.flyweight;

public class Client {

    public void clientTest() {
        FlyWeightFactory factory = new FlyWeightFactory();
        FlyWeight flyWeight = factory.getFlyWeight("styleA");

        flyWeight.operation(20010);
        flyWeight.operation(19990);
    }
}
