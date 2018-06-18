package chapter13.bulider;

public class Product {
    private String optionA;
    private String optionB;

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }



    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    @Override
    public String toString() {
        return "Product{" +
                "optionA='" + optionA + '\'' +
                ", optionB='" + optionB + '\'' +
                '}';
    }
}
