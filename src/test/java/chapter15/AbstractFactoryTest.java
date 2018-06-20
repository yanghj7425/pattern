package chapter15;

import chapter15.abstract_factory.entity.IUser;
import chapter15.abstract_factory.factory.IFactory;
import chapter15.abstract_factory.impl.factory.MySqlFactory;
import org.junit.Test;

public class AbstractFactoryTest {


    public void abstractFactoryTest() {
        IFactory factory = new MySqlFactory();
        IUser user = factory.createIUser();
        user.queryUser();
    }


    @Test
    public void abstractDataAccessTest() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String reflect = "chapter15.abstract_factory.impl.entity.MySqlIUser";
        Class<?> c = Class.forName(reflect);
        Class classes[] = c.getInterfaces();

        for (Class bb : classes
                ) {
            System.out.println(bb.getSimpleName());
        }
        IUser user = (IUser) c.newInstance();
        System.out.println(user.getClass().getSimpleName());
        user.queryUser();
    }
}
