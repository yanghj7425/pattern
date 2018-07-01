package chapter22.bridge;

import java.util.HashMap;
import java.util.Map;

/**
 * @description 手机品牌抽象类
 */
public abstract class HandsetBrand {

    //手机软件
    protected Map<String, HandsetSoft> softMap = new HashMap<>();


    public void attach(HandsetSoft soft) {
        if (!softMap.containsKey(soft.getName())) {
            softMap.put(soft.getName(), soft);
        }
    }

    public abstract void run(String softName);

    protected HandsetSoft getSoft(String softName) {
        if (!softMap.containsKey(softName)) {
            throw new IllegalArgumentException("can`t support this operation");
        }
        return softMap.get(softName);
    }

}
