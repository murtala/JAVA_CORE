package sen_964.lec2;
import java.util.Iterator;



class Main
{
    public static void main (String args []) {
	 Node[] myList = new Node [10];
	// 9, 2, 4, 8, 5,15, 8, 20, 5, 1
	 myList[0] = new Node (9);
	 myList[1] = new Node (2);
	 myList[2] = new Node (4);
	 myList[3] = new Node (8);
	 myList[4] = new Node (5);
	 myList[5] = new Node (15);
	 myList[6] = new Node (8);
	 myList[7] = new Node (20);
	 myList[8] = new Node (5);
	 myList[9] = new Node (1);
	 
	 System.out.println("ORI" );
	 for (int i = 0; i < myList.length; i++) {
		System.out.print( myList[i].getData()+ "," );
	}
	 
	 
	/* for (int i = 0; i < 5; i++)
	 {
	     myList[i] = new Node (5);
	 }*/
	 // bubble sort
	 bubbleSort(myList);
    }

		public static void bubbleSort(Node[] myList) {
			boolean exch = true;
			for (int j = 0; j < myList.length; j++)
				for (int k = 1; k < (myList.length - j); k++)
					if (myList[k].getData() < myList[k - 1].getData()) {
						int temp = myList[k].getData(); // exchange
					//	int one = myList[k].getData() ;
					//	int two =  myList[k - 1].getData();
						
						myList[k].setData(myList[k - 1].getData());
						//myList[k].data =(myList[k - 1].getData());
						myList[k - 1].setData(temp); 
						//myList[k - 1].data = temp;
						
					}
			 System.out.println("" );
			 System.out.println("SORTED" );
			 for (int i = 0; i < myList.length; i++) {
				System.out.print( myList[i].getData()+ "," );
			}
		}
		
	
}


 
