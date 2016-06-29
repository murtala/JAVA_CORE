package arrays;

public class array_bb_sort 
{

	public static void main(String[] args) 
	{
		int cnt=0;
		int t;
		int x[]={5,2,9,6,3,10,7,20,15};
				
		for(int i=0;i<8;i++)
		{
			if(x[i]>x[i+1])
			{
				t=x[i];
				x[i]=x[i+1];
				x[i+1]=t;
				i=-1;				
			}
			cnt++;
		}
		for(int y : x)
			System.out.println(y);
           
		System.out.println("loop count "+cnt);

	}

}
