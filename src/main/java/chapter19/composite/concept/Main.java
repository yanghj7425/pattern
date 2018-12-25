package chapter19.composite.concept;

public class Main {
    public static void main(String[] args) {
        Composite root = new Composite("root");

        root.add(new Leaf("leaf A"));
        root.add(new Leaf("leaf B"));

        Composite comp = new Composite("comp");

        comp.add(new Leaf("comp A"));
        comp.add(new Leaf("comp B"));

        root.add(comp);

        root.show(1);
    }
}
