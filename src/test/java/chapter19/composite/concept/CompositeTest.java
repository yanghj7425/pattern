package chapter19.composite.concept;

import chapter19.composite.concept.Composite;
import chapter19.composite.concept.Leaf;
import org.junit.Test;

public class CompositeTest {

    @Test
    public void compositeTest() {
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
