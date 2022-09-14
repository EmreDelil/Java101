package Loops;
import java.util.Scanner;
public class sumOddNumber {

	public static void main(String[] args) {
		/* Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve girilen
		 * değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.
		 */
		int i, total = 0;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("Enter a number : ");
			i = input.nextInt();
			if(i % 2 == 1) {
				total += i;
			}
			System.out.println(total);
		}
		while (i >= 0);
		
		System.out.println("The program has finished.");
		
		System.out.println("------------------------------------");
		// ---------------------------------------------------
		
		/* Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen
		 * değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
		 */
		int k, sum = 0;
		
		do {
			System.out.print("Enter a number : ");
			k = input.nextInt();
			if (k % 4 == 0) {
				sum += k;
			}
			System.out.println(sum);
		}while (k % 2 == 0);
		
		System.out.println("The program has finished.");

	}

}
