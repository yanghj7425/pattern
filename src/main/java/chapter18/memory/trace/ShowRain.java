package chapter18.memory.trace;

public class ShowRain {
    private String name;
    private String time;
    private String weather;


    private RainMemory rainMemory;


    public RainMemory createBackUp(){
        return  new RainMemory(name,time,weather);
    }

    public void show() {
        System.out.println(getClass().getName() + this);

    }

    @Override
    public String toString() {
        return "ShowRain{" +
                "name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", weather='" + weather + '\'' +
                '}';
    }

}
