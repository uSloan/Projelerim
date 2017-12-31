import java.util.Scanner;
public class üç_sayýnýn_en_büyüðü {
public static void main(String[]args)
{
	int büyük=0,küçük=0,giriþ;
	Scanner sayial = new Scanner(System.in);
	System.out.println("3 adet sayý giriniz");
	for(int i=1;i<=3;i++)
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
	System.out.println("En büyük sayý = " + büyük);
}
}
