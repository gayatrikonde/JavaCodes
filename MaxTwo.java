import java.util.Scanner;
public class MaxTwo
{
	public static void main(String[] args)
	{
		int i,j;
		System.out.println("Enter two num:");
		Scanner max=new Scanner(System.in);
		i=max.nextInt();
		j=max.nextInt();

	
	if(i>j)
	{
		System.out.print("Max is "+i);
	}
	else
	{
		System.out.print("Max is "+j);
	}
	}
}