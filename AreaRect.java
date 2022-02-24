import java.util.Scanner;
public class AreaRect
{
	public static void main(String[] args)
	{
		int length,breadth,area;
		System.out.println("Enter two num:");
		Scanner num=new Scanner(System.in);
		length=num.nextInt();
		breadth=num.nextInt();
		area=length*breadth;
		System.out.println("Area is:"+area);


	}
}