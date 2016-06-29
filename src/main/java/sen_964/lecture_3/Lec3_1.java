package sen_964.lecture_3;

//import people.*;

//Linked list
//Create a linked list, which is singly linked, intrusive (the Person class needs
//to be changed), heterogeneous (it contains different types of objects). It has a
//method insertAtHead(), that links a Person into the start of the list.
//Use the classes Person, Student, etc. to populate the list.
//The list has a method print() which prints the whole list using the Person's print.

public class Lec3_1 {

	public static void main(String[] x) {
		NiList list = new NiList();
		list.insertAtHead(new Person("John", 19800220, 76));
		list.insertAtHead(new Person("Susan", 19821123, 66.5f));
		//list.insertAtHead(new Student("Mike", 19900125, 61, 573843));
	//	list.insertAtHead(new GradStudent("Kevin", 19870311, 72, 700562,
	//			"Robotics"));
	//	list.insertAtHead(new PhDStudent("Greg", 19850930, 78.5f, 5535698,
	//			"Transport", "Ontology"));
		list.print();
		System.out.println("*************");
		list.removeAtHead();
		list.print();
	}

}

class NiList {
	class ListElement {
		private ListElement next;
		private Person p;

		public ListElement(ListElement next, Person p) {
			this.next = next;
			this.p = p;
		}
	}

	private ListElement head;

	public NiList() {
		head = null;
	}

	public void insertAtHead(Person p) {
		ListElement le = new ListElement(head, p);
		head = le;
	}

	public void removeAtHead() {
		head = head.next;
	}

	public void print() {
		ListElement runner = head;
		while (runner != null) {
	//		runner.p.print();
			runner = runner.next;
		}
	}
}
