import java.util.Scanner;
public class AreaofEqui
{
	public static void main(String[] args)
	{
		float r;
		double area;
		System.out.println("Enter the length");
		Scanner triangle=new Scanner(System.in);
		r=triangle.nextFloat();
		area=(1.73*r*r)/4;
		System.out.println("Area is "+area);
	}
}