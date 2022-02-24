import java.util.Scanner;
public class AllNumOperations
{
	public static void main(String[] args)
	{
		int a,b,sum,subtract,multiply,division;
		Scanner num=new Scanner(System.in);
		System.out.println("Enter Two NUm:");
		a=num.nextInt();
		b=num.nextInt();
		sum=a+b;
		subtract=a-b;
		multiply=a*b;
		division=a/b;
		System.out.println("sum is:"+sum);
		System.out.println("subtraction is:"+subtract);
		System.out.println("multiplication is:"+multiply);
		System.out.println("division is:"+division);
	}
}