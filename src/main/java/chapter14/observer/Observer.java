package chapter14.observer;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public abstract class Observer {

    private String name;

    private Subject subject;

    public abstract void update();


    public Observer(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Observer)) return false;

        Observer observer = (Observer) o;

        return new EqualsBuilder()
                .append(name, observer.name)
                .append(subject, observer.subject)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(name)
                .append(subject)
                .toHashCode();
    }
}
