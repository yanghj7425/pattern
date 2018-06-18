package chapter13.bulider;

public class Director {
    private Bulider bulider;

    public Director(Bulider bulider) {
        this.bulider = bulider;
    }


    public void construct() {


        bulider.optionB();
        bulider.optionA();
    }
}
