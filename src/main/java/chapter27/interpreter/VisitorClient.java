package chapter27.interpreter;

import chapter27.interpreter.element.Man;
import chapter27.interpreter.element.Woman;
import chapter27.interpreter.visitor.Action;
import chapter27.interpreter.visitor.FailAction;
import chapter27.interpreter.visitor.SuccessAction;

public class VisitorClient {
    public void visitorClient() {
        Action action;
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());

        objectStructure.attach(new Woman());

        action = new SuccessAction();

        objectStructure.show(action);

        action = new FailAction();

        objectStructure.show(action);


    }
}
