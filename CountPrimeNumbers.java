import java.util.Scanner;
public class CountPrimeNumbers {
    public static void main(String[] args)
    {
        int count=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter starting range");
        int num1=sc.nextInt();

        System.out.println("Enter Ending range");
        int num2=sc.nextInt();

        for(int i=num1;i<=num2;i++)
        if(num1%num2==0)
        count=count+1;
        System.out.println(count);
    }
    
}
