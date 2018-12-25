package chapter25;

import chapter25.mediator.*;

public class Main {
    public static void main(String[] args) {
        UnitedNations unitedNations = new UnitedSecurityNations();

        USA usa = new USA();
        China china = new China();
        Japan japan = new Japan();
        Egypt egypt = new Egypt();

        unitedNations.addUnited(usa);
        unitedNations.addUnited(china);
        unitedNations.addUnited(japan);

        unitedNations.sendMessageToOther("hello", japan);

        unitedNations.sendMessageToSpecial("hahahh", egypt);
    }
}
