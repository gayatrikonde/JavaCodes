import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args)
    {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the car no.:");
        int car=sc.nextInt();
        if(car<=999 || car>9999)
        {
            System.out.println(car+" is not valid number");
        }
        else 
        {
            while(car>0)
            {
                int rem=car%10;
                sum=sum+rem;
                car=car/10;
            }
            if(sum%3==0 || sum%5==0 || sum%7==0)
            {
                System.out.println("Lucky Number");
            }
            else 
            {
                System.out.println("Sorry its not my lucky number");
            }
        }

    }
    
}
