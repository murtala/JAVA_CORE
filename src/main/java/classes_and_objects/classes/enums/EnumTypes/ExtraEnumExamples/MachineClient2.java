package classes_and_objects.classes.enums.EnumTypes.ExtraEnumExamples;

public class MachineClient2 {
  public static void main(String[] args) {

    Machine2 machine = new Machine2();
    machine.setState(MachineState2.BUSY);
    // machine.setState(1); // Compile error
    System.out.println(MachineState2.BUSY);
    // Prints "Busy"
  }
}