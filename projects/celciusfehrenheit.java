import java.util.Scanner;
public class celciusfehrenheit {
public static void main(String[]args)
{   int celcius,fahrenheit;
	Scanner giris=new Scanner(System.in);
	System.out.println("Celcius derecesinden bir de�er giriniz : \n" + 
	"Girdi�iniz de�er Fahrenheit'a �evrilecektir");
	celcius=giris.nextInt();
	fahrenheit=(int) ((celcius*1.8)+32);
	System.out.println(celcius + " Celcius = " + fahrenheit + " Fahrenheit'a e�ittir");
	
}
}
