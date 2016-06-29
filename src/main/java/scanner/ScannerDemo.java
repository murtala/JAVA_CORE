package scanner;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerDemo {

	public static void main(String[] args) {

		String s = "Hello World! 3+3.0=6";
		Scanner scanner = new Scanner(s);

		// find a pattern of any letter plus "ello"
	      System.out.println("1 " + scanner.findInLine(Pattern.compile(".ello")));
	      
	   // find a string "World"
	      System.out.println("2 " + scanner.findInLine("World"));
	      
		// print the next line of the string
		System.out.println("3 " + scanner.nextLine());

		// print the delimiter this scanner is using
		System.out.println("4 " + scanner.delimiter());

		
		// find a pattern of 2 letters before rld, with horizon of 10
	      System.out.println("5 "
	              + scanner.findWithinHorizon(Pattern.compile("..rld"), 10));

	      // find a pattern of 2 letters before rld, with horizon of 20
	      System.out.println("6 "
	              + scanner.findWithinHorizon(Pattern.compile("..rld"), 20));
	      
	      
	      // find a string of world, with horizon of 10
	      System.out.println("7 "
	              + scanner.findWithinHorizon("World", 10));

	      // find a string of world, with horizon of 20
	      System.out.println("8 "
	              + scanner.findWithinHorizon("World", 20));
	      
	      
	      // check if the scanner has a token
	      System.out.println("9 " + scanner.hasNext());
	      
	      
	   // check if the scanner's next token is a BigDecimal
	         System.out.println("10 " + scanner.hasNextBigDecimal());
	         
	      // check if there is an IO exception
	         System.out.println("11 " + scanner.ioException());
	         
	         // if the next is a int, print found and the int
	         if (scanner.hasNextInt()) {
	            System.out.println("Found :" + scanner.nextInt());
	         }
	         
	      // change the delimiter of this scanner
	         scanner.useDelimiter(Pattern.compile(".ll."));

	         // display the new delimiter
	         System.out.println("12 " + scanner.delimiter());

	      // change the locale of the scanner
	         scanner.useLocale(Locale.ENGLISH);

	         // display the new locale
	         System.out.println("13 " + scanner.locale());
	         
	         
		// close the scanner
		System.out.println("Closing Scanner...");
		scanner.close();
		System.out.println("Scanner Closed.");

	}
}
