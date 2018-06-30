package chapter25.mediator;

public interface UnitedNations {

    void sendMessageToOther(String msg, Country country);

    void addUnited(Country country);

    void sendMessageToSpecial(String msg,Country country);
}
