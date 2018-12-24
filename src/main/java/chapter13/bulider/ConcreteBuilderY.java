package chapter13.bulider;

public class ConcreteBuilderY extends Builder {

    private Product product = new Product();

    public void optionA() {

        product.setOptionA("this is optionA  BuliderY");
        System.out.println(product);
    }

    public void optionB() {
        product.setOptionB("this is optionB BuliderY");
        System.out.println(product);
    }

    public Product getResult() {
        return product;
    }

}
