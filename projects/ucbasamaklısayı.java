import java.util.Scanner;
public class ucbasamakl�say�
{
public static void main(String[]args)
{
System.out.println("�� basamakl� bir say� giriniz");
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
System.out.println("Basamaklar toplam� : " + basamaklartoplami);
System.out.println("Basamaklar �arp�m� : " + basamaklarcarpimi);
System.out.println("Basamaklar �arp�m�n�n toplam�na b�l�m�nden kalan : " + (basamaklarcarpimi%basamaklartoplami));

}

}




