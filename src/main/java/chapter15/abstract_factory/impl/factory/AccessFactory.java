package chapter15.abstract_factory.impl.factory;

import chapter15.abstract_factory.entity.IUser;
import chapter15.abstract_factory.factory.IFactory;
import chapter15.abstract_factory.impl.entity.AccessIUser;

public class AccessFactory implements IFactory{
    public IUser createIUser() {
        return new AccessIUser();
    }
}
