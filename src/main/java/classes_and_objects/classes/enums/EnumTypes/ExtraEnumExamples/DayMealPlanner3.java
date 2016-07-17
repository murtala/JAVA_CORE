package classes_and_objects.classes.enums.EnumTypes.ExtraEnumExamples;

import java.util.*;

public class DayMealPlanner3 {
  public static void main(String[] args) {
    List<DayMeal3> dayMealList  = DayMeal3.newDayMealList();
    System.out.println("Unsorted Meal List: " + dayMealList);
    Collections.sort(dayMealList, null);
    System.out.println("Sorted Meal List: " + dayMealList);
    System.out.println("Prices:");
    for (DayMeal3 dm : dayMealList) {
      DayMeal3.Day day = dm.day();
      DayMeal3.Meal meal = dm.meal();
      System.out.print(dm + ": ");
      System.out.println(meal.mealPrice(day));
    }
  }
}