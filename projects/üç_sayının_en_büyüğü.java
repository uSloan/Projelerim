import java.util.Scanner;
public class ��_say�n�n_en_b�y��� {
public static void main(String[]args)
{
	int b�y�k=0,k���k=0,giri�;
	Scanner sayial = new Scanner(System.in);
	System.out.println("3 adet say� giriniz");
	for(int i=1;i<=3;i++)
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
	System.out.println("En b�y�k say� = " + b�y�k);
}
}
