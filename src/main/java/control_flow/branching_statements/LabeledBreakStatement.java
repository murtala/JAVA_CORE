package control_flow.branching_statements;

public class LabeledBreakStatement {
	public static void main(String[] args) {
	    int i;
        boolean foundIt = false;

        int[] arrayOfInts = 
            { 32, 87, 3, 589,
              12, 1076, 2000,
              8, 622, 127 };
        int searchfor = 12;
        
        for (i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] == searchfor) {
                foundIt = true;
                break;
            }
        }
	}
}
