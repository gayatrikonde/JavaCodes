import java.util.Scanner;
public class PalindromeNumbers
{
    public static void main(String[] args)
    {
        int num1=0,num2=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter statrting range");
        int s=sc.nextInt();

        System.out.println("Enter Ending range");
        int e=sc.nextInt();

        for(int i=s;i<=e;i++)
        {
            num1=i;
            num2=0;
            while(num1!=0)
            {
                int rem=num1%10;
                num1=num1/10;
                num2=num2*10+rem;
            }
            if(i==num2)
            {
                System.out.println(i+" ");
            }

        }

        

        


    }
}
