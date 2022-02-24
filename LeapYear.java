import java.util.Scanner;
public class LeapYear
{
	public static void main(String[] args)
	{
		int year;
		System.out.print("Enter a year");
		Scanner leap=new Scanner(System.in);
		year=leap.nextInt();
		if(((year%4==0) && (year%100!=0)) || (year%400==0))
		{
			System.out.print("The year is a leap year");
		}
		else
		{
			System.out.print("The year is not a leap year");
		}
	}
}