package classes_and_objects.classes.enums.EnumTypes.IntEnumPattern;

public class IntEnumPatternClient {
  public static void main(String[] args) {

    Machine machine = new Machine();
    machine.setState(MachineState.BUSY);  // (1) Constant qualified by classname
    machine.setState(1);                  // Same as (1)
    machine.setState(5);                  // Any int will do.
    System.out.println(MachineState.BUSY);// Prints "1", not "BUSY".
  }
}