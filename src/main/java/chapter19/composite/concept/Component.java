package chapter19.composite.concept;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public abstract class Component {
    private String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract void show(int depth);


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Component)) return false;

        Component component = (Component) o;

        return new EqualsBuilder()
                .append(name, component.name)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(name)
                .toHashCode();
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
}
