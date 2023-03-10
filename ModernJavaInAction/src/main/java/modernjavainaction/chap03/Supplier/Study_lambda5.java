package modernjavainaction.chap03.Supplier;

import modernjavainaction.chap03.Predicate.Study_lambda4;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;

public class Study_lambda5 {
    public static void main(String[] args) {
        Function<String, String> function = (String s) -> s.substring(1);
        List<String> list = filters(Arrays.asList("lambdas", "in", "action"), function);
        for(String s : list){
            System.out.println(s);
        }


    }

    public static <T, R> List<R> filters(List<T> list, Function<T, R> f){
        List<R> rList = new ArrayList<>();
        for(T t : list){
            rList.add(f.apply(t));
        }
        return rList;
    }
}
