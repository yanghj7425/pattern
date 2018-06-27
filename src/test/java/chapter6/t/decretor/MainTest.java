package chapter6.t.decretor;

import chapter6.decrator.component.ConcretePerson;
import chapter6.decrator.decorator.ConcreteDecoratorShirt;
import chapter6.decrator.decorator.ConcreteDecorateWindCoat;
import org.junit.Test;
import sun.applet.AppletClassLoader;

public class MainTest {


    @Test
    public void test(){
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
