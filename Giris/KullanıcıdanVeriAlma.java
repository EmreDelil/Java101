package Giris;

import java.util.Scanner;
public class KullanıcıdanVeriAlma {
	public static void main(String[] args) {
	int a;
	Scanner input = new Scanner(System.in);
	System.out.print("a sayisini giriniz : ");
	a = input.nextInt();
	System.out.println(a);
	// Kısa kullanım
	System.out.print("a sayisini giriniz : ");
	a=new Scanner(System.in).nextInt();
	System.out.println(a);
	// Farklı bir sayı tipiyle kullanalım
	/* Double da ondalık girerken nokta değil virgül kullanılır. int double ve nextint double arasındaki
	 * fark, ilk kullanılan sonucu 2. kullanılan girilecek sayının türünü gösterir. */
	Scanner input1 = new Scanner(System.in);
	System.out.print("b Sayisini Giriniz : ");
	double b = input1.nextDouble();
	System.out.println(b);
	// Tüm veri tipleri için yapılır. String için line kullanılır.
	Scanner input2 = new Scanner(System.in);
	System.out.print("Bir Deger Giriniz : ");
	String str = input2.nextLine();
	System.out.println(str);
	
	// KONU ALTINDAKİ NOTLAR.
	Scanner input3 = new Scanner(System.in);
	int c,d;
	System.out.println("c Sayisini Giriniz : ");
	c = input3.nextInt();
	System.out.println("d Sayisini Giriniz : ");
	d = input3.nextInt();
	System.out.println("c Sayisi : " + c);
	System.out.println("d Sayisi : " + d);

	// !!!Stringte sıkıntı var inp3 yanlış inp2 de doğru çalışıyor.
	System.out.print("Ad Soyad Giriniz : ");
	String adSoyad = input2.nextLine();
	System.out.println("Ad Soyad : " + adSoyad);
	System.out.print("Yas Giriniz : ");
	int yas = input3.nextInt();
	System.out.println("Yas : " + yas);
	System.out.print("Maas Giriniz : ");
	double maas = input3.nextDouble();
	System.out.println("Maas : " + maas);
	}

}
