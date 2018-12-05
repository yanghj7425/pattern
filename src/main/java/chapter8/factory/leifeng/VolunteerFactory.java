package chapter8.factory.leifeng;

public class VolunteerFactory implements IFactory{
    public LeiFen createLeiFen() {
        return new Volunteer();
    }
}
