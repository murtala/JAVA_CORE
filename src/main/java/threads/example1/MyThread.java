package threads.example1;

import java.util.ArrayList;
import java.util.Collections;


public class MyThread {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		Collections.synchronizedList(list);
		
	}

}
