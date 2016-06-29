package StaticImport;

// Single type import
import StaticImport.States;

// Static import from enum States
import static StaticImport.States.*;

// Static import of static field
import static java.lang.System.out;

class Factory {
  public static void main(String[] args) {
    States[] states = {
         IDLE, BUSY, IDLE, BLOCKED
    };
    for (States s : states)
        out.println(s);
  }
}