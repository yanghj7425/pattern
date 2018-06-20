package chapter15.abstract_factory.impl.entity;

import chapter15.abstract_factory.entity.IUser;

public class AccessIUser implements IUser {
    public void queryUser() {
        System.out.println("this is AccessIUser");
    }
}
