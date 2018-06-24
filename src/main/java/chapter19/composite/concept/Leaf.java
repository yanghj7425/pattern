package chapter19.composite.concept;

public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("this is leaf node, can`t add node to a leaf node");
    }

    @Override
    public void remove(Component component) {
        System.out.println("this is leaf node, can`t remove a node from a leaf");
    }

    @Override
    public void show(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("\t");
        }
        System.out.println("\t" + getName());
    }
}
