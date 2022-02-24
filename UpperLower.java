import java.util.Scanner;
public class UpperLower
{
	public static void main(String[] args)
	{
		char ch;
		System.out.println("Enter a character: ");
		Scanner alpha=new Scanner(System.in);
		ch=alpha.next().charAt(0);
		if(ch>='A' && ch<='Z')
		{
			System.out.print("It is in uppercase");
		}
		else if(ch>='a' && ch<='z')
		{
			System.out.print("It is in lowercase");
		}
		else
		{
			System.out.print("It is not a character");
		}
	}
}