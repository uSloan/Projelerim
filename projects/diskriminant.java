import java.util.Scanner;

public class diskriminant {
public static void main(String[]args)
{
	Scanner giris=new Scanner(System.in);
	System.out.println("(ax²+bx+c) olacak þekilde a,b ve c deðerleri giriniz.");
    System.out.println("a: ");
    double a = giris.nextInt();
    System.out.println("b: ");
    double b = giris.nextInt();
    System.out.println("c: ");
    double c = giris.nextInt();
    double delta = (b*b) - (4*a*c);
    if(delta > 0)
    {
    	double x1 = ((-1 * b) - Math.sqrt(delta)) / (2*a);
    	double x2 = ((-1 * b) + Math.sqrt(delta)) / (2*a);
    	System.out.println("x1= " + x1 + " x2= " + x2);
    }
    if(delta < 0 )
    {
    	System.out.println("Denklemin reel kökü yoktur.");
    }
    if(delta == 0)
    {
    	double x = (-1 * b)/(2*a);
    	System.out.println("Denklemin çakýþýk iki kökü vardýr \n" + "x1 ve x2 = " + x);
    }
}
}
