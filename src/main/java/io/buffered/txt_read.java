package io.buffered;

import java.io.BufferedReader;
import java.io.FileReader;


public class txt_read 
{

	public static void main(String[] args) throws Exception
	{
		String str;
		FileReader fr=new FileReader("e:\\betasoft6\\data.txt");
		BufferedReader br=new BufferedReader(fr);
		//read each line in the file upto readline is not equal to null
		while((str=br.readLine())!=null)
			System.out.println(str);

		br.close();
		
	}

}
