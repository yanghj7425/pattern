package chapter20.iterator;

public abstract class Aggregate<T> {
    public abstract Iterator<T> createIterator();
}
