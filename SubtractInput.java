import java.util.Scanner;
public class SubtractInput
{
	public static void main(String[] args)
{
		int subtract;
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		subtract=a-b;
		System.out.println("The Subtraction is"+subtract);
}
}