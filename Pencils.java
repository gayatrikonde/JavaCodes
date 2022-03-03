import java.util.Scanner;
public class Pencils {
    public static void main(String[] args)
    {
        int pencil=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the standard:");
        int std=sc.nextInt();
        if(std<1 || std>12)
        {
            System.out.println("Invalid class");
        }
        else
        {
            for(int i=1;i<=std;i++)
            {
                pencil=i*i+pencil;
            }
            System.out.println("Nila gets "+pencil+" pencils");

        }

        
    }
    
}
