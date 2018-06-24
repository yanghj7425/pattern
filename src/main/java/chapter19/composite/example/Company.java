package chapter19.composite.example;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public abstract class Company {
    private String name;

    public Company(String name) {
        this.name = name;
    }


    public abstract void add(Company company);

    public abstract void remove(Company company);

    public abstract void showInfo(int depth);

    public abstract void LineOfDuty();

    
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Company)) return false;

        Company company = (Company) o;

        return new EqualsBuilder()
                .append(name, company.name)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(name)
                .toHashCode();
    }
}
