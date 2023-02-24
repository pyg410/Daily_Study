package modernjavainaction.chap03;

import java.util.Comparator;
import java.util.List;

public class Study_lambda1 {
    public static void main(String[] args) {
//        Comparator<Apple> byWeight = new Comparator<Apple>() {
//            public int compare(Apple o1, Apple o2) {
//                // return o1.getWeight().compareTo(o2.getWeight()); -> Integer타입이 아니기 때문에 안된다.
//                return Integer.compare(o1.getWeight(), o2.getWeight());
//            }
//        };

//        Comparator<Apple> byWeight =
//                (Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight()); -> 참조형이 아니기 때문에 compareTo사용 불가
        Comparator<Apple> byWeight =
                (Apple a1, Apple a2) -> Integer.compare(a1.getWeight(), a2.getWeight());

//        List<Apple> greenApples =
//                filter(inventory, (Apple a) -> GREEN.equals(a.getColor()));
    }
}
