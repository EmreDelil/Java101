package Loops;
import java.util.Scanner;
public class Min_Max {

	public static void main(String[] args) {
		/* Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu
		 * sayıları ekrana yazan programı yazın.
		 * Senaryo :
		 * Kaç tane sayı gireceksiniz: 4
		 * 1. Sayıyı giriniz: 16
		 * 2. Sayıyı giriniz: -22
		 * 3. Sayıyı giriniz: -15
		 * 4. Sayıyı giriniz: 100
		 * En büyük sayı: 100
		 * En küçük sayı: -22
		 */
		Scanner input = new Scanner(System.in);
		int i = 1, numberCounter, number, largestNumber = 0, smallestNumber = 0;
		
		System.out.print("How many numbers will you enter ? : ");
		numberCounter = input.nextInt();
		
		while(i <= numberCounter) {
			System.out.print("Enter the " + i + ". number : ");
			number = input.nextInt();
			if (i == 1) {
				largestNumber = number;
				smallestNumber = number;
			}else if(number > largestNumber){
					largestNumber = number;
			}else if(number < smallestNumber) {
					smallestNumber = number;
			}
			i++;
		}
		System.out.println("Largest number is : " + largestNumber);
		System.out.println("Smallest number is : " + smallestNumber);
	}

}
