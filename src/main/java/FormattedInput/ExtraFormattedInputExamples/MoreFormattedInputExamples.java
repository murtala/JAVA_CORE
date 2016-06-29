package FormattedInput.ExtraFormattedInputExamples;


/*
   Formatted Input
*/
import java.util.Scanner;
import java.util.regex.MatchResult;

import static java.lang.System.out;


class MoreFormattedInputExamples {

  public static void main(String[] args) {

    {
       String input = "1 fish 2 fish red fish blue fish";
       Scanner lexer = new Scanner(input).useDelimiter("\\s*fish\\s*");
       out.println(lexer.nextInt());
       out.println(lexer.nextInt());
       out.println(lexer.next());
       out.println(lexer.next());
       lexer.close();
    }

    {
       String input = "1 fish 2 fish red fish blue fish";
       Scanner lexer = new Scanner(input);
       lexer.findInLine("(\\d+) fish (\\d+) fish (\\w+) fish (\\w+)");
       MatchResult result = lexer.match();
       for (int i=1; i<=result.groupCount(); i++)
           out.println(result.group(i));
       lexer.close();
    }
  }

}