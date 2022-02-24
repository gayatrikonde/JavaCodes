import java.util.Scanner;
public class PerimeterRect
{
	public static void main(String[] args)
	{
		int length,breadth,perimeter;
		Scanner num=new Scanner(System.in);
		System.out.println("Enter length and breadth:");
		length=num.nextInt();
		breadth=num.nextInt();
		perimeter=2*(length+breadth);
		System.out.println("The perimeter is"+perimeter);

	}
}