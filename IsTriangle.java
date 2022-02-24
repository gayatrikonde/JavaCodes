import java.util.Scanner;
public class IsTriangle
{
	public static void main(String[] args)
	{
		int angle1,angle2,angle3;
		System.out.println("Enter a three angle: ");
		Scanner angle=new Scanner(System.in);
		angle1=angle.nextInt();
		angle2=angle.nextInt();
		angle3=angle.nextInt();
		if(angle1+angle2+angle3==180 && angle1>0 && angle2>0 && angle3>0)
		{
			System.out.print("It is triangle");
		}
		else
		{
			System.out.print("It is not triangle");
		}

	}
}