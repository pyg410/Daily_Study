package modernjavainaction.chap02;

import java.util.function.Predicate;

public class WeightApplePredicate implements  AppleFormatter{


    @Override
    public String accept(Apple apple) {
        String s = apple.getWeight() > 150 ? "heavy" : "light";
        return "A" + s + " " + apple.getColor() + "g";
    }
}
