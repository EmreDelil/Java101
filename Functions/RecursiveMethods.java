package Functions;

public class RecursiveMethods {
	 static int sum(int k) {
		if(k > 0) {
			return k + sum(k - 1);
		}else {
			return 0;
		}
	}
	 
	 static int f(int n) {
		 System.out.println("n : " + n);
		 if (n == 1) {
			 return 1;
		 }
		 int result = f(n - 1) + n;
		 System.out.println("result : " + result);
		 return result;
	 }
	 
	 static void recursiveMethod(int num) {
		 num--;
		 if (num == 0) {
			 return;
		 }
		 System.out.print(num + ",");
		 recursiveMethod(num);
	 }
	 
	public static void main(String[] args) {
		/* Java'da Recursive Metotlar, bir metodun kendisini çağırma tekniğidir. Recursive metotlar sürekli
		 * kendilerini çağırdıkları için dikkat edilmesi gereken durum en son aşama için koşul koyulmasıdır.
		 */
		int sonuc = sum(10);
		System.out.println(sonuc);
		
		//----------------------------------
		System.out.println("--------------------------------");
		//----------------------------------
		
		System.out.println(f(3));
		/* f(4) = f(3) + 4
		 * f(3) = f(2) + 3
		 * f(2) = f(1) + 2
		 * f(1) = 1
		 * 
		 * f(n) = f(n - 1) + n
		 */
		
		//----------------------------------
		System.out.println("--------------------------------");
		//----------------------------------
		
		recursiveMethod(4);
	}
}
