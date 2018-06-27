package chapter22.bridge;

/**
 * @description 手机品牌抽象类
 */
public abstract class HandsetBrand {

    //手机软件
    protected HandsetSoft handsetSoft;


    public void setHandsetSoft(HandsetSoft handsetSoft) {
        this.handsetSoft = handsetSoft;
    }

    public abstract void run();
}
