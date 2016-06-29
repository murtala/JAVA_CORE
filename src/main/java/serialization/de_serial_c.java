package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class de_serial_c 
{
	public static void main(String [] args) throws Exception
	   {
	      Customer c1 = null;
	      FileInputStream fs = new FileInputStream("e:/betasoft5/ss.txt");
	      ObjectInputStream ofs = new ObjectInputStream(fs);
	      c1 = (Customer) ofs.readObject();
	      fs.close();
	      ofs.close();
	      
	      System.out.println("Deserialized Employee...");
	      System.out.println("Name: " + c1.name);
	      System.out.println("Address: " + c1.address);
	      System.out.println("SSN: " + c1.SSN);
	      System.out.println("Number: " + c1.number);
	    }
}
