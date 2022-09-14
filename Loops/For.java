package Loops;

public class For {

	public static void main(String[] args) {
		for(int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		}
		
		System.out.println("------------");
		/* ------------------------------------------
		 * Yukarıdakinin aynısı while ile yazımı. For da kaç defa dönüleceği belli ama while da belli değildir
		 * Dolayısıyla ona göre işlemlerde kullanılır.
		 */
		
		int k = 1;
		while (k <= 10) {
			System.out.println(k);
			k += 2;
		}
	}

}
