package Loops;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// Java ile faktöriyel hesaplayan program yazıyoruz.
		int i, k, result = 1;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number what you want to calculate : ");
		i = input.nextInt();
				
		for(i = i; i > 0; i--) {
			result *= i;
		}
		System.out.println(result);
		
		System.out.println("---------------------------------");
		//-------------------------------------------
		
		/* N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li
		 * kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
		 * Java ile kombinasyon hesaplayan program yazınız.
		 * Kombinasyon formülü : C(n,r) = n! / (r! * (n-r)!)
		 */
		int r, n, j, result1 = 1, result2 = 1, result3 = 1, solution;
		
		System.out.print("Enter the number of elements of the main set : ");
		n = input.nextInt();
		System.out.print("Enter the number of elements of the subset : ");
		r = input.nextInt();
		j = n-r;
		
		for(n = n; n > 0; n--) {
			result1 *= n;
		}
		for(r = r; r > 0; r--) {
			result2 *= r;
		}
		for(j = j; j > 0; j--) {
			result3 *= j;
		}
		solution = result1 / (result2 * result3);
		System.out.println("C(n,r) : " + solution);
	}

}
