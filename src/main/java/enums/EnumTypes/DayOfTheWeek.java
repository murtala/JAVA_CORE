package enums.EnumTypes;

public enum DayOfTheWeek {

  MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

  // (1) Static field referenced from initialization code.
  static int staticWeekNumber = 10;

  static { // (2) Static initializer block
    System.out.println("In static initializer block, staticWeekNumber = "
                       + staticWeekNumber);
  }
  // (3) Instance field
  // int cacheWeekNumber = staticWeekNumber;
  
  // (4) Constructor
  DayOfTheWeek() {
  //System.out.println("Static: " + staticWeekNumber); // (5) Compile Error
    System.out.println("In constructor, " + this);
  }
  
  { // (6) Instance initializer block
    //System.out.println("In instance initializer block, staticWeekNumber = "
    //                   + staticWeekNumber);          // (7) Compile Error    
    System.out.println("In instance initializer block, " + this);
  }
  
  public static void main(String[] args) {}
}