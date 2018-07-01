package chapter26.flyweight;

public class ConcreteFlyWeightA implements FlyWeight {
    private String title;

    @Override
    public void operation(int state) {
        System.out.println(getClass().getName() + "\t" + state + "\t" + title);
    }


    public ConcreteFlyWeightA(String title) {
        this.title = title;
    }
}
