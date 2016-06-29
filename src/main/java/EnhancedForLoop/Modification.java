package EnhancedForLoop;

import java.util.*;

public class Modification {
    public static void main(String[] args) {

        int[] intTable = { 10, 13, 45, 99 };
        for (int element : intTable) {
            System.out.println(element);
            element = -1;                 // Note primtive values in the array are not changed.
            System.out.println(element);
        }

        for (int element : intTable) {
            System.out.println(element);
        }

//      printTable(intTable); // Cannot call with arrays of primtive values.
        
        
        StringBuffer[] strBuffers = {
            new StringBuffer("one"),
            new StringBuffer("two"),
            new StringBuffer("three"),
            new StringBuffer("four"),
        };

        for (StringBuffer element : strBuffers) {
            System.out.println(element);
            element.setCharAt(0, 'x');  // Note objects in the array are modified.
            System.out.println(element);
        }

        for (StringBuffer element : strBuffers) {
            System.out.println(element);
        }

        printTable(strBuffers);  // Print an array of StringBuffers.

    }

    /** Generic method which prints the object elemnets of an array */
    static <T> void printTable(T[] array) {
        for (T element : array)
            System.out.println(element);
    }

}