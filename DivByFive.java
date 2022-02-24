import java.util.Scanner;
public class DivByFive
{
	public static void main(String[] args)
	{
		int i;
		System.out.print("Enter a num:");
		Scanner divide=new Scanner(System.in);
		i=divide.nextInt();
		if((i%5==0)&&(i%11==0))
		{
			System.out.print("The number is divisible by 5 and 11");
		}
		else
		{
			System.out.print("The number is not divisible by 5 and 11");
		}
	}
}