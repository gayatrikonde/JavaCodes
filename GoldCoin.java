import java.util.Scanner;
public class GoldCoin {
    public static void main(String[] args)
    {
        int coin=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age");
        int age=sc.nextInt();
        if(age<=0)
        {
            System.out.println("Invalid age");

        }
        else
        {
            
            coin=age*age*age;
            
            System.out.println(coin);
        }

    }
    
}
