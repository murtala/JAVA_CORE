package exercises.exercise6_8;

//Filename: MyClass.java
public class MyClass extends MySuperclass {
 public static void main(String[] args) {
     MyClass object = new MyClass();
     object.print();
 }
 public void print() {
     // INSERT CODE HERE THAT WILL PRINT
     // THE "Hello, world!" STRING FROM THE Message
     // CLASS

		 
	 System.out.println(msg.text);// why?

	 Message mess = new Message();
	 System.out.println(mess.text);
	 
	 
	 
	 
 }
}

class MySuperclass {
 Message msg = new Message();
}

class Message {
 // The message that should be printed:
 String text = "Hello, world!";
}