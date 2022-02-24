import java.util.Scanner;
public class AddInput1
{
	public static void main(String[] args)
{		int sum;
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		sc.close();
		sum=a+b;
		System.out.println("sum of two numbers is"+sum);
}
}
