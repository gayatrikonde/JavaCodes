import java.util.Scanner;
public class Marksheet
{
	public static void main(String[] args)
	{
		int a,b,c,d,e,total,average,percentage;
		System.out.println("Enter the marks of all sbject");
		Scanner result=new Scanner(System.in);
		a=result.nextInt();
		b=result.nextInt();
		c=result.nextInt();
		d=result.nextInt();
		e=result.nextInt();
		total=a+b+c+d+e;
		average=total/5;
		percentage=(total/500)*100;

		System.out.println("The total is"+total);
		System.out.println("The average is"+average);
		System.out.println("The percentage is"+percentage);

	}
}