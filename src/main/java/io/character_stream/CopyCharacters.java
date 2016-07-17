package io.character_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {
	  public static void main(String[] args) throws IOException {

	        FileReader inputStream = null;
	        FileWriter outputStream = null;

	        try {
	            inputStream = new FileReader("../java/src/main/java/io/character_stream/xanadu.txt");
	            outputStream = new FileWriter("../java/src/main/java/io/character_stream/characteroutput.txt");
	           
	            int c;
	            while ((c = inputStream.read()) != -1) {
	                outputStream.write(c);
	            }
	        } finally {
	            if (inputStream != null) {
	                inputStream.close();
	            }
	            if (outputStream != null) {
	                outputStream.close();
	            }
	        }
	    }
}
