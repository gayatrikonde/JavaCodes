import java.util.Scanner;
public class Angle
{
	public static void main(String[] args)
	{
		int Angle1,Angle2,Angle3;
		System.out.println("Enter two angles");
		Scanner angles=new Scanner(System.in);
		Angle1=angles.nextInt();
		Angle2=angles.nextInt();
		Angle3=180-(Angle1+Angle2);
		System.out.println("The third angle is"+Angle3);
	}
}