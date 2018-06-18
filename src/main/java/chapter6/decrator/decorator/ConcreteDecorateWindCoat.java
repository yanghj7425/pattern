package chapter6.decrator.decorator;

public class ConcreteDecorateWindCoat extends Decorator {

    @Override
    public void show() {
        super.show();
        sayGodBye();
    }

    private void sayGodBye() {

        System.out.println(getClass().getSimpleName());
    }

}
