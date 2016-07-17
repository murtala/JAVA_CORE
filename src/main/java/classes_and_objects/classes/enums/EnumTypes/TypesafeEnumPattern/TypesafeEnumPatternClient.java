package classes_and_objects.classes.enums.EnumTypes.TypesafeEnumPattern;

public class TypesafeEnumPatternClient {
  public static void main(String[] args) {

    Machine machine = new Machine();
    machine.setState(MachineState.BUSY);
    // machine.setState(1); // Compile error
    System.out.println(MachineState.BUSY);
    // Prints "Busy"
  }
}