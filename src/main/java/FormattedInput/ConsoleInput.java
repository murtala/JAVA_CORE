package FormattedInput;


/* Reading from the console. */
import java.util.Scanner;

import static java.lang.System.out;

public class ConsoleInput {

  public static void main(String[] args) {

    // Create a Scanner which is chained to System.in, i.e. to the console.
    Scanner lexer = new Scanner(System.in);

    // Read a list of integers.
    int[] intArray = new int[3];
    out.println("Input a list of integers (max. " + intArray.length + "):");
    for (int i = 0; i < intArray.length;i++)
      intArray[i] = lexer.nextInt();
    for (int i : intArray)
       out.println(i);


    // Read names
    String firstName;
    String lastName;
    String name;
    String repeat;
    do {
      lexer.nextLine(); // Empty any input still in the current line
      System.out.print("Enter first name: ");
      firstName = lexer.next();
      lexer.nextLine();
      System.out.print("Enter last name: ");
      lastName = lexer.next();
      lexer.nextLine();
      name = lastName + " " + firstName;
      System.out.println("The name is " + name);
      System.out.print("Continue? (y/n): ");
      repeat = lexer.next();
    } while (repeat.equals("y"));
    lexer.close();
  }
}