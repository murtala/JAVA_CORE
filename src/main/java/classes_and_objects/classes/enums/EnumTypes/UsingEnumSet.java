package classes_and_objects.classes.enums.EnumTypes;
import java.util.EnumSet;

public class UsingEnumSet {
    enum Day {
       MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

  public static void main(String[] args) {


    EnumSet<Day> allDays = EnumSet.range(Day.MONDAY, Day.SUNDAY);
    System.out.println("All days: " + allDays);

    EnumSet<Day> weekend = EnumSet.range(Day.SATURDAY, Day.SUNDAY);
    System.out.println("Weekend: " + weekend);

    EnumSet<Day> oddDays = EnumSet.of(Day.MONDAY, Day.WEDNESDAY,
                                      Day.FRIDAY, Day.SUNDAY);
    System.out.println("Odd days: " + oddDays);

    EnumSet<Day> evenDays = EnumSet.complementOf(oddDays);
    System.out.println("Even days: " + evenDays);

    EnumSet<Day> weekDays = EnumSet.complementOf(weekend);
    System.out.println("Week days: " + weekDays);
  }
}