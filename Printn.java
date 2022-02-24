import java.util.Scanner;
public class Printn
{
	public static void main(String[] args)
	{
		
		int i=1;
		int number;
		

		
		Scanner num=new Scanner(System.in);
		System.out.println("Enter a no: ");
		number=num.nextInt();
		while(i<=number)
		{
			System.out.println(i);
			i++;
		}

	}
}