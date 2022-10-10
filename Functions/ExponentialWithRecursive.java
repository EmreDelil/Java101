package Functions;
import java.util.Scanner;
public class ExponentialWithRecursive {

	static int exp(int base, int pow, int total) {
		if(pow == 0) {
			return total;
		}
		total *= base;
		return exp(base, pow-1, total);
	}
	
	public static void main(String[] args) {
		/* Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot
		 * kullanarak yapan programı yazınız.
		 */
		Scanner sc = new Scanner(System.in);
		int base, pow, total = 1;
		
		System.out.print("Please enter the base value : ");
		base = sc.nextInt();
		System.out.print("Please enter the expotent value : ");
		pow = sc.nextInt();
		
		System.out.println("Result is : " + exp(base,pow,total));
	}

}
