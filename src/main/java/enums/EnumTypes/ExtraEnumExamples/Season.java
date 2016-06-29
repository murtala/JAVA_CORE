package enums.EnumTypes.ExtraEnumExamples;

import java.util.*;
import java.io.*;

public final class Season implements Comparable, Serializable {
  private final String name;
  public String toString() { return name; }

  private Season(String name) { this.name = name; }

  public static final Season WINTER = new Season("winter");
  public static final Season SPRING = new Season("spring");
  public static final Season SUMMER = new Season("summer");
  public static final Season FALL   = new Season("fall");

  private static int nextOrdinal = 0;
  private final int ordinal = nextOrdinal++;

  public int compareTo(Object o) {
    return ordinal - ((Season)o).ordinal;
  }

  private static final Season[] PRIVATE_VALUES =
                   { WINTER, SPRING, SUMMER, FALL };
  public static final List VALUES = Collections.unmodifiableList(
                   Arrays.asList(PRIVATE_VALUES));
  private Object readResolve() {
    // Canonicalize
    return PRIVATE_VALUES[ordinal];
  }
}