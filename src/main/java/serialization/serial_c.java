package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class serial_c 
{
	public static void main(String [] args) throws Exception
	   {
	      Customer c1 = new Customer();
	      c1.name = "James Ronald";
	      c1.address = "22-60, james street, near journel square, NJ";
	      c1.SSN = 11122333;
	      c1.number = 101;
	     
	      FileOutputStream fs = new FileOutputStream("e:/betasoft5/ss.txt");
	      ObjectOutputStream ofs = new ObjectOutputStream(fs);
	      ofs.writeObject(c1);
	      fs.close();
	      ofs.close();
	         
	   }

}
