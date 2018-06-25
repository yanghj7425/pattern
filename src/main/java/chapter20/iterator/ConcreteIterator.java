package chapter20.iterator;

public class ConcreteIterator<T> extends Iterator<T> {

    private ConcreteAggregate<T> concreteAggregate;
    private int index = 0;

    public ConcreteIterator(ConcreteAggregate concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
    }

    @Override
    public T first() {
        return concreteAggregate.get(0);
    }

    @Override
    public T next() {
        T obj = null;

        if (index < concreteAggregate.size()) {
            obj = concreteAggregate.get(index);
        }
        index++;
        return obj;
    }

    @Override
    public boolean hasNext() {
        return index >= concreteAggregate.size() ? false : true;
    }

    @Override
    public T currentItem() {
        return concreteAggregate.get(index);
    }
}
