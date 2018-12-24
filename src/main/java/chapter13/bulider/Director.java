package chapter13.bulider;

public class Director {
    private Builder bulider;

    public Director(Builder bulider) {
        this.bulider = bulider;
    }


    public void construct() {
        bulider.optionB();
        bulider.optionA();
    }
}
