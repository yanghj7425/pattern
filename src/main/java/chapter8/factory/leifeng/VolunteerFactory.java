package chapter8.factory.leifeng;

public class VolunteerFactory implements IFactory{
    public LeiFeng CreateLeiFeng() {
        return new Volunteer();
    }
}
