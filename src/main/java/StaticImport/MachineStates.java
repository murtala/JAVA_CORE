package StaticImport;


public interface MachineStates {
  // Fields are public, static and final.
  int BUSY = 1;
  int IDLE = 0;
  int BLOCKED = -1;
}