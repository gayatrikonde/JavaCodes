import java.util.Scanner;
public class Array
{
	public static void main(String[] args)
	{
		int i;
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(i=0;i<=4;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<=4;i++)
		{
			System.out.println(a[i]);
		}
	}
}