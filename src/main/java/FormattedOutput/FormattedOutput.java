package FormattedOutput;


/*
   Formatted output
*/

import static java.lang.System.out;
import static java.lang.Math.*;

class FormattedOutput {

  public static void main(String[] args) {
  {
System.out.printf("Formatted output|%6d|%8.3f|kr. |%.2f|%n",
                                    2004, Math.PI, 1234.0354);
  }

  {
// Argument Index: 1$, 2$, ...
String fmtYMD = "Year-Month-Day: %3$s-%2$s-%1$s%n";
String fmtDMY = "Day-Month-Year: %1$s-%2$s-%3$s%n";
out.printf(fmtYMD, 7, "March", 2004);
out.printf(fmtDMY, 7, "March", 2004);
  }

  {
// General (’b’, ’h’, ’s’)
out.printf("1|%b|%b|%b|%n", null, true, "BlaBla");
out.printf("2|%h|%h|%h|%n", null, 2004, "BlaBla");
out.printf("3|%s|%s|%s|%n", null, 2004, "BlaBla");
out.printf("4|%.1s|%.2s|%.3s|%n",    null, 2004, "BlaBla");
out.printf("5|%6.1s|%4.2s|%2.3s|%n", null, 2004, "BlaBla");
out.printf("6|%2$s|%3$s|%1$s|%n",    null, 2004, "BlaBla");
out.printf("7|%2$4.2s|%3$2.3s|%1$6.1s|%n",   null, 2004, "BlaBla");
// out.printf("8|%2$-4.2s|%3$^2.3s|%1$6.1s|%n", null, 2004, "BlaBla"); <=== !!!
  }

  {
// Character (’c’)
// out.printf("1|%c|%-6c|%c|%-^5c|%n", null, (byte) 58, 'a', new Character('a'));  <=== !!!
  }

  {
// Integral (’d’, ’o’, ’x’)
out.printf("1|%d|%o|%x|%n", (byte) 63, 63, (Long) 63L);
out.printf("2|%d|%o|%x|%n", (byte) -63, -63, (Long) (-63L));
out.printf("3|%+05d|%-+5d|%+d|%n", -63, 63, 63);
out.printf("4|% d|% d|%(d|%n", -63, 63, -63);
out.printf("5|%-, 10d|%, 10d|%,(010d|%n", -654321, 654321, -654321);
  }

  {
// Floating Point (’e’, ’f’, ’g’, ’a’)
out.printf("1|%e|%f|%g|%a|%n", E, E, E, E);
// out.printf("2|% .5e|%-+10.5f|%^+10g|%n", PI, -PI, PI); <===== !!!
out.printf("3|%-, 12.3f|%, 12.2f|%,(012.1f|%n", -E*1000.0, E*1000.0, -E*1000.0);
  }

for(int i = 0; i < 4; ++i) {
  for(int j = 0; j < 3; ++j)
    out.printf("%,10.2f", random()*10000.0);
  out.println();
}
  }
}