package chapter26.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {

    Map<String, FlyWeight> flyWeightMap = new HashMap<>();

    FlyWeight getFlyWeight(String key) {
        if (!flyWeightMap.containsKey(key)) {
            flyWeightMap.put(key, new ConcreteFlyWeightA(key));
        }

        return flyWeightMap.get(key);
    }

}
