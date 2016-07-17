package classes_and_objects.classes.enums.EnumTypes;

public class EnumClient {
  public static void main(String[] args) {

    Machine machine = new Machine();
    machine.setState(MachineState.IDLE);
    // machine.setState(1); // Compile error

    MachineState state = machine.getState();
    switch(state) {
    //case MachineState.BUSY: // Compile error: Must be unqualified.
      case BUSY:    System.out.println(state + ": Try later.");        break;
      case IDLE:    System.out.println(state + ": At your service.");  break;
      case BLOCKED: System.out.println(state + ": Waiting on input."); break;
    //case 2:                // Compile error: Not unqualified enum constant.
      default: assert false: "Unknown machine state: " + state;
    }
  }
}