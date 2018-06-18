package chapter8.factory.calculate;

public class AddCalculate extends Calculate {

    public AddCalculate(double a, double b) {
        setOperationNumberA(a);
        setOperationNumberB(b);
    }

    public double getResult() {
        return getOperationNumberA() + getOperationNumberB();
    }
}
