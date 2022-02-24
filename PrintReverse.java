import java.util.Scanner;
public class PrintReverse
{
	public static void main(String[] args)
	{
		int n;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a num: ");
		n=sc.nextInt();
		while(n>=1)
		{
			System.out.println(n);
			n--;
		}


		
	}
}