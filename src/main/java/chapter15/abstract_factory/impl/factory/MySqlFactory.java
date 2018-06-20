package chapter15.abstract_factory.impl.factory;

import chapter15.abstract_factory.entity.IUser;
import chapter15.abstract_factory.factory.IFactory;
import chapter15.abstract_factory.impl.entity.MySqlIUser;

public class MySqlFactory implements IFactory {
    public IUser createIUser() {
        return new MySqlIUser();
    }
}
