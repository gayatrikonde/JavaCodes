import java.util.Scanner;
public class Palin {
    public static void main(String[] args)
    {
        int rem=0,pal=0,num1=0;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        num1=num;
        if(num<0)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            while(num>0)
            {
                rem=num%10;
                pal=pal*10+rem;
                num=num/10;
            }
            

            if(num1==pal)
            {
                System.out.println("Palindrome");
            }
            else
            {
                System.out.println("Not Palindrome");
            }
        }


    }
    
}
