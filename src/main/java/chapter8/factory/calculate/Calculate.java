package chapter8.factory.calculate;

public abstract class Calculate {
    private double operationNumberA;

    private double operationNumberB;

    public abstract double getResult();

    public double getOperationNumberA() {
        return operationNumberA;
    }

    public void setOperationNumberA(double operationNumberA) {
        this.operationNumberA = operationNumberA;
    }

    public double getOperationNumberB() {
        return operationNumberB;
    }

    public void setOperationNumberB(double operationNumberB) {
        this.operationNumberB = operationNumberB;
    }
}
