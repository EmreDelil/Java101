package Functions;

public class ReturnAndVoid {
	static int sum1(int a, int b) {
		return a + b;
	}
	static void sum2(int a, int b) {
		int result = a + b;
		System.out.println(result);
	}
	public static void main(String[] args) {
		/* return olan metotlar returna bir değer atacağından başka değişkenlere atanabilir. Yani return
		 * sayesinde o metodun döndüreceği bir değeri olduğundan bize bir çıktı verebilir, o değer başka
		 * değişkenlere atanabilir.
		 */
		int result = sum1(5,2) + sum1(3,1);
		System.out.println(result);
		
		//----------------------------------
		System.out.println("-------------------");
		/* void metodları bir değer döndürmediği için atama yapılamaz. ekrana çıktı almak için metot içinde
		 * System.out.print komutu kullanılabilir. main metodu içerisinde içi boş bir kod olarak görüldüğü
		 * için atama yapılmak istendiğinde hata alınır. Atama yapılmadan çalıştırılır. 
		 */
		sum2(5,2);
	}
}
