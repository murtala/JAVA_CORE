package FormattedInput.ExtraFormattedInputExamples;


/*
   Leser fra Terminalen
*/
import java.io.IOException;

import static java.lang.System.out;

class BrukerTerminalen {

  public static void main(String[] args) throws IOException {

    // Les en liste med heltall.
    int[] intArray = new int[2];
    out.println("Skriv en liste med heltall (maks. " + intArray.length + "):");
    for (int i = 0; i < intArray.length;i++)
      intArray[i] = Terminal.lesInt();
    for (int i : intArray)
       out.println(i);

    // Les navn.
    String fornavn;
    String etternavn;
    String navn;
    String gjenta;
    do {
      Terminal.tømLinjen();
      out.print("Skriv fornavn: ");
      fornavn = Terminal.lesString();
      Terminal.tømLinjen();
      out.print("Skriv etternavn: ");
      etternavn = Terminal.lesString();
      Terminal.tømLinjen();
      navn = etternavn + " " + fornavn;
      out.println("Navnet er " + navn);
      out.print("Gjenta? (j/n): ");
      gjenta = Terminal.lesString();
    } while (gjenta.equals("j"));
  }
}