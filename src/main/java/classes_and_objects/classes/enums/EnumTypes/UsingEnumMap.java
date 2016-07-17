package classes_and_objects.classes.enums.EnumTypes;

import java.util.*;

public class UsingEnumMap {

    enum Day {
       MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

  public static void main(String[] args) {


    int[] freqArray = {12, 34, 56, 23, 5, 13, 78};

    // Create a Map of frequencies
    Map<Day, Integer> ordinaryMap = new HashMap<Day, Integer>();
    for (Day day : Day.values())
        ordinaryMap.put(day, freqArray[day.ordinal()]);
    System.out.println("Frequency Map: " + ordinaryMap);

    // Create an EnumMap of frquencies
    EnumMap<Day, Integer> frequencyEnumMap =
                      new EnumMap<Day, Integer>(ordinaryMap);

    // Change some frequencies
    frequencyEnumMap.put(Day.MONDAY, 100);
    frequencyEnumMap.put(Day.FRIDAY, 123);
    System.out.println("Frequency EnumMap: " + frequencyEnumMap);

    // Values
    Collection<Integer> frequencies = frequencyEnumMap.values();
    System.out.println("Frequencies: " + frequencies);

    // Keys
    Set<Day> days = frequencyEnumMap.keySet();
    System.out.println("Days: " + days);
  }
}