package chapter20.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate<T> extends Aggregate {
    private List<T> list = new ArrayList<>();


    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator(this);
    }

    public int size() {
        return list.size();
    }

    public T get(int idx) {
        return list.get(idx);
    }

    public void add(T obj){
        list.add(obj);
    }

}
