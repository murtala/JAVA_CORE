package enums.EnumTypes;

public class EnumTypeDeclarations {

  // (2) Static enum declaration is allowed.
  public enum SimpleMeal { BREAKFAST, LUNCH, DINNER };

  public void foo() {
    // (3) Local (inner) enum declaration is not allowed
  //  enum SimpleMeal { BREAKFAST, LUNCH, DINNER }
  }
}