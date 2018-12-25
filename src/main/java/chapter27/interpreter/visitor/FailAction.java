package chapter27.interpreter.visitor;


import chapter27.interpreter.element.Man;
import chapter27.interpreter.element.Woman;

public class FailAction implements Action {

    @Override
    public void manReaction(Man man) {
        System.out.println(man.getClass().getName() + "\t" + getClass().getSimpleName());
        man.cheerUp();
    }

    @Override
    public void womanReaction(Woman woman) {
        System.out.println(woman.getClass().getName() + "\t" + getClass().getSimpleName());
    }

}
