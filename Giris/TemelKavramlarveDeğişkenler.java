package Giris;

public class TemelKavramlarveDeğişkenler {

	public static void main(String[] args) {
		
		//Dikdörtgenin alan ve çevresini hesaplayan program. int kullanımı gösterimi.
		int kisaKenar = 5, uzunKenar = 20;
		int alan = kisaKenar * uzunKenar;
		int cevre;
		cevre = 2 * (kisaKenar + uzunKenar);
		
		System.out.println(alan);
		System.out.println(cevre);
		
		/* Tam sayıları belirten veri tipleri Byte, Short, Integer ve Longtur.
		 * Byte : 8 bit uzunluğunda max 127 min -128 değerlerini alır.
		 * Short : 16 bit uzunluğunda max 32,767 min -32,768 değerlerini alır.
		 * Integer : 32 bit uzunluğunda max 2,147,483,647 min -2,147,483,648 değerlerini alır.
		 * Long : 64 bit uzunluğunda max 9,223,372,036,854,775,807 min -9,223,372,036,854,775,808 değerlerini alır.
		 */ 
		byte vByte = 100;
		short vShort = 1000;
		int vInt = 10000;
		long vLong = 1000000000;
		System.out.println(vByte);
		System.out.println(vShort);
		System.out.println(vInt);
		System.out.println(vLong);
		
		/* Ondalık sayıları belirten veri tipleri float ve double dır.
		 * Float : 32 Bit boyutundadır ve 1.4×10^-45 ile 3.4×10^38 aralığında bir değer tanımlanabilir.
		 * float tanımlamalardan sonra ‘f’ veya ‘F’ konulmalıdır.
		 * Double : 64 Bit boyutundadır ve 4.9×10^-324 ile 1.8×10^308 aralığında bir değer tanımlanabilir.
		 */
		float vFloat1 = 3.14f;
		float vFloat2 = 3;
		System.out.println(vFloat1);
		System.out.println(vFloat2);
		double vDouble1 = 3.14;		
		double vDouble2 = 3;
		System.out.println(vDouble1);
		System.out.println(vDouble2);
		
		/* char ve boolean
		 * Java'da karakter değişkenleri saklamak için Char kullanılır. Char veri tipleri
		 * birleşerek String Sınıfından bir yapıya dönüşür.
		 * Karakterler char ile saklanır ve javada char 16 bittir.
		 * ascii tablosuna göre değerler alır.
		 * Java, mantıksal değerleri saklamak için boolean adında bir tipe sahiptir.
		 * Boolean sadece iki değer alabilir : True ve False.
		 * Genellikle koşul ve döngü işlemlerinde, kontrol amaçlı olarak kullanılır.
		 * String sınıfı java.lang kütüphanelerinde bulunan ve metinlerle ilgili her
		 * türlü işlemin yapıldığı sınıftır. Java'da kelime tutmak için kullanılır.
		 */
		char vChar = 'b';
		char vChar2 = 98;
		System.out.println(vChar);
		System.out.println(vChar2);
		char c1 = 'J';
		char c2 = 'A';
		char c3 = 'V';
		char c4 = 'A';
		System.out.println(c1 + c2 + c3 + c4);
		System.out.println("" + c1 + c2 + c3 + c4);
		boolean dogru = true;
		boolean yanlis = false;
		System.out.println(dogru);
		System.out.println(yanlis);
		String vStr = "Emre Delil";
		System.out.println(vStr);
		

	}

}
