package chapter26.flyweight;

public class ConcreteFlyWeightB implements FlyWeight {
    @Override
    public void operation(int state) {
        System.out.println(getClass().getName() + "\t" + state);
    }
}
