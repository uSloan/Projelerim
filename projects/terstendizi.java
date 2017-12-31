import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.io.*;
public class terstendizi {

public static void main(String []args) throws IOException
{
	Scanner giris=new Scanner(System.in);
	int[] dizi = new int[5];
	for(int i =0;i<dizi.length;i++)
	{
		System.out.print("Sayi giriniz: ");
		dizi[i]=giris.nextInt();
		
	}
	Arrays.sort(dizi);
	for(int j=0; j<dizi.length; j++)
	{
		System.out.println((j + 1) +". sayý " + dizi[j]);
	}
	try {
	FileWriter fw= new FileWriter("C:\\Users\\ugurh\\Desktop\\22112017_sonuc.txt");
	BufferedWriter br = new BufferedWriter(fw);
	PrintWriter out=new PrintWriter(br);
	for(int i=0; i<dizi.length; i++)
	{
		out.write(dizi[i] + "<");
	}
	System.out.println("Sayýlarýn büyükten küçüðe sýralanmýþ hali masaüstünüzdeki .txt uzantýlý dosya içine yazýldý.");
	out.close();
	}
	
	catch(IOException e)
	{
		System.out.println("Dosya Yazýlmadý...!");
	}
}
}
