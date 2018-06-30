package chapter25.mediator;

import java.util.ArrayList;
import java.util.List;

public class UnitedSecurityNations implements UnitedNations {

    List<Country> countries = new ArrayList<>();

    @Override
    public void sendMessageToOther(String msg, Country country) {
        for (Country c : countries) {
            if (!c.equals(country)) {
                c.getMessage(msg);
            }
        }
    }

    @Override
    public void addUnited(Country country) {
        countries.add(country);
    }

    @Override
    public void sendMessageToSpecial(String msg, Country country) {
        boolean isExist = countries.contains(country);
        if (isExist) {
            country.getMessage(msg);
        } else {
            System.out.println(country.getClass().getName() + " haven`t join us");
        }

    }
}
