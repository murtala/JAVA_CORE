package FormattedInput;

import java.util.Scanner;
import java.io.IOException;
import FormattedInput.mypackage.TOKEN_TYPE.*;
// import TOKEN_TYPE;

import static java.lang.System.out;
import static java.lang.System.out;
import static FormattedInput.mypackage.TOKEN_TYPE.*;
// import static TOKEN_TYPE.*;

class UsingScannerWithDelimiters {

  public static void main(String[] args) throws IOException {

{  // Using default delimiters (i.e. whitespace).
   // Note local locale format for floating-point numbers.
   String input = "123 45,56 false 567 722 blabla";
   String delimiters = "default";
  // parse(input, delimiters, INT, DOUBLE, BOOL, INT, LONG, STR);
}

{  // Note the use of backslash to escape characters in regexp.
   String input = "2004 | 2 | true";
   String delimiters = "\\s*\\|\\s*";
  // parse(input, delimiters, INT, INT, BOOL);
}

{  // Another example of a regexp to specify delimiters.
   String input = "Always = true | 2 $ U";
   String delimiters = "\\s*(\\||\\$|=)\\s*";
 //  parse(input, delimiters, STR, BOOL, INT, STR);
}
  }
/** Parses the input using the delimiters and expected sequence of tokens. */
public static void parse(String input, String delimiters, TOKEN_TYPE... sequence) {
  out.println("Input: \"" + input + "\"");
  out.println("Delimiters: (" + delimiters + ")");

  Scanner lexer = new Scanner(input);        // Create a scanner.
  if (!delimiters.equalsIgnoreCase("default"))  // Set delimiters if necessary.
    lexer.useDelimiter(delimiters);

  for (TOKEN_TYPE tType : sequence) {      // Iterate through the tokens.
    if (!lexer.hasNext()) break;           // Handle premature end of input.
    switch(tType) {
      case INT:    out.println(lexer.nextInt()); break;
      case LONG:   out.println(lexer.nextLong()); break;
      case FLOAT:  out.println(lexer.nextFloat()); break;
      case DOUBLE: out.println(lexer.nextDouble()); break;
      case BOOL:   out.println(lexer.nextBoolean()); break;
      case STR:    out.println(lexer.next()); break;
      default:     assert false;
    }
  }
  lexer.close();                           // Close the scanner.
}

}