package StaticImport;

import StaticImport.Machine;                       // (0)

import StaticImport.Machine.StateContants;            // (1)
import static StaticImport.Machine.StateContants.*;   // (3)

import StaticImport.Machine.StateEnum;             // (4)
import static StaticImport.Machine.StateEnum.*;    // (6)

import StaticImport.Machine.StateEnumII;           // (7)
import static StaticImport.Machine.StateEnumII.*;  // (9)
import static StaticImport.Machine.StateEnumII.WRITE_OFF;  // (10)

public class MachineClient {
  public static void main(String[] args) {

    StateContants msc = new StateContants(); // Requires (1) or (2)
//  String intState = IDLE;                  // Ambiguous because of (3)and (6)
    String intState = StateContants.IDLE;    // Explicit disambiguation required

//  StateEnum se = BLOCKED;               // Ambiguous because of (3)and (6)
    StateEnum se = StateEnum.BLOCKED;     // Requires (4) or (5)
    StateEnum enumState = StateEnum.IDLE; // Explicit disambiguation required

    StateEnumII[] states = {              // Requires (7) or (8)
        AVAILABLE, HIRED, UNDER_REPAIR,   // Requires (9)
        WRITE_OFF,                        // Requires (9) or (10)
        StateEnumII.WRITE_OFF,            // Requires (7) or (8)
        Machine.StateEnumII.WRITE_OFF,    // Requires (0)
        StaticImport.Machine.StateEnumII.WRITE_OFF // Does not require any import
    };
    for (StateEnumII s : states)
        System.out.println(s);
  }
}