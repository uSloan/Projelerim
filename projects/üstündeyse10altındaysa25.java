import java.util.Scanner;
public class üstündeyse10altýndaysa25 {
	public static void main(String[] args) {
	double i;
	Scanner giris = new Scanner(System.in);
	System.out.println("Bir sayý giriniz : \n"
			+"Sayýnýz 50'den küçükse %25'i büyükse %10 u hesaplanacaktýr");
	i=giris.nextInt();
	if(i<50)
	{
		System.out.println("Sayýnýz 50'den küçüktür. %25i : " + ((i/100)*25) );
	}
	else
	{
		System.out.println("Sayýnýz 50'den büyüktür. %10u : " + ((i/100)*10));
	}

	}

}
