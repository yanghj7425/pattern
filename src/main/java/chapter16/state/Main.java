package chapter16.state;

public class Main {
    public static void main(String[] args) {
        Work work = new Work(2);
        work.goOnProgram();
        work.setHour(4);
        work.goOnProgram();
    }
}
