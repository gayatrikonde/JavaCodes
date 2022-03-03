import java.util.Scanner;
public class ReapitionNumber {
    public static void main(String[] args)
    {
        int rem=0,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        System.out.println("Enter the key digit");
        int key=sc.nextInt();
        int temp=num;
        while(temp>0)
        {
            rem=temp%10;
            
            if(rem==key)
            {
                count++;
            }
            temp=temp/10;
            
        }
        System.out.println(key+" appears "+count+" times in "+num);


        
        




    }
    
}
