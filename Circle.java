import java.util.Scanner;
public class Circle
{
	public static void main(String[] args)
	{
		int r,diameter;
		double pi=3.14,area,circumference;
		System.out.println("Enter radius:");
		Scanner num=new Scanner(System.in);
		r=num.nextInt();
		diameter=r*2;
		area=pi*r*r;
		circumference=2*pi*r;
		System.out.println("The diameter is"+diameter);
		System.out.println("The area is"+area);
		System.out.println("The circumference is"+circumference);

	}
}