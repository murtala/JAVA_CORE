package enums.EnumTypes.EnumTypesWithConstantSpecificClassBodies;
import java.util.*;

public class DayMealPlanner2 {
  public static void main(String[] args) {
    List<DayMeal2> dayMealList  = DayMeal2.newDayMealList();
    System.out.println("Unsorted Meal List: " + dayMealList);
    Collections.sort(dayMealList, null);
    System.out.println("Sorted Meal List: " + dayMealList);
    System.out.println("Prices:");
    for (DayMeal2 dm : dayMealList) {
      DayMeal2.Day day = dm.day();
      DayMeal2.Meal meal = dm.meal();
      System.out.print(dm + ": ");
      System.out.println(meal.mealPrice(day));
    }
  }
}