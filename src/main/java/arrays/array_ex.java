package arrays;
public class array_ex 
{

	public static void main(String[] args) 
	{
		int x[ ]={10,5,67,34,56,76,54};
		for(int i=0;i<7;i++)
			System.out.println(x[i]);
		
		for(int i=0;i<x.length;i++)
			System.out.println(x[i]);
		
		for(int i : x) // i will take each value in x
			System.out.println(i);

	}

}
