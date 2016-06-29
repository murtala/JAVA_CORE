package enums.EnumTypes.TypesafeEnumPattern;

import java.util.*;
import java.io.*;

// Class can implement interfaces. 
public class MachineState implements Comparable, Serializable {

  // Descriptive name of the constant
  private final String name;
  public String toString() { return name; }

  // Private constructor which cannot be called to create more objects.
  private MachineState(String name) { this.name = name; }

  // Self-typed constants
  public static final MachineState BUSY = new MachineState("Busy");       // (1)
  public static final MachineState IDLE = new MachineState("Idle");       // (2)
  public static final MachineState BLOCKED = new MachineState("Blocked"); // (3)

  // Constants are assigned values consecutively, starting with 0.
  // Static counter to keep track of values assigned so far.
  private static int nextOrdinal = 0;

  // The value in a constant is the current value of nextOrdinal.
  private final int ordinal = nextOrdinal++;

  // Prevent overriding of equals() from Object class.
  public final boolean equals(Object o) {
    return super.equals(o);
  }

  // Prevent overriding of hashode() from Object class.
  public final int hashCode() {
    return super.hashCode();
  }

  // Natural order of constants is declaration order.
  public int compareTo(Object o) {
    return ordinal - ((MachineState)o).ordinal;
  }

  // Used in serialization
  private static final MachineState[] PRIVATE_VALUES =
                 { BUSY, IDLE, BLOCKED };
  public static final List VALUES = Collections.unmodifiableList(
                   Arrays.asList(PRIVATE_VALUES));
  private Object readResolve() {
    // Canonicalize
    return PRIVATE_VALUES[ordinal];
  }
  // Other members can be added.
}