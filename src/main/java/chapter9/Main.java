package chapter9;

import chapter9.prototype.Resume;

public class Main {
    public static void main(String[] args) {
        Resume resume = new Resume();
        resume.setSex("man");
        resume.setName("yanghj");
        resume.setWorkExperience("I don`t known", "12");
        Resume resume1 = resume.clone();
        resume1.setSex("nv");
        resume1.setWorkExperience("hhhhh", "sfas");
        System.out.println("resume1：\r\n" + resume1);
        System.out.println("resume:\r\n" + resume);
    }
}
