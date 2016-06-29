package FormattedInput;

import java.util.Scanner;
import java.io.IOException;
import static java.lang.System.out;


class UsingScanner {

  public static void main(String[] args) throws IOException {

{
  String input = "The world will end today.";
  Scanner lexer = new Scanner(input);
  while (lexer.hasNext())
    out.println(lexer.next());
  lexer.close();
}

{
  String input = "123 45,56 false 567 722 blabla";
    Scanner lexer = new Scanner(input);
    out.println(lexer.hasNextInt());
    out.println(lexer.nextInt());
    out.println(lexer.hasNextDouble());
    out.println(lexer.nextDouble());
    out.println(lexer.hasNextBoolean());
    out.println(lexer.nextBoolean());
    out.println(lexer.hasNextInt());
    out.println(lexer.nextInt());
    out.println(lexer.hasNextLong());
    out.println(lexer.nextLong());
    out.println(lexer.hasNext());
    out.println(lexer.next());
    out.println(lexer.hasNext());
    lexer.close();
}
  }
}