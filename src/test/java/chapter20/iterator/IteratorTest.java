package chapter20.iterator;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.Test;

public class IteratorTest {

    public static class User {

        private String name;

        public User(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;

            if (!(o instanceof User)) return false;

            User user = (User) o;

            return new EqualsBuilder()
                    .append(name, user.name)
                    .isEquals();
        }

        @Override
        public int hashCode() {
            return new HashCodeBuilder(17, 37)
                    .append(name)
                    .toHashCode();
        }


        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    @Test
    public void iteratorTest() {

        ConcreteAggregate<User> concreteAggregate = new ConcreteAggregate<>();


        User a = new User("'a");
        User b = new User("a");

        System.out.println(a.equals(b));


        concreteAggregate.add(new User("a"));
        concreteAggregate.add(new User("b"));
        concreteAggregate.add(new User("d"));
        concreteAggregate.add(new User("s"));
        concreteAggregate.add(new User("a"));
        concreteAggregate.add(new User("e"));
        concreteAggregate.add(new User("u"));


        Iterator<User> itr = concreteAggregate.createIterator();
        while (itr.hasNext()) {
            User u = itr.next();
            System.out.println(u);
        }

    }
}
