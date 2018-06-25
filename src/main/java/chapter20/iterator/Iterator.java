package chapter20.iterator;

public abstract class Iterator<T>{

    public abstract T first();
    public abstract T next();
    public abstract boolean hasNext();
    public abstract T currentItem();
}
