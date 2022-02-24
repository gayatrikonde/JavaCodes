import java.util.Scanner;
public class EvenOdd
{
	public static void main(String[] args)
	{
		int a;
		Scanner num=new Scanner(System.in);
		System.out.println("Enter a number:");
		a=num.nextInt();
		if(a%2==0)
		{
			System.out.println("The num is even");
		}
		else
		{
			System.out.println("The num is odd");
		}

	}
}