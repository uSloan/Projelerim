import java.util.Scanner;
import java.util.Random;
public class say�tahminoyunu {
public static void main(String[]args)
{
	Scanner giri�= new Scanner(System.in);
	Random rastgele=new Random();
	int Uretilen,Tahmin,Fark,Saya�=0;
	Uretilen = rastgele.nextInt(100)+1;
	do
	{
		System.out.println("Bir tahminde bulunun : ");
		Tahmin = giri�.nextInt();
		Saya�++;
		Fark=Math.abs((Uretilen-Tahmin));
		if(Fark > 0 && Fark <=5) System.out.println("--!!�ok yakla�t�n bir daha dene!!-- :0");
		else if(Fark > 5 && Fark <= 15) System.out.println("�yi gidiyorsun :) tekrar dene.");
		else if(Fark > 15 && Fark <= 25)System.out.println("Daha iyisini yapabilirsin umudunu yitirme.");
		else if(Fark > 25 && Fark <= 35)System.out.println("Say�dan �ok uzaks�n bir daha dene.");
		else if(Fark >35 && Fark <=45)System.out.println("Say�yla alakan bile yok. Tekrar dene");
		else if(Fark > 45)System.out.println("Sa�malama. Biraz daha tutarl� bir tahminde bulun.");
	}while(Fark != 0);
	if(Saya�>0 && Saya�<=2 )System.out.println("Say�y� buldun "  + Uretilen+ " - " + Saya�+" ve sadece kere denedin. Efsanesin");
	else if(Saya�>2 && Saya� <=4)System.out.println("Say�y� buldun" + Uretilen + " - " + Saya� + " kere denedin. �ok iyisin ama daha iyi olabilirsin");
	else if(Saya� > 4 && Saya� <=6)System.out.println("Say�y� buldun " + Uretilen + " - " +Saya�+" defa denedin. Biraz daha �al��.");
	else if(Saya� >6 && Saya� <= 10)System.out.println("Say�y� buldun "+Uretilen+" - "+Saya�+" defa denedin. Ha Ha Ha. Baya k�t�s�n ya");
}
}
