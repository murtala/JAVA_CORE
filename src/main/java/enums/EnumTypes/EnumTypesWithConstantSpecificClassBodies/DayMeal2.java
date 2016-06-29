package enums.EnumTypes.EnumTypesWithConstantSpecificClassBodies;

import java.util.*;

public class DayMeal2 implements Comparable {

  public enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
  }

  public enum Meal {
    // Each enum constant defines a constant-specific class body
    BREAKFAST(7,30) {
      public double mealPrice(Day day) {
        double breakfastPrice = 10.50;
        if (weekend.contains(day))
            breakfastPrice *= 1.5;
        return breakfastPrice;
      }
    },
    LUNCH(12,15) {
      public double mealPrice(Day day) {
        double lunchPrice = 20.50;
        if (weekend.contains(day))
            lunchPrice *= 2.0;
        return lunchPrice;
      }
    },
    DINNER(19,45) {
      public double mealPrice(Day day) {
        double dinnerPrice = 25.50;
        if (weekend.contains(day))
            dinnerPrice *= 2.5;
        return dinnerPrice;
      }
    };

    // Abstract method which the constant-specific class body
    abstract double mealPrice(Day day);

    // Static field referenced in the the constant-specific class bodies
    private static final EnumSet<Day> weekend =
                       EnumSet.range(Day.SATURDAY, Day.SUNDAY);

    // Enum constructor
    Meal(int hh, int mm) {
      assert (hh >= 0 && hh <= 23): "Illegal hour.";
      assert (mm >= 0 && hh <= 59): "Illegal mins.";
      this.hh = hh;
      this.mm = mm;
    }

    // Instance fields: Time for the meal.
    private int hh;
    private int mm;

    // Instance methods
    public int getHour() { return this.hh; }
    public int getMins() { return this.mm; }

  } // End Meal

  // Day and meal info
  private final Day day;
  private final Meal meal;

  // Constructor
  private DayMeal2(Day day, Meal meal) {
    if (day == null || meal == null)
        throw new NullPointerException(day + ", " + meal);
    this.day = day;
    this.meal = meal;
  }

  // Utility methods
  public Day day()         { return day; }
  public Meal meal()       { return meal; }
  public String toString() { return day + "-" + meal; }

  // Primary sort on day, secondary sort on meal
  public int compareTo(Object o) {
    DayMeal2 dm = (DayMeal2)o;
    int dayCompare = day.compareTo(dm.day);
    return (dayCompare != 0 ? dayCompare : meal.compareTo(dm.meal));
  }

  // Repository of all day meals
  private static final List<DayMeal2> sortedDayMealList =
                   new ArrayList<DayMeal2>(7*3);
                   
  // Populating the repository of all day meals
  static {
    for (Meal meal : Meal.values())
      for (Day day : Day.values())
        sortedDayMealList.add(new DayMeal2(day, meal));
  }

  // Returns a shuffled day meal list
  public static List<DayMeal2> newDayMealList() {
    List<DayMeal2> result = new ArrayList<DayMeal2>(sortedDayMealList);
    Collections.shuffle(result);
    return result;
  }
}