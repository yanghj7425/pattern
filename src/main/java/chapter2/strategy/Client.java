package chapter2.strategy;

public class Client {

    private Strategy strategy;

    public void getResult() {
        if (strategy == null) {
            strategy = new Strategy() {
                @Override
                public String algorithmStrategy() {
                    return getClass().getName();
                }
            };
        }
        Context context = new Context(strategy);
        String result = context.getContextResult();
        System.out.println(result);
    }


    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
