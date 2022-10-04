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
