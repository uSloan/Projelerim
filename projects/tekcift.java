import java.util.Scanner;
public class tekcift {
	public static void main(String[]args)
	{
		System.out.println("Lütfen ekrana bir sayý girin : ...");
		Scanner giris=new Scanner(System.in);
		int sayial;
		sayial = giris.nextInt();
		if(sayial%2==0)
		{
		System.out.println("Girdiðiniz sayý bir çift sayýdýr");	
		}
		else 
		{
		System.out.println("Girdiðiniz sayý bir tek sayýdýr");	
		}
	}

}
