import java.util.Scanner;
public class PosNeg
{
	public static void main(String[] args)
	{
		int i;
		System.out.print("Enter a num:");
		Scanner pos=new Scanner(System.in);
		i=pos.nextInt();
		if(i>0)
		{
			System.out.print("The numbeer is positive");
		}
		else if(i<0)
		{
			System.out.print("The number is negative");
		}
		else
		{
			System.out.print("The number is zero");
		}
	}
}