package chapter22.bridge;

public class HandsetBrandA extends HandsetBrand {
    @Override
    public void run(String softName) {
        HandsetSoft soft = getSoft(softName);
        soft.run();
    }


}
