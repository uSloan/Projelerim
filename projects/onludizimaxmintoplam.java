import java.util.Scanner;
public class onludizimaxmintoplam {
	private static Scanner sayial;

	public static void main(String[]args)
	{
		int b�y�k=0,k���k=0,giri�;
		sayial = new Scanner(System.in);
		System.out.println("10 adet say� giriniz");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i + ". Say� = ");
			giri�=sayial.nextInt();
			if(i==1) {b�y�k = giri�;k���k = giri�;}
			else
			{
				if(b�y�k<giri�) b�y�k=giri�;
				else if(k���k>giri�) k���k=giri�;
			}
		}
		System.out.println("En b�y�k eleman = " + b�y�k);
		System.out.println("En k���k eleman = " + k���k);
		System.out.println("Dizinin en b�y�k ve en k���k elemanlar�n�n toplam� = " + (b�y�k + k���k));
	}
}