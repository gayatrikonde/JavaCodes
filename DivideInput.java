import java.util.Scanner;

public class DivideInput
{	
	public static void main(String[] args)

{
		int divide;
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		divide=a/b;
		System.out.println("The division is"+divide);
}
}
