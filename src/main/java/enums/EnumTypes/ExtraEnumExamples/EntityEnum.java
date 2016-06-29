package enums.EnumTypes.ExtraEnumExamples;

import java.util.*;
public enum EntityEnum {

  ENTITY_1, ENTITY_2;

  public static void main(String[] args) {
    System.out.println("OK");
  }

  // Self-typed static field.
     static final EntityEnum se = EntityEnum.ENTITY_1;

  // Static field.
  static final String str = "static field";

  static {
    System.out.println("In static initializer block: "
                       + se.getClass());
    System.out.println("In static initializer block: "
                       + str.length());
  }

  // Initialization code refers to a self-typed
  // static field which has not been
  // initialized.
  EntityEnum() {
/*
    System.out.println("In constructor: "
                        + se.getClass());
    System.out.println("In constructor: "
                        + str.length());
*/

  }

  {
    /*
    System.out.println("In instance initializer block: "
                       + se.getClass());
    System.out.println("In instance initializer block: "
                       + str.length());
    */
  }

  // Class ie = se.getClass();
  Class ie2 = str.getClass();
}