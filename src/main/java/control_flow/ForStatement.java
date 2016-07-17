package control_flow;

public class ForStatement {

	public static void main(String[] args) {
		  for(int i=1; i<11; i++){
              System.out.println("Count is: " + i);
         }
		  
		  //Enhanced For Loop (for each)
		  int[] numbers = {1,2,3,4,5,6,7,8,10};
		  for (int i : numbers) { //for each number, the number i has a val
			System.out.println("number: "+i);
		}
	}
}
