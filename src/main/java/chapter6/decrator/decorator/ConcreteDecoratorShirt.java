package chapter6.decrator.decorator;

public class ConcreteDecoratorShirt extends Decorator {

    @Override
    public void show() {
        super.show();
        sayHello();
    }

    private void sayHello() {
        System.out.println(getClass().getSimpleName());
    }


}
