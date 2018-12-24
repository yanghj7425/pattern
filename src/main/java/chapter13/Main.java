package chapter13;

import chapter13.bulider.Builder;
import chapter13.bulider.ConcreteBuilderY;
import chapter13.bulider.Director;

public class Main {

    public static void main(String[] args) {

        Builder builder = new ConcreteBuilderY();
        Director director = new Director(builder);

        director.construct();

        builder.getResult();
    }
}
