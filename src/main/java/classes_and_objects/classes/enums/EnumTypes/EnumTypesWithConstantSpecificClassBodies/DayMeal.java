package classes_and_objects.classes.enums.EnumTypes.EnumTypesWithConstantSpecificClassBodies;

import java.util.*;

public class DayMeal implements Comparable {

  public enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
  }

  public enum Meal {
    BREAKFAST(7,30), LUNCH(12,15), DINNER(19,45);
    // Time for the meal.
    private int hh;
    private int mm;

    Meal(int hh, int mm) {
      assert (hh >= 0 && hh <= 23): "Illegal hour.";
      assert (mm >= 0 && hh <= 59): "Illegal mins.";
      this.hh = hh;
      this.mm = mm;
    }

    public int getHour() { return this.hh; }
    public int getMins() { return this.mm; }
  }
  // Day and meal info
  private final Day day;
  private final Meal meal;

  // Constructor
  private DayMeal(Day day, Meal meal) {
    if (day == null || meal == null)
        throw new NullPointerException(day + ", " + meal);
    this.day = day;
    this.meal = meal;
  }

  // Utility methods
  public Day day() { return day; }
  public Meal meal() { return meal; }
  public String toString() { return day + "-" + meal; }

  // Primary sort on day, secondary sort on meal
  public int compareTo(Object o) {
    DayMeal dm = (DayMeal)o;
    int dayCompare = day.compareTo(dm.day);
    return (dayCompare != 0 ? dayCompare : meal.compareTo(dm.meal));
  }

  // Repository of all day meals
  private static final List<DayMeal> sortedDayMealList =
                   new ArrayList<DayMeal>(7*3);
                   
  // Populating the repository of all day meals
  static {
    for (Meal meal : Meal.values())
      for (Day day : Day.values())
        sortedDayMealList.add(new DayMeal(day, meal));
  }

  // Returns a shuffled day meal list
  public static List<DayMeal> newDayMealList() {
    List<DayMeal> result = new ArrayList<DayMeal>(sortedDayMealList);
    Collections.shuffle(result);
    return result;
  }
}
