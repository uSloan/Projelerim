import java.util.Scanner;
public class �st�ndeyse10alt�ndaysa25 {
	public static void main(String[] args) {
	double i;
	Scanner giris = new Scanner(System.in);
	System.out.println("Bir say� giriniz : \n"
			+"Say�n�z 50'den k���kse %25'i b�y�kse %10 u hesaplanacakt�r");
	i=giris.nextInt();
	if(i<50)
	{
		System.out.println("Say�n�z 50'den k���kt�r. %25i : " + ((i/100)*25) );
	}
	else
	{
		System.out.println("Say�n�z 50'den b�y�kt�r. %10u : " + ((i/100)*10));
	}

	}

}
