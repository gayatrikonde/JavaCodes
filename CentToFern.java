import java.util.Scanner;
public class CentToFern
{
	public static void main(String[] args)
	{
		int celsius,fehrenheit;
		System.out.println("Enter temp in celsius:");
		Scanner temp=new Scanner(System.in);
		celsius=temp.nextInt();
		fehrenheit=(celsius*9/5)+32;
		System.out.println("Temp in Fehrenheit is"+fehrenheit);
	}
}