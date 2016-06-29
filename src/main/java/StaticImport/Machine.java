package StaticImport;


public class Machine {

  public static class StateContants {
    public static final String BUSY = "Busy";
    public static final String IDLE = "Idle";
    public static final String BLOCKED = "Blocked";
  }

  public enum StateEnum {
    BUSY, IDLE, BLOCKED
  }

  public enum StateEnumII {
    UNDER_REPAIR, WRITE_OFF, HIRED, AVAILABLE;
  }
}