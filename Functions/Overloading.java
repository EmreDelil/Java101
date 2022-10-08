package Functions;

public class Overloading {
	/* Java'da, iki veya daha fazla metot, parametreler açısından farklılık gösteriyorsa (farklı sayıda
	 * parametre, farklı türde parametre veya her ikisi) aynı isime sahip olabilir. Metot çeşidi farklı olsa
	 * bile (void - int) method adı aynı olamaz. Bu duruma metotlarda "Overloading" yani aşırı yüklenme işlemi
	 * denir.
	 */
	static void print() {
		System.out.println("Method without parameters.");
	}
	
	static void print(int a) {
		System.out.println("Parameter : " + a);
	}
	
	static void print(double a) {
		System.out.println("Parameter double : " + a);
	}
	
	static int print(int a, int b) {
		return a + b;
	}
	
	static int print(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		print();
		print(12);
		print(12.0);
		System.out.println(print(2,3));
		System.out.println(print(2,3,4));
	}
}
