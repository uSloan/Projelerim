import java.util.Scanner;
public class ucbasamaklýsayý
{
public static void main(String[]args)
{
System.out.println("Üç basamaklý bir sayý giriniz");
Scanner sayial=new Scanner(System.in);
int sayi=sayial.nextInt();
int yuzler,onlar,birler;
yuzler = sayi/100;

sayi = sayi%100;

onlar =sayi/10;

birler  = sayi %10;
int basamaklartoplami;
basamaklartoplami=yuzler+onlar+birler;
int basamaklarcarpimi;
basamaklarcarpimi=yuzler*onlar*birler;
System.out.println("Basamaklar toplamý : " + basamaklartoplami);
System.out.println("Basamaklar çarpýmý : " + basamaklarcarpimi);
System.out.println("Basamaklar çarpýmýnýn toplamýna bölümünden kalan : " + (basamaklarcarpimi%basamaklartoplami));

}

}




