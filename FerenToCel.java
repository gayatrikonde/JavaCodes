import java.util.Scanner;
public class FerenToCel
{
	public static void main(String[] args)
	{
		int ferenheit,celsius;
		System.out.println("Enter temp in ferenheit");
		Scanner temp=new Scanner(System.in);
		Ferenheit=temp.nextInt();
		celsius=(Ferenheit-32)*5/9;
		System.out.println("temp in celsius is:"+celsius);
	}
} 