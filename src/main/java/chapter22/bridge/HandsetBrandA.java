package chapter22.bridge;

public class HandsetBrandA extends HandsetBrand {
    @Override
    public void run() {
        System.out.println(getClass().getName());
        handsetSoft.run();
    }
}
