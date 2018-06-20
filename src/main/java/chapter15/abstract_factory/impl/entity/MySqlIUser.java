package chapter15.abstract_factory.impl.entity;

import chapter15.abstract_factory.entity.IUser;

public class MySqlIUser implements IUser {

    public MySqlIUser() {
        System.out.println("this no parameter constructor");
    }

    public void queryUser() {
        System.out.println("this  is MysqlIUser");
    }
}
