package chapter22.bridge;

/**
 * @description 打电话功能
 */
public class HandsetTel extends HandsetSoft {

    public HandsetTel() {
        super("tel");
    }

    @Override
    public void run() {
        System.out.println(getClass().getName());
    }

}
