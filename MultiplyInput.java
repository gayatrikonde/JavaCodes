import java.util.Scanner;
public class MultiplyInput
{
	public static void main(String[] args)
{
		int multiply;
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		multiply=a*b;
		System.out.println("The multiplication is"+multiply);
}
}