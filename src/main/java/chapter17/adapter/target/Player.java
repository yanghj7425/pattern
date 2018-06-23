package chapter17.adapter.target;

public abstract class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println("my name is" + name);
    }

    public abstract void LetsGo();
}
