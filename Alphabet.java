import java.util.Scanner;
public class Alphabet
{
	public static void main(String[] args)
	{
		char ch;
		System.out.print("Enter a alpha: ");
		Scanner alpha=new Scanner(System.in);
		ch=alpha.next().charAt(0);
		
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
		{
			System.out.print(ch+" Is Alphabet");
		}
		else
		{
			System.out.println(ch+" Is not alphabet");
		}
	}
}