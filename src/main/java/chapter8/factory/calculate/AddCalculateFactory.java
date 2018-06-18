package chapter8.factory.calculate;

public class AddCalculateFactory extends CalculateFactory {

    @Override
    public Calculate getCalculate() {
        return new AddCalculate(1, 5);
    }
}
