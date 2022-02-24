import java.util.Scanner;
public class SI
{
	public static void main(String[] args)

	{

		int P,T,R,SimInterest;
		System.out.println("Enter the things");
		Scanner simple=new Scanner(System.in);
		P=simple.nextInt();
		T=simple.nextInt();
		R=simple.nextInt();
		SimInterest=(P*T*R)/100;
		System.out.println("The SI is"+SimInterest);

	}
}