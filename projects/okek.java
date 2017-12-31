import java.util.Scanner;
public class okek {
	public static void main(String[]args) {
		int a,b;
		Scanner sayi1=new Scanner(System.in);
		System.out.println("1. sayýyý girin");
		a=sayi1.nextInt();
		Scanner sayi2=new Scanner(System.in);
		System.out.println("2. sayýyý girin : ");
		b=sayi2.nextInt();
		int baslangic=2;
		int sonuc;
		while(true)
		{
			if((baslangic%a==0)&&(baslangic%b==0))
			{
				sonuc=baslangic;
				System.out.println("OKEK : " + sonuc);
				break;
			}
			baslangic++;
		}
		
		
	}
	
}


