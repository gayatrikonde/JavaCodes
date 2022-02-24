import java.util.Scanner;
public class AreaofTri
{
	public static void main(String[] args)
	{
		int base,height,area;
		System.out.println("Enter height nad base of triangle:");
		Scanner triangle=new Scanner(System.in);
		base=triangle.nextInt();
		height=triangle.nextInt();
		area=(base*height)/2;
		System.out.println("The area is"+area);
	}
}