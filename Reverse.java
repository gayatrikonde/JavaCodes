import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class Reverse {
    public static void main(String[] args)
    {
        int rev=0,rem=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();

        if(num==0)
        {
            System.out.println("Output is:0");
        }
        else if(num<0)
        {
            System.out.println("Number should be positive");
        }
        else 
        {
            while(num>0)
            {
                rem=num%10;
                rev=rev*10+rem;
                num=num/10;
            }
            System.out.println(rev);
            
            

            

        }
        
    }
    
}
