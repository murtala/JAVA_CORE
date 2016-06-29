package inheritanceChild;

import inheritanceParent.Phone;

public class Iphone extends Phone { // declared iphone as child of phone
	

	public static String OSversion = "12.2";

	public static void main(String[] args) {
		
		Iphone i = new Iphone();
		int x = i.number;
		i.dial(12); //inherited from phone
		i.receive();//inherited from phone
		System.out.println("number :" + x);//inherited from phone
		System.out.println("OS :" + OSversion); //local, not inherited
		System.out.println("Model :" + i.model);  // inherited from phone
		i.openBrowser();
	}
	
	public void openBrowser(){
		
		System.out.println("Acessing variable fromo parent " + super.number); // local, not inherited
		System.out.println("Opening browser "); // local, not inherited
	}
}
