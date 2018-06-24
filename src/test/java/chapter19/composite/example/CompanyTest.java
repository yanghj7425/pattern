package chapter19.composite.example;

import org.junit.Test;

public class CompanyTest {
    @Test
    public void companyTest() {
        ConcreteCompany comp = new ConcreteCompany("head");
        HRDepartment compHR = new HRDepartment("head hr");
        FinanceDepartment compFin = new FinanceDepartment("head finance");

        comp.add(compHR);
        comp.add(compFin);

        ConcreteCompany partA = new ConcreteCompany("part A");
        HRDepartment partAHR = new HRDepartment("part A hr");
        FinanceDepartment partAFin  = new FinanceDepartment("partA finance ");

        partA.add(partAFin);
        partA.add(partAHR);


        comp.add(partA);

        comp.showInfo(1);



        comp.LineOfDuty();
    }
}
