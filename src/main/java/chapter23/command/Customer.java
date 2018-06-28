package chapter23.command;

public class Customer {


    public void customer(){
            Barbecuer boy = new Barbecuer();

            Waiter girl = new Waiter();


            Command bakeMutton = new BakeChickenWingCommand(boy);
            Command bakeChickenWing = new BakeChickenWingCommand(boy);


            girl.setCommand(bakeChickenWing);

            girl.setCommand(bakeMutton);




            girl.notifyCommander();




    }
}
