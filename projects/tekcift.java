import java.util.Scanner;
public class tekcift {
	public static void main(String[]args)
	{
		System.out.println("L�tfen ekrana bir say� girin : ...");
		Scanner giris=new Scanner(System.in);
		int sayial;
		sayial = giris.nextInt();
		if(sayial%2==0)
		{
		System.out.println("Girdi�iniz say� bir �ift say�d�r");	
		}
		else 
		{
		System.out.println("Girdi�iniz say� bir tek say�d�r");	
		}
	}

}
