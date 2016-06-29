package StaticImport;

import static StaticImport.MachineStates.*; // Imports all static members.
class MyFactory2 {
  public static void main(String[] args) {
    int[] states = { IDLE, BUSY, IDLE, BLOCKED };
    for (int s : states)
        System.out.println(s);
  }
}