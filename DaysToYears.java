import java.util.Scanner;
public class DaysToYears
{
	public static void main(String[] args) 
	{
		int days,years,weeks;
		System.out.println("Enter no days");
	    Scanner din=new Scanner(System.in);
	    days=din.nextInt();
	    years=days/365;
	    weeks = (days - (years * 365)) / 7;
	    System.out.println("Enter no years"+years);
	    System.out.println("Enter no days"+weeks);

		
                
	}
}