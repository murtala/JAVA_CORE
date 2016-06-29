package collections.list;

import java.util.ArrayList;

public class ArrayListDemo1 {
	
	ArrayList<Integer> list = new ArrayList<Integer>(); // I know that i am going to store only integer values
	// the I can specify the type fo the values I am going to store in the list by using "generics"
	// Generics also introduced in jdk 1.5
	//or
	// List list = new ArrayList();
	
	public void populateArratList() {
		for (int i = 0; i < 20; i ++) {
			list.add(i * 10);  // Generics, AutoBoxing, Wrapper Objects
		}
	}
	
	public void displayArrayList() {
		for (int i =0; i < list.size(); i++) {
			int value = list.get(i); // Generics, AutoUnBoxing, Wrapper Objects
			System.out.println(value);
		}
	}
	
	public static void main(String[] args) {
		ArrayListDemo1 ad = new ArrayListDemo1();
		ad.populateArratList();
		ad.displayArrayList();
	}

}
