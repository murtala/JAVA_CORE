package FormattedInput.ExtraFormattedInputExamples;


import java.io.*;
import java.util.*;
/**
 * Denne klassen tilbyr metoder for innlesing av heltall, flyttall og
 * strenger fra terminalen.
 *
 * Pass på at du legger denne filen i samme katalog som programmene dine,
 * og kompilerer den først.
 *
 * @version 2.0
 * @author Rolf W. Rasmussen
 * @author Khalid A. Mughal
 * @author Torill Hamre
 */
public final class Terminal {
    private Terminal() {};
    private static Scanner leser = new Scanner(System.in);

    /**
     * Leser en int verdi fra terminalen.
     */
    public static int lesInt() {
        while (true)
            try { return leser.nextInt(); }
            catch (InputMismatchException ime) { reportError(); }
            catch (NoSuchElementException nsee) { reportError(); }
    }
    /**
     * Leser en double verdi fra terminalen.
     */
    public static double lesDouble() {
        while (true)
            try { return leser.nextDouble(); }
            catch (InputMismatchException ime) { reportError(); }
            catch (NoSuchElementException nsee) { reportError(); }
    }

    /**
     * Leser en streng fra terminalen.
     */
    public static String lesString() {
        while (true)
            try { return leser.next(); }
            catch (IllegalStateException ise) { reportError(); }
            catch (NoSuchElementException nsee) { reportError(); }
    }

    /**
     * Tømmer linjen for inndata, dvs leser alt som er (igjen) i den innværende linjen og
     * returnerer denne som et objekt av typen String.
     */
    public static String tømLinjen() {
        while (true)
            try { return leser.nextLine(); }
            catch (IllegalStateException ise) { reportError(); }
            catch (NoSuchElementException nsee) { reportError(); }
    }

    /**
     * Skriver ut en streng eller strengrepresentasjonen av en annen verdi
     * til terminalen og går videre til neste linje.
     */
    public static void promptln( Object str ) { System.out.println( str ); }

    /**
     * Skriver feilmelding og går videre til neste linje på terminalen
     * slik at brukeren kan taste inn verdi på nytt.
     */
    private static void reportError() {
        leser.nextLine();  // Tøm linjen først.
        System.out.println( "Feil i inndata. Prøv på nytt!" );
    }
}
