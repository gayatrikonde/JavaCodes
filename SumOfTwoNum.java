import java.util.Scanner;
public class SumOfTwoNum
{
	public static void main(String[] args)
	{
		int a,b,sum;
		Scanner num=new Scanner(System.in);
		System.out.println("Enter two num:");
		a=num.nextInt();
		b=num.nextInt();
		sum=a+b;
		System.out.println("The sum is:"+sum);
	}
}