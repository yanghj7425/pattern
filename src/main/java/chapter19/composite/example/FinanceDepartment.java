package chapter19.composite.example;

public class FinanceDepartment extends Company {

    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void showInfo(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("\t");
        }
        System.out.println(getName());
    }

    @Override
    public void LineOfDuty() {
        System.out.println(getClass().getName() + "\t :LineOfDuty \t" + getName());
    }
}
