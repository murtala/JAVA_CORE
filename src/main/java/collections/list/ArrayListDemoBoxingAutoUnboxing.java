package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemoBoxingAutoUnboxing {
	
	List <Integer> nosList = new ArrayList<Integer>();
	
	public void populateList() {
		for (int i = 0; i < 10; i++) {
			
			nosList.add(i * 10);
		}
	}
	
	public void displayList() {
		for (int i = 0; i < nosList.size(); i++) {
			System.out.println(nosList.get(i));
		}
	}
	
	public static void main(String[] args) {
		ArrayListDemoBoxingAutoUnboxing al = new ArrayListDemoBoxingAutoUnboxing();
		al.populateList();
		al.displayList();
	}

}
