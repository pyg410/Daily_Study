package modernjavainaction.chap02;

import java.util.List;
import java.util.function.Predicate;

public class Quiz1 {

    public static void prettyPrintApple(List<Apple> inventory, AppleFormatter appleFormatter){
        for(Apple apple : inventory){
            String output = appleFormatter.accept(apple);
            System.out.println(output);
        }
    }

}
