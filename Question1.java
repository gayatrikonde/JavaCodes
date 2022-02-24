import java.util.Scanner;
public class Question1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		
		n=sc.nextInt();
		
		int a[]=new int[n];
		int i;
		for(i=0;i<=n-1;i++)
		{
			a[i]=sc.nextInt();

		}
		
		
		int b=0,c=0,d=0;
		for(i=0;i<n;i++)
		{
			if(a[i]==0)
				c=c+1;
			else if(a[i]==1)
				b=b+1;
			else if(a[i]==2)
				d=d+1;
		}
		for(i=0;i<b;i++)
			System.out.print("1 ");
		for(i=0;i<c;i++)
			System.out.print("0 ");
		for(i=0;i<d;i++)
			System.out.print("2 ");


		

		
	}
}