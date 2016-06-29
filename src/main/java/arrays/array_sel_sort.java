package arrays;

public class array_sel_sort 
{

	public static void main(String[] args)
    {
		int cnt=0;
		int t,small,p;
		int x[]={5,2,9,6,3,10,7,20,15};
		
		for(int i=0;i<x.length;i++)
		{
			small=x[i];
			p=i;
			for(int j=i+1;j<x.length;j++)
			{
				if(x[j]<small)
				{
					small=x[j];
					p=j;
				}
				cnt++;
			}
			t=x[i];
			x[i]=small;
			x[p]=t;
		}
		for(int i:x)
			System.out.println(i);

		System.out.println("loop count "+cnt);
	}

}
