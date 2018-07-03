package chapter27.interpreter;

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
