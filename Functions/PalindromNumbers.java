package Functions;
import java.util.Scanner;
public class PalindromNumbers {
	
	static int firstN(int digitNumber, int number) {
		int i, lastDivision;
		lastDivision = number;
		for(i = 1; i < digitNumber; i++) {
			number /= 10;
			lastDivision = number % 10;
		}
		return lastDivision;
	}
	
	static int lastN(int digitNumber, int number, int a) {
		int firstDivision, j;
		for(j = digitNumber; j < a; j++) {
			number /= 10;
		}
			firstDivision = number % 10;
			return firstDivision;
	}
	
	public static void main(String[] args) {
		/* Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.
		 * 
		 * Palindrom Sayı Nedir ?
		 * 
		 * Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
		 * Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
		 */
		int number, tempNumber, result1, result2, i, digitNumber = 0, a, loopNumber, trueCounter = 0;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a number : ");
			number = sc.nextInt();
		}
		
		tempNumber = number;
		while(tempNumber != 0) {
			tempNumber /= 10;
			digitNumber++;
		}
		a = digitNumber;
		loopNumber = digitNumber / 2;
		for(i = 1; i <= loopNumber; i++) {
			result1 = firstN(digitNumber,number);
			result2 = lastN(digitNumber,number,a);
			if(result1 == result2) {
				trueCounter++;
			}
			digitNumber--;
		}
		if(trueCounter == loopNumber) {
			System.out.println(number + " is a palindrom number.");
		}else {
			System.out.println(number + " is not a palindrom number.");
		}
		/* Başka bir çözüm yöntemi :
		 * 
		 * public class PalindromNumbers {
		 * 
		 * 		static boolean isPalindrom(int number){
		 * 			int temp = number, reverseNumber = 0, lastNumber;
		 * 			while(temp != 0) {
		 * 				lastNumber = temp % 10;
		 * 				reverseNumber = (reverseNumber * 10) + lastNumber;
		 * 				temp /= 10;
		 * 			}
		 * 
		 * 			if (number == reverseNumber)
		 * 				return true;
		 * 			else
		 * 				return false;
		 * 			// (Eğer if ve else'den sonra tek satırlık işlem yapılacaksa süslü parantez şart değil.)
		 * 		}
		 * 
		 * 		public static void main(String[] args) {
		 * 			Scanner sc = new Scanner(System.in);
		 * 			int number = sc.nextInt();
		 * 			System.out.println(isPalindrom(number));
		 * 
		 */
	}
}