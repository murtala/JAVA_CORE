package FormattedInput.ExtraFormattedInputExamples;


/*

   A Simple Lexer for words.
*/
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
import java.io.File;
import java.io.IOException;

import static java.lang.System.out;

class WordLexer {
  public static void main(String[] args) throws IOException {
    //  String delimiters = "(\\s|\\.|=|\\(|\\)|;|\\{|\\}|\\[|\\]|/|\\*|," +
    //        "|\\<|\\>|\\\"|\\+|\\-|\\+|:|\\?|\\\\|!|\\$|\\|)+"; // Partial list
    String delimiters = "(\\s|\\p{Punct})+";
    Scanner lexer = new Scanner(new File("WordLexer.java"));
    lexer.useDelimiter(delimiters);
    String wordPattern = "[a-z[A-Z]]+";
    Map<String, Integer> freqM = new TreeMap<String, Integer>();
    while (lexer.hasNext())
      if (lexer.hasNext(wordPattern)) {
        String word = lexer.next(wordPattern);
        Integer freq = freqM.get(word);
        freqM.put(word, freq == null ? 1 : freq + 1);
      }
      else {
        // out.println("Not a word: " + lexer.next());
        lexer.next();
      }
    lexer.close();
    out.println("Distinct Word count: " + freqM.size());
    out.println(freqM);
  }
}