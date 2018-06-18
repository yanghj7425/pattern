package chapter9.prototype;

public class WorkExperience implements Cloneable {
    private String workDate;
    private String company;


    public WorkExperience() {

    }

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public WorkExperience clone() {
        WorkExperience workExperience = null;
        try {
            workExperience = (WorkExperience) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return workExperience;
    }

    @Override
    public String toString() {
        return "WorkExperience{" +
                "workDate='" + workDate + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
