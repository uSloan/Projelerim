import java.util.Scanner;
public class onludizimaxmintoplam {
	private static Scanner sayial;

	public static void main(String[]args)
	{
		int büyük=0,küçük=0,giriþ;
		sayial = new Scanner(System.in);
		System.out.println("10 adet sayý giriniz");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i + ". Sayý = ");
			giriþ=sayial.nextInt();
			if(i==1) {büyük = giriþ;küçük = giriþ;}
			else
			{
				if(büyük<giriþ) büyük=giriþ;
				else if(küçük>giriþ) küçük=giriþ;
			}
		}
		System.out.println("En büyük eleman = " + büyük);
		System.out.println("En küçük eleman = " + küçük);
		System.out.println("Dizinin en büyük ve en küçük elemanlarýnýn toplamý = " + (büyük + küçük));
	}
}