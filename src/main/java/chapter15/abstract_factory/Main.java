package chapter15.abstract_factory;

import chapter15.abstract_factory.entity.IUser;
import chapter15.abstract_factory.factory.IFactory;
import chapter15.abstract_factory.impl.factory.MySqlFactory;

public class Main {
    public static void main(String[] args) {
        IFactory factory = new MySqlFactory();
        IUser user = factory.createIUser();
        user.queryUser();


//        String reflect = "chapter15.abstract_factory.impl.entity.MySqlIUser";
//        Class<?> c = Class.forName(reflect);
//        Class classes[] = c.getInterfaces();
//
//        for (Class bb : classes) {
//            System.out.println(bb.getSimpleName());
//        }
//        IUser user = (IUser) c.newInstance();
//        System.out.println(user.getClass().getSimpleName());
//        user.queryUser();
    }
}
