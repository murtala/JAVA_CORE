package arrays;
public class array_even_odd 
{

	public static void main(String[] args) 
	{
		//in the array of values move all even numbers to beginning and odd numbers to last
		int x[]={5,9,8,4,3,2,10,20,15,18,24,36,55,64,9,7,34};
		int t;
		for(int i=0,j=x.length-1; i<=j ; )
		{
			if(x[i]%2!=0 && x[j]%2==0)
			{
				t=x[i];
				x[i]=x[j];
				x[j]=t;
				i++;
				j--;
			}
			else
			{
				if(x[i]%2==0)
					i++;
				if(x[j]%2!=0)
					j--;
			}
		}
		for(int i : x)
			System.out.println(i);
		

	}

}
