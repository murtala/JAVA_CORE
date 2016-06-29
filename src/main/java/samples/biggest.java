package samples;

import java.util.Scanner;


public class biggest 
{

	public static void main(String[] args) 
	{
		/// to display biggest of given 3 numbers
		int x,y,z;
		Scanner sn=new Scanner(System.in); //to take input from keyboard
		x=Integer.parseInt(sn.nextLine());  // read input from keyboard during runtime
		y=Integer.parseInt(sn.nextLine());
		z=Integer.parseInt(sn.nextLine());
		if(x==y && y==z)
			System.out.println("all 3 num are same");
		else if(x>y && x>z)
			System.out.println(x+" is biggest");
		else if(y>x && y>z)
			System.out.println(y+" is biggest");
		else
			System.out.println(z+" is biggest");
		
		//example to understand convertion of String to int.
		String s1="10",s2="5";
		System.out.println(s1+s2);   //105
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2)); // 15
		
		

	}

}
