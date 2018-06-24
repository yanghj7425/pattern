package chapter19.composite.example;

import java.util.ArrayList;
import java.util.List;


public class ConcreteCompany extends Company {

    private List<Company> companies = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        companies.add(company);
    }

    @Override
    public void remove(Company company) {
        companies.remove(company);
    }

    @Override
    public void showInfo(int depth) {

        for (int i = 0; i < depth; i++) {
            System.out.print("\t");
        }
        System.out.println(getName());
        for (Company c : companies) {
            c.showInfo(depth + 1);
        }
    }

    @Override
    public void LineOfDuty() {
        for (Company c : companies) {
            c.LineOfDuty();
        }
    }
}
