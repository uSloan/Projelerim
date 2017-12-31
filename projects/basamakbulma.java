import java.util.Scanner;
public class basamakbulma {

public static void main(String[]args)
{
	Scanner giris=new Scanner(System.in);
	int sayi,x=1,y=1;
	System.out.println("Kaç basamaklı olduğunu öğrenmek istediğiniz sayıyı giriniz : ");
	sayi=giris.nextInt();
	while(sayi/x>9)
	{
		x=x*10;
		y++;
	}System.out.println("Sayınız " + y + " basamaklıdır...");
}
}
