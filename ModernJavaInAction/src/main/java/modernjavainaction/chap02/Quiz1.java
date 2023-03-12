package modernjavainaction.chap02;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import static java.util.Comparator.comparing;

public class Quiz1 {
    public static void main(String[] args) {

        inventory.sort(comparing(Apple::getWeight)
                .reversed()
                .thenComparing(Apple::getColor));

    }
    public static void prettyPrintApple(List<Apple> inventory, AppleFormatter appleFormatter){
        for(Apple apple : inventory){
            String output = appleFormatter.accept(apple);
            System.out.println(output);
        }
    }

}
