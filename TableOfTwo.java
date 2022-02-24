import java.util.Scanner;
public class TableOfTwo
{
	public static void main(String[] args)
	{
		int a,i;
		Scanner num=new Scanner(System.in);
		a=num.nextInt();
		
        for(i=1;i<11;i++)
        {
        	
        	System.out.println("The table is"+a*i);
        }
        
	}
}