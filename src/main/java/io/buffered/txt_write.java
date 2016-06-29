package buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;


public class txt_write 
{

	public static void main(String[] args) throws Exception
	{
		//file for writing
		FileWriter fw=new FileWriter("e:\\betasoft6\\data.txt");
		//buffer for writing referring to the file
		BufferedWriter bw=new BufferedWriter(fw);
		
		//write data into buffer
		bw.write("This is sample");
		bw.newLine();
		bw.write("selenium automation testing");
		bw.newLine();
		bw.write("java programming");
		//close the buffer
		bw.close();
		
		
		

	}

}
