import java.util.Scanner;
public class PowerOfNum {
    public static void main(String[] args)
    {
        int pow=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        System.out.println("Enter the digit");
        int dig=sc.nextInt();

        if(num<0 && dig<0)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            for(int i=1;i<=dig;i++)
            {
                pow=num*pow;
            }
            System.out.println(pow);

        }

    }
    
}
