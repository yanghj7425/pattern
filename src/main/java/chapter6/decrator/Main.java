package chapter6.decrator;

import chapter6.decrator.component.ConcretePerson;
import chapter6.decrator.decorator.ConcreteDecorateWindCoat;
import chapter6.decrator.decorator.ConcreteDecoratorShirt;
import sun.applet.AppletClassLoader;

public class Main {
    public static void main(String[] args) {
        ConcretePerson yhj = new ConcretePerson();
        ConcreteDecoratorShirt tShirt = new ConcreteDecoratorShirt();
        ConcreteDecorateWindCoat windCoat = new ConcreteDecorateWindCoat();

        tShirt.decorator(yhj);
        windCoat.decorator(tShirt);

        System.out.println(System.getProperty("java.ext.dirs"));

        windCoat.show();

        AppletClassLoader appletClassLoader ;
    }
}
