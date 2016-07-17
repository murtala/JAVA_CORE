package io.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {
	  public static void main(String[] args) throws IOException {

		/*  Most of the examples we've seen so far use unbuffered I/O. This means each read or write request is handled directly by the underlying OS. This can make a program much less efficient, since each such request often triggers disk access, network activity, or some other operation that is relatively expensive.

		  To reduce this kind of overhead, the Java platform implements buffered I/O streams. Buffered input streams read data from a memory area known as a buffer; the native input API is called only when the buffer is empty. Similarly, buffered output streams write data to a buffer, and the native output API is called only when the buffer is full.	  
	*/	  
	        BufferedReader inputStream = null;
	        BufferedWriter outputStream = null;

	        try {
	            inputStream =new BufferedReader( new FileReader("../java/src/main/java/io/character_stream/xanadu.txt"));
	            outputStream = new BufferedWriter(new FileWriter("../java/src/main/java/io/character_stream/characteroutput.txt"));
	           
	            int c;
	            while ((c = inputStream.read()) != -1) {
	                outputStream.write(c);
	            }
	        } finally {
	            if (inputStream != null) {
	                inputStream.close();
	            }
	            if (outputStream != null) {
	            	outputStream.flush(); //flush it
	                outputStream.close();
	            }
	        }
	    }
}
