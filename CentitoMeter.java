import java.util.Scanner;
public class CentitoMeter
{
	public static void main(String[] args)
	{
		int centimeter,meter,kilometer;
		System.out.println("Enter length in centimeter");
		Scanner num=new Scanner(System.in);
		centimeter=num.nextInt();
		meter=centimeter/100;
		kilometer=centimeter/1000;
		System.out.println("The length in meter is"+meter);
		System.out.println("The length in meter is"+kilometer);
	}
}