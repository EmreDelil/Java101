package Functions;
import java.util.Scanner;
public class PrimeNWithRecursive {

	static void prime(int number, int i) {
		if(i > number/2) {
			System.out.println(number + " is a prime number.");
			return;
		}else if(number % i == 0) {
			System.out.println(number + " is not a prime number.");
			return;
		}
		prime(number, ++i);
	}
	
	public static void main(String[] args) {
		/* Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını
		 * bulan programı yazın.
		 */
		Scanner sc = new Scanner(System.in);
		int number;
		
		System.out.print("Enter a number : ");
		number = sc.nextInt();
		
		prime(number,2);
	}

}
