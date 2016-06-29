package enums.EnumTypes.EnumTypesWithConstantSpecificClassBodies;
import java.util.*;

public class DayMealPlanner {
  public static void main(String[] args) {
    int nLists = 3;           // No. of meal lists to make
    int nMealsPrList = 7;     // No. of meals on a list

    // Get a complete meal list
    List<DayMeal> dayMealList  = DayMeal.newDayMealList();
    System.out.println("Complete Meal List: " + dayMealList);

    // Create meal lists
    for (int i=0; i < nLists; i++) {
      List<DayMeal> newMealList = dealMeals(dayMealList, nMealsPrList);
      System.out.println("Meal List " + i + ": " +
                          newMealList);
    }

    // Print unallocated meals
    Collections.sort(dayMealList, null);
    System.out.println("Meal(s) not allocated: " + dayMealList);
  }

  /**
   * Returns a new ArrayList consisting of the last n day meals of
   * day meal list, which are removed from the list.
   * The returned list is sorted on natural ordering.
   */
  public static <E> List<E> dealMeals(List<E> dayMealList, int n) {
    int listSize = dayMealList.size();
    assert listSize - n >= 0: "Cannot deal meals";
    List<E> subMealList = dayMealList.subList(listSize - n, listSize);
    List<E> newMealList = new ArrayList<E>(subMealList);
    subMealList.clear();
    Collections.sort(newMealList, null);
    return newMealList;
  }
}