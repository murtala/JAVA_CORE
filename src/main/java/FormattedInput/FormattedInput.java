package FormattedInput;

/*
   Formatted Input
*/
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
import java.io.File;
import java.io.IOException;

import static java.lang.System.out;

class FormattedInput {

  public static void main(String[] args) throws IOException {

// Using Backslash as Delimiter
{
String input = "C:\\Program Files\\3MM\\MSN2Lite" +
               "\\Help";
String delimiters = "\\\\";
out.println("Input: \"" + input + "\"");
out.println("Delimiters: (" + delimiters + ")");
Scanner lexer = new Scanner(input).useDelimiter(delimiters);
while (lexer.hasNext())
  out.println(lexer.next());
lexer.close();
}

// Using Patterns with a Scanner
{
String input = "C:\\Program Files\\3MM\\MSN2Lite" +
           "\\Help";
String patternStr = "[a-z[A-Z]]+";
out.println("Input: \"" + input + "\"");
out.println("Pattern: (" + patternStr + ")");
Scanner lexer = new Scanner(input);
while (lexer.hasNext(patternStr))             // Logical error
  out.println(lexer.next(patternStr));
lexer.close();
}

// Using Delimiters and Patterns with a Scanner
{
String input = "C:\\Program Files\\3MM\\MSN2Lite" +
               "\\Help";
String delimiters = "\\\\";                   // (1) Delimiter is \.
String patternStr = "[a-z[A-Z]]+";            // (2) Pattern for tokens to match.
out.println("Input: \"" + input + "\"");
out.println("Delimiters: (" + delimiters + ")");
out.println("Pattern: (" + patternStr + ")");
Scanner lexer = new Scanner(input).useDelimiter(delimiters);
while (lexer.hasNext())                       // (3) End of input?
  if (lexer.hasNext(patternStr))              // (4) Token matches pattern?
      out.println(lexer.next(patternStr));    // (4) Parse the token
  else
      lexer.next();                           // (5) Skip unmatched token.
lexer.close();
}

// A Simple Word Frequency Lexer
{
Scanner lexer = new Scanner(new File("FormattedInput.java"));
String wordPattern = "[a-z[A-Z]]+";
Map<String, Integer> freqM = new TreeMap<String, Integer>();
while (lexer.hasNext())
  if (lexer.hasNext(wordPattern)) {
    String word = lexer.next(wordPattern);
    Integer freq = freqM.get(word);
    freqM.put(word, freq == null ? 1 : freq + 1);
  }
  else
    lexer.next();
lexer.close();
out.println("Word count: " + freqM.size());
out.println(freqM);
}

  }

}