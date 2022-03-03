import java.util.Scanner;
public class ListOfPrime {
    public static void main(String[] args)
    {
        int flag=0;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>=b || a<0 || b<0)
        {
            System.out.println("Provide Valid Input");
        }
        else
        {
            for(int i=a;i<=b;i++)
            {
                for(int j=2;j<i;j++)
                {
                    if(i%j==0)
                    {
                        flag++;
                    }
                }
                if(flag==0)
                {
                    if(i!=1)
                    {
                        System.out.println(i+" ");
                    }
                }
                flag=0;
            }
        }
       
    

    }
}
