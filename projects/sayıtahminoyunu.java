import java.util.Scanner;
import java.util.Random;
public class sayıtahminoyunu {
public static void main(String[]args)
{
	Scanner giriş= new Scanner(System.in);
	Random rastgele=new Random();
	int Uretilen,Tahmin,Fark,Sayaç=0;
	Uretilen = rastgele.nextInt(100)+1;
	do
	{
		System.out.println("Bir tahminde bulunun : ");
		Tahmin = giriş.nextInt();
		Sayaç++;
		Fark=Math.abs((Uretilen-Tahmin));
		if(Fark > 0 && Fark <=5) System.out.println("--!!Çok yaklaştın bir daha dene!!-- :0");
		else if(Fark > 5 && Fark <= 15) System.out.println("İyi gidiyorsun :) tekrar dene.");
		else if(Fark > 15 && Fark <= 25)System.out.println("Daha iyisini yapabilirsin umudunu yitirme.");
		else if(Fark > 25 && Fark <= 35)System.out.println("Sayıdan çok uzaksın bir daha dene.");
		else if(Fark >35 && Fark <=45)System.out.println("Sayıyla alakan bile yok. Tekrar dene");
		else if(Fark > 45)System.out.println("Saçmalama. Biraz daha tutarlı bir tahminde bulun.");
	}while(Fark != 0);
	if(Sayaç>0 && Sayaç<=2 )System.out.println("Sayıyı buldun "  + Uretilen+ " - " + Sayaç+" ve sadece kere denedin. Efsanesin");
	else if(Sayaç>2 && Sayaç <=4)System.out.println("Sayıyı buldun" + Uretilen + " - " + Sayaç + " kere denedin. Çok iyisin ama daha iyi olabilirsin");
	else if(Sayaç > 4 && Sayaç <=6)System.out.println("Sayıyı buldun " + Uretilen + " - " +Sayaç+" defa denedin. Biraz daha çalış.");
	else if(Sayaç >6 && Sayaç <= 10)System.out.println("Sayıyı buldun "+Uretilen+" - "+Sayaç+" defa denedin. Ha Ha Ha. Baya kötüsün ya");
}
}
