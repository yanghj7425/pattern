package chapter27.interpreter;

public class FailAction implements Action {
    @Override
    public void manReaction(Man man) {
        System.out.println(man.getClass().getName() + "\t" + getClass().getName());
    }

    @Override
    public void womanReaction(Woman woman) {
        System.out.println(woman.getClass().getName() + "\t" + getClass().getName());
    }
}
