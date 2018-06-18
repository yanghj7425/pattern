package chapter9.prototype;

public class Resume implements Cloneable {

    private String name;
    private String sex;
    private WorkExperience workExperience;


    public Resume() {
        this.workExperience = new WorkExperience();
    }

    private Resume(WorkExperience workExperience) {
        this.workExperience = workExperience.clone();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setWorkExperience(String company, String workDate) {
        this.workExperience.setCompany(company);
        this.workExperience.setWorkDate(workDate);
    }

    @Override
    public Resume clone() {
        Resume resume = new Resume(this.workExperience);
        resume.setName(this.getName());
        resume.setSex(this.getSex());
        return resume;
    }


    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", workExperience=" + workExperience +
                '}';
    }
}
