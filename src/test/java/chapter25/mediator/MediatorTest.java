package chapter25.mediator;

import org.junit.Test;

public class MediatorTest {


    @Test

    public void mediatorTest() {
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
