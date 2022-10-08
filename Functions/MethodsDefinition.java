package Functions;

public class MethodsDefinition {
	/* Syntax = static : main metodunun içinde yazılacak ve main metodu static olduğundan bu da static olmalı.
	 * void : Geri dönüşü olmayan değer döndürmeyen metot.
	 * Her metodun içine parametre yazılmak zorunda değildir.
	 * 
	 * veri tipi metot adı(parametre1, parametre2, ....(veri tipleriyle beraber)){
	 * 		kod bloğu
	 * 		return döndürülecek şey;(Aşağıdaki örnekte result 1 olsaydı istenildiği kadar çözüm yapılsın
	 * 		sonucu hep 1 olarak çıkardı.)
	 * }
	 * Metotlar class altında yazılmalıdır. Matematikte görülen fonksiyonlarla aynı şekilde çalışır.
	 * f(x) = 2x + 5
	 * f(3) = 2*3 + 5 = 11
	 * f(x,y,z) = 3x + 2y + 5z
	 * f(2,3,4) = 3*2 + 2*3 + 5*4 = 32
	 * 
	 * Her metodun içerisinde yazılan değişken sadece o metot içerisinde çalışır. Örnek olarak :
	 * --------------------------------------------
	 * static void sum (int a, int b){
	 * 		a = 25;
	 * 		b = 20;
	 * 		System.out.println(a);
	 * 		System.out.println(b);
	 * }
	 * 
	 * public static void main(String[] args) {
	 * 		a = 15;
	 * 		b = 10;
	 * 		sum(a,b);
	 * }
	 * ---------------------------------------------
	 * Kodu çıktısı : 
	 * 25
	 * 20 ' dir. Veya :
	 * -----------------------------------------------
	 * static void sum (int n1, int n2){
	 * 		System.out.println(a);
	 * 		System.out.println(b);
	 * }
	 * 
	 * public static void main(String[] args) {
	 * 		int a = 20, b = 25;
	 * 		sum(a,b);
	 * -------------------------------------------------
	 * Kodu çıktısı hata mesajı olur. a değeri sum metodu içerisinde değil de main metodu içerisinde
	 * tanımlandığı için sum metodu a sayısını algılayamaz. 20 değeri n1 e, 25 değeri n2 ye eşit olmuş olur.
	 * a değeri diğer metodun içerisindeki bir değişkendir. Veya : 
	 * ---------------------------------------------------
	 * public static void main(String[] args) {
	 * 		int a = 5;
	 * 		if (a < 10);
	 * 			int b = 20;
	 * 		}
	 * 		System.out.println(b);
	 * }
	 * ----------------------------------------------------
	 * Kodunun çıktısı hata mesajı olacaktır. Çünkü b değişkeni if kod blokları arasında tanımlanmış ve 
	 * gerçekleşip gerçekleşmeyeceği kesin değildir. Kesin bir sayı verilmiş olsa bile kod blokları içerisinde
	 * olmadığı için if dışındaki kod blokları b sayısını tanımamaktadır.
	 * -----------------------------------------------------
	 * 
	 * Üslü sayılar metodu :
	 */
	static int power(int base, int exp) {
		int result = 1, i;
		
		for(i = 1; i <= exp; i++) {
			result *= base;
		}
		return result;
	}
	
	static void helloWorld() {
		System.out.println("Hello World!");
	}
	
	
	public static void main(String[] args) {
		int case1;
		case1 = power(2,3);
		System.out.println(case1);
		//-------------------------------
		int n1 = 2, n2= 3;
		case1 = power(n1,n2);
		System.out.println(case1);
		//-------------------------------
		System.out.println(power(2,3));
		//-------------------------------
		System.out.println(power(2,3));
		System.out.println(power(4,2));
		//-------------------------------
		helloWorld();
		/* return olmadığı için yani geri dönülebilir değer döndürülebilir bir metot olmadığı için hellWorld u
		 * System.out.print içine yazamayız. Bir değer döndürmediğinden bir değere eşitlenemediğinden yani
		 * return olmadığından bir sonuç vermeyecek hatta hata verecektir.
		 */
		
	}
}
