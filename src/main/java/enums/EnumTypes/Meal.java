package enums.EnumTypes;
public enum Meal {
  BREAKFAST(7,30), LUNCH(12,15), DINNER(19,45);
  // Time for the meal.
  private int hh;
  private int mm;

  Meal(int hh, int mm) {
    assert (hh >= 0 && hh <= 23): "Illegal hour.";
    assert (mm >= 0 && hh <= 59): "Illegal mins.";
    this.hh = hh;
    this.mm = mm;
  }

  public int getHour() { return this.hh; }
  public int getMins() { return this.mm; }
}