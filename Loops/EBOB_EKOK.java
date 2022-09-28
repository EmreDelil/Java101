package Loops;
import java.util.Scanner;
public class EBOB_EKOK {

	public static void main(String[] args) {
		/* Java ile iki sayının EBOB ve EKOK değerlerini bulan program yazıyoruz.
		 * 
		 * EBOB : İki ya da daha fazla doğal sayının ortak bölenlerinin en büyüğüne bu sayıların en büyük
		 * ortak böleni, kısaca EBOB‘u denir.
		 * ÖRNEK: 18 ve 24 sayılarının en büyük ortak bölenini adım adım bulalım.
		 * 18’in bölenleri : 1, 2, 3, 6, 9, 18
		 * 24’ün bölenleri : 1, 2, 3, 4, 6, 8, 12, 24.
		 * Bu ortak bölenlerin en büyüğü 6 sayısı EBOB’tur.
		 * 
		 * EKOK : İki ya da daha fazla doğal sayının ortak katlarının en küçüğüne bu sayıların en küçük ortak
		 * katı, kısaca EKOK‘u denir.
		 * ÖRNEK: 6 ve 8 sayılarının en küçük ortak katını adım adım bulalım.
		 * 6’nın katları : 6, 12, 18, 24, 30, 36, 42, 48, …
		 * 8’in katları : 8, 16, 24, 32, 40, 48, 56, 64, …
		 * Bu ortak katlardan en küçüğü 24 sayısı EKOK’tur.
		 * 
		 * EKOK = (n1*n2) / EBOB
		 */
		int number1, number2, i, j;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		number1 = scan.nextInt();
		System.out.print("Enter the second number : ");
		number2 = scan.nextInt();
		
		// EBOB
		
		if (number1 < number2) {
			for(i = number1; i > 0; i--) {
				if((number1 % i == 0) && (number2 % i == 0)) {
					System.out.println("The EBOB of the numbers is : " + i);
					break;
				}
			}
		}else {
			for (i = number2; i > 0; i--) {
				if ((number1 % i == 0) && (number2 % i == 0)) {
					System.out.println("The EBOB of the numbers is : " + i);
					break;
				}
			}
		}
		
		// EKOK
		
		for(i = 1; i <= (number1 * number2); i++) {
			if (i % number1 == 0 && i % number2 == 0) {
				System.out.println("The EKOK of the numbers is : " + i);
				break;
			}
		}
		
		// Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.
		
		int n1, n2, tempN1, tempN2, a = 1;
		
		System.out.print("Enter the first number : ");
		n1 = scan.nextInt();
		System.out.print("Enter the second number : ");
		n2 = scan.nextInt();
		
		tempN1 = n1;
		tempN2 = n2;
		
		if (n1 < n2) {
			while(tempN1 > 0) {
				if(n1 % tempN1 == 0 && n2 % tempN1 == 0) {
					System.out.println("The EBOB of the numbers is : " + tempN1);
					break;
				}
				tempN1--;
			}
		}else {
			while(tempN2 > 0) {
				if(n1 % tempN2 == 0 && n2 % tempN2 == 0) {
					System.out.println("The EBOB of the numbers is " + tempN2);
					break;
				}
				tempN2--;
			}
		}
		while(a <= (n1 * n2)) {
			if(a % n1 == 0 && a % n2 == 0) {
				System.out.println("The EKOK of the numbers is : " + a);
				break;
			}
			a++;
		}
	}
}
