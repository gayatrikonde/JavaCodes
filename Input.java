import java.util.Scanner;
public class Input
{
	public static void main(String[] args)
	{
		int a;
		String b;
		Float c;

		Scanner num=new Scanner(System.in);

		System.out.println("Enter a number:");
		a=num.nextInt();
		System.out.println("Input number is:"+a);

		
		System.out.println("Enter a string:");
		b=num.next();
		System.out.println("Input string is:"+b);

		
		System.out.println("Enter a float:");
		c=num.nextFloat();
		System.out.println("Input float is:"+c);


	}
}