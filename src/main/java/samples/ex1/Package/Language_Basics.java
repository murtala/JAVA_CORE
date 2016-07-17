package samples.ex1.Package;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Murtala
 */
public class Language_Basics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        primitiveDatatypes();
        arrays();
        multiDimensionArray();
        operators();
        controlFlowStatements();

    }

    public static void arrays() {
        //arrays hold a fixed number of values of single type
        //declare array of integers
        int[] array;
        //allocate memory for 10 integers
        array = new int[10];
        //initialize first element
        array[0] = 22;
        //initialize whole
        int[] array1 = {12, 23, 32, 54, 65, 89, 98, 54, 22};
        System.out.println("Arrays");
        System.out.println("Print content array at 0 :" + array[0]);
    }

    public static void primitiveDatatypes() {
        //primitives data types
        int gear = 1;
        //literals
        boolean result = true;
        byte b = 100;
        int i = 0;
        //integer literals (have some literals in interger)
        int decVal = 26;
        int hexVal = 0x1a;
        //int binVal = 0b11010;
        //floating-point literals
        double d1 = 123.4;
        double d2 = 1.234e2;
        //character string literals  \t  \n
        //underscores in numeric literals
       // long Ccard = 1234_5678_9012L;
        System.out.println("Primitive data types");

    }

    public static void multiDimensionArray() {
        //2d array  array[row][column]
        String[][] names = {{"A", "B", "C"}, // row 0 --columns
                {"1", "2", "3"}}; //row 1---columns
        //print B3
        System.out.println(names[0][1] + names[1][2]);
    }

    public static void controlFlowStatements(){
        //if-then-else
        //<editor-fold defaultstate="collapsed" desc="if then else">
        if (true){
            //expression
        }
        else{
            //expression
        }
        //</editor-fold> 
        //switch
        //<editor-fold defaultstate="collapsed" desc="Switch">
        int month =7;
        String months;
        String monthString;
        int monthnumber =0;
        switch (month){
            case 1: monthString = "Jan";
                break;
            case 2: case 3: case 4: monthString ="Other months";//associate multiples cases
                break;
            //case "monthString": monthnumber =1;  if month is string
            // break;
            default: monthString = "no month"; //default required
                break;
        }
        //</editor-fold>

        //do-while
        int count =8;
        do{
            count --;
        }while (count >10);

        //for statement
            for (int i=1; i<11; i++){
                //code here
            }

        //**break statements** to terminate for-while-d-while loops
                   //if found , break - then go to the next statement after the loop
                   //**continue**   skips the rest of the loop to the next character

    }


    public static void operators() {
        int i = 3;
        i++; // prints 4
        ++i; //prints 5
        //  ++ operator increments the incremented value
        //  operator ++ increments the original value
    }
}
