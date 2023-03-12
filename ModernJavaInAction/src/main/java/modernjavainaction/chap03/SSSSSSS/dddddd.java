package modernjavainaction.chap03.SSSSSSS;

import modernjavainaction.chap03.Apple;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class dddddd {
    static Map<String, Function<Integer, Fruit>> map = new HashMap<>();
    public static Fruit giveMeFruit(String fruit, Integer weight){
        return map.get(fruit.toLowerCase())
                .apply(weight);
    }
    public static void main(String[] args) {
        map.put("apple", Apple::new);
    }
}
