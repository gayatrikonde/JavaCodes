import java.util.Scanner;
public class WeekDays
{
	public static void main(String[] args)
	{
		int week;
		System.out.print("Enter a num between 1-7: ");
		Scanner day=new Scanner(System.in);
		week=day.nextInt();
		if(week==1)
		{
			System.out.print("Monday");
		}
		
		else if(week==2)
		{
			System.out.print("Tuesday");
		}
		else if(week==3)
		{
			System.out.print("Wednesday");
		}
		else if(week==4)
		{
			System.out.print("Thursday");
		}
		else if(week==5)
		{
			System.out.print("Friday");
		}
		else if(week==6)
		{
			System.out.print("Saturday");
		}
		else if(week==7)
		{
			System.out.print("Sunday");
		}
		else
		{
			System.out.print("NOt a Day");
		}
	}
}