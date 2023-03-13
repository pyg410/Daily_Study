package modernjavainaction.chap04;

import static java.util.stream.Collectors.toList;
import static modernjavainaction.chap04.Dish.menu;

import java.util.List;

public class HighCaloriesNames {

  public static void main(String[] args) {
      List<String> name = menu.stream()
              .filter(dish -> dish.getCalories()>300)
              .map(Dish::getName)
              .limit(3)
              .collect(toList());



    List<String> names = menu.stream()
        .filter(dish -> {
          System.out.println("filtering " + dish.getName());
          return dish.getCalories() > 300;
        })
        .map(dish -> {
          System.out.println("mapping " + dish.getName());
          return dish.getName();
        })
        .limit(3)
        .collect(toList());
    System.out.println(names);
  }

}
