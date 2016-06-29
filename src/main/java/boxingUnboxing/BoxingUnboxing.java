package boxingUnboxing;

import java.util.*;

import static java.lang.System.out;

public class BoxingUnboxing {

  public static void main(String... args) {

    {
      // Assignment Conversions on boolean and numeric types
      boolean boolVal = true;
      byte  b = 2;
      short s = 2;
      char  c ='2';
      int   i = 2;

      // Boxing
      Boolean   boolRef = boolVal;
      Byte      bRef = (byte) 2;  // cast required as int not assignable to Byte
      Short     sRef = (short) 2; // cast required as int not assignable to Short
      Character cRef = '2';
      Integer   iRef = 2;
      // Integer   iRef1 = s;   // short not assignable to Integer

      // Unboxing
      boolean boolVal1 = boolRef;
      byte  b1 = bRef;
      short s1 = sRef;
      char  c1 = cRef;
      int   i1 = iRef;
    }
    
    {
      // Method Invocation Conversions
      flipFlop("(String, Integer, int)", new Integer(4), 2004);
    }
    
    {
      // Casting Conversions
      Integer iRef = (Integer) 2;  // Boxing followed by identity cast
      int     i    = (int) iRef;   // Unboxing followed by identity cast
      // Long    lRef = (Long) 2;  // int not convertible to Long
    }

    {
      // Numeric Promotion: Unary and Binary
      Integer iRef = (Integer) 2;
      long    l1   = 2000L + iRef; // Binary Numeric Promotion
      int     i    = -iRef;        // Unary Numeric Promotion
    }

    {
      // The if statement
      Boolean expr = true;
      if (expr)
        out.println(expr);
      else
        out.println(!expr);  // Logical complement operator
    }

    {
      // The switch statement
      // The switch expression can be Character, Byte, Short or Integer.

      // Constants
      final short ONE     = 1;
      final short ZERO    = 0;
      final short NEG_ONE = -1;

      // int expr = 1;         // (1) short is assignable to int. switch works.
      // Integer expr = 1;     // (2) short is not assignable to Integer. switch compile error.
      Short expr = (short)1;   // (3) Cast required even though value is in range.
      switch (expr) {          // (4) expr unboxed before case comparison.
        case ONE:     out.println(">="); break;
        case ZERO:    out.println("=="); break;
        case NEG_ONE: out.println("<="); break;
        default: assert false;
      }
    }

    {
      // The while, do-while and for statements
      // The condition can be Boolean.
      Boolean expr = true;
      while (expr)
        expr = !expr;

      Character[] version = {'1', '.', '5'};        // Assignment: boxing
      for (Integer iRef = 0;                        // Assignment: boxing
           iRef < version.length;                   // Comparison: unboxing
           ++iRef)                                  // ++: unboxing and boxing
        out.println(iRef + ": " + version[iRef]);   // Array index: unboxing
    }

    {
      // Boxing and unboxing in collections/maps
      Map<String, Integer> m = new TreeMap<String, Integer>();
      for (String word : args) {
          Integer freq = m.get(word);
          m.put(word, freq == null ? 1 : freq + 1);
      }
      out.println(m);
    }
  }

  private static void flipFlop(String str, int i, Integer iRef) {
    out.println(str + " ==> (String, int, Integer)");
  }
}