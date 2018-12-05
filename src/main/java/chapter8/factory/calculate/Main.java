package chapter8.factory.calculate;

public class Main {
    public static void main(String[] args) {
        CalculateFactory factory = new AddCalculateFactory();
        Calculate addCalc = factory.getCalculate();
        System.out.println(addCalc.getResult());
    }
}
