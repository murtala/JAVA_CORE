package control_flow;

public class UnlabeledBreakStatement {
	public static void main(String[] args) {
		 int[][] arrayOfInts = { 
		            { 32, 87, 3, 589 },
		            { 12, 1076, 2000, 8 },
		            { 622, 127, 77, 955 }
		        };
		        int searchfor = 12;

		        int i;
		        int j = 0;
		        boolean foundIt = false;

		    search: //this will be broken
		        for (i = 0; i < arrayOfInts.length; i++) {
		            for (j = 0; j < arrayOfInts[i].length;
		                 j++) {
		                if (arrayOfInts[i][j] == searchfor) {
		                    foundIt = true;
		                    break search;
		                }
		            }
		        }

	}
}