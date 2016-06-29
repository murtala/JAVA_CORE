package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemoGenerics {

	List<String> list = new ArrayList<String>();

	public void populateList() {
		list.add("abc");
		list.add("xyz");
		list.add("srini");
	}

	public void displayList() {
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}

	}

	public static void main(String[] args) {
		ArrayListDemoGenerics ald = new ArrayListDemoGenerics();
		ald.populateList();
		ald.displayList();
	}

}
