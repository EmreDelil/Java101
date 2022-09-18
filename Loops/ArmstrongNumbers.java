package Loops;
import java.util.Scanner;
public class ArmstrongNumbers {

	public static void main(String[] args) {
		/* Java döngüler ile sayının armstrong sayı olup olmadığını bulan programı yazıyoruz.
		 * Armstrong Sayı Nedir ?
		 * N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse,
		 * böyle sayılara Armstrong sayı denir.
		 * Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir.
		 * Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.
		 * 1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit
		 * olmadığı için armstrong sayı olmaz.
		 */
		
		/* int a = 2451, basamakSayisi = 0, numberCounter = 0;
		 * 
		 * --Basamak Sayısı Bulma İşlemi
		 * 2451 / 10 = 245
		 * 245 / 10 = 24
		 * 24 / 10 = 2
		 * 2 / 10 = 0
		 * 0 / 10 = 0
		 * 
		 * while (a != 0) {
		 * 		a /= 10;
		 * 		numberCounter++;
		 * }
		 * 
		 * --Bir sayının son basamağını bulma
		 * 2451 % 10 = 1
		 * 
		 * int b = 2451;
		 * int c = b % 10;
		 * 
		 * --Üs alma
		 * int sub = 2, sup = 3;
		 * int result = 1;
		 * for (int i = 1; i <= sup; i++ ){
		 * 		result *= sub;
		 * }
		 */
		
		int number, tempNumber, digitCounter = 0, digitValue, i, digitPow, result = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		number = input.nextInt();
		tempNumber = number;
		
		while(tempNumber != 0) {
			tempNumber /= 10;
			digitCounter++;
		}
		
		tempNumber = number;
		while(tempNumber != 0) {
			digitValue = tempNumber % 10;
			digitPow = 1;
			for(i = 1; i <= digitCounter; i++) {
				digitPow *= digitValue;
			}
			result += digitPow;
			tempNumber /= 10;
		}
		if (result == number) {
			System.out.println(number + " is a Armstrong Number.");
		}else {
			System.out.println(number + " is not a Armstrong Number.");
		}
		
		//---------------------------------------------------------------------------------------------
		System.out.println("-------------------------------------------------");
		//---------------------------------------------------------------------------------------------
		
		// 3 digits Armstrong Numbers finder.
		
		int Number, b, c, DigitCounter = 3, DigitValue, DigitPow, Total = 0, TempNumber;
		
		System.out.println("3 digits Armstrong Numbers are : ");
		
		for(Number = 100; Number <= 999; Number++) {
			TempNumber = Number;
			for(b = 1; b <= 3; b++) {
				DigitValue = TempNumber % 10;
				DigitPow = 1;
				for(c = 1; c <= 3; c++) {
					DigitPow *= DigitValue;
				}
				Total += DigitPow;
				TempNumber /= 10;
			}
			if(Total == Number) {
				System.out.println(Number);
			}
			Total = 0;
		}
		
		//----------------------------------------------------------------------------------------------
		System.out.println("--------------------------------------------------------------");
		//----------------------------------------------------------------------------------------------
		
		/* Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
		 * Örnek : 1643 = 1 + 6 + 4 + 3 = 14
		 */
		
		int x, a, y = 0;
		System.out.print("Enter a number to calculate the sum of the digits : ");
		x = input.nextInt();
		
		while(x != 0) {
			a = x % 10;
			y += a;
			x /= 10;
		}
		System.out.println("Sum of the digits : " + y);
	}
}
