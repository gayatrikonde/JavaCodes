import java.util.Scanner;
public class MaxThree
{
	public static void main(String[] args)
	{
		int i,j,k;
		System.out.println("Enter three num:");
		Scanner max=new Scanner(System.in);
		i=max.nextInt();
		j=max.nextInt();
		k=max.nextInt();
		if((i>j)&&(i>k))
		{
			System.out.print("Max is "+i);
		}	
		else if((j>k)&&(j>i))
		{
			System.out.print("Max is "+j);
		} 
		else if((k>j)&&(k>i))
		{
			System.out.print("Max is "+k);
		}
		
	}
}