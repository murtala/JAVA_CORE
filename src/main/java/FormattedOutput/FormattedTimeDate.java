package FormattedOutput;


/*
   Formatted Time and Date
*/
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import static java.lang.System.out;
import static java.util.Calendar.*;
import static java.util.Locale.*;

class FormattedTimeDate {

  public static void main(String[] args) {

Calendar myCalender = Calendar.getInstance();

{
// Formatting the hour
out.printf("Hour(00-24):%tH\n", myCalender);
out.printf("Hour(01-12):%tI\n", myCalender);
out.printf("Hour(0-23):%tk\n", myCalender);
out.printf("Hour(1-12):%tl\n", myCalender);
}

{
// Formatting the minutes
out.printf("Minutes(00-59):%tM\n", myCalender);
}

{
// Formatting the seconds
out.printf("Seconds(00-60):%tS\n", myCalender);
// out.printf("Millieseconds(000-999):%tL\n", myCalender);
out.printf("Nanoseconds(000000000-999999999):%tN\n", myCalender);
}

{
// PM/pm and AM/am
out.printf("%tp\n", myCalender);
out.printf("%Tp\n", myCalender);
}

{
// Formatting the year
out.printf("%tC%n", myCalender);
out.printf("%tY%n", myCalender);
out.printf("%ty%n", myCalender);
}

{
// Formatting the month
out.printf("%tB%n", myCalender);
out.printf("%tb%n", myCalender);
out.printf("%th%n", myCalender);
out.printf("%tm%n", myCalender);
out.printf(US,"%tB%n", myCalender);

}

{
// Formatting the day
out.printf("%tA%n", myCalender);
out.printf("%ta%n", myCalender);
out.printf("%tj%n", myCalender);
out.printf("%td%n", myCalender);
out.printf("%te%n", myCalender);
out.printf(US,"%tA%n", myCalender);
}

{
// Composite Date/Time Format Conversions
out.printf("%tR%n", myCalender);
out.printf("%tT%n", myCalender);
out.printf("%tr%n", myCalender);
out.printf("%tD%n", myCalender);
out.printf("%tF%n", myCalender);
out.printf("%tc%n", myCalender);
}

{
// Misc. usage
// Note that the specifiers refer to the same argument in the format string.
out.printf("%1$tm %1$te %1$tY%n", myCalender);
out.printf(US, "The world will end on %1$tA, %1$te. %1$tB %1$tY" +
               " at %1$tH:%1$tM:%1$tS.%n", myCalender);
out.printf("The world will end on %1$tA, %1$te. %1$tB %1$tY at %1$tH:%1$tM:%1$tS.%n",
           myCalender);
//out.printf("%1$^-15tA, %1$6te. %1$^10tB %1$tY, %1$tH:%1$tM:%1$tS.%n", <==== !!!!!!!!!
//           myCalender);

Calendar birthdate = new GregorianCalendar(1949, MARCH, 1);
out.printf("Author's Birthday: %1$tD%n", birthdate);
}

  }
}