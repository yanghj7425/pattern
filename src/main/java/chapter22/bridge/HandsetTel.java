package chapter22.bridge;

/**
 * @description 打电话功能
 */
public class HandsetTel extends HandsetSoft {

    @Override
    public void run() {
        System.out.println(getClass().getName());
    }

}
