import java.util.Scanner;
public class FactorsOfPrime {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        
        {
            System.out.println("1");
            for(int i=2;i<=num;i++)
            {
                if(num%i==0)
                {
                    System.out.println(", "+i);
                }
            }
            
        }
    }
    
}
