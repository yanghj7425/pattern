package chapter19.composite.concept;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void show(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("\t");
        }
        System.out.println("\t" + getName());
        for (Component c : children) {
            c.show(depth + 1);
        }
    }
}
