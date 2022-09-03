package KosulluIfadeler;
import java.util.Scanner;
public class ChineseZodiac {

	public static void main(String[] args) {
		/* Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
		 * Doğum Tarihi %12 = 0 ➜ Maymun, Doğum Tarihi %12 = 1 ➜ Horoz, Doğum Tarihi %12 = 2 ➜ Köpek
		 * Doğum Tarihi %12 = 3 ➜ Domuz, Doğum Tarihi %12 = 4 ➜ Fare, Doğum Tarihi %12 = 5 ➜ Öküz
		 * Doğum Tarihi %12 = 6 ➜ Kaplan, Doğum Tarihi %12 = 7 ➜ Tavşan, Doğum Tarihi %12 = 8 ➜ Ejderha
		 * Doğum Tarihi %12 = 9 ➜ Yılan, Doğum Tarihi %12 = 10 ➜ At, Doğum Tarihi %12 = 11 ➜ Koyun
		 */
		Scanner inp = new Scanner(System.in);
		int year, remainder;
		String animal = "";
		System.out.print("Enter your year of birth : ");
		year = inp.nextInt();
		
		remainder = year % 12;
		
		switch(remainder) {
			case 0:
				animal = "Monkey";
				break;
			case 1:
				animal = "Cockerel";
				break;
			case 2:
				animal = "Dog";
				break;
			case 3:
				animal = "Pig";
				break;
			case 4:
				animal = "Mouse";
				break;
			case 5:
				animal = "Ox";
				break;
			case 6:
				animal = "Tiger";
				break;
			case 7:
				animal = "Rabbit";
				break;
			case 8:
				animal = "Dragon";
				break;
			case 9:
				animal = "Snake";
				break;
			case 10:
				animal = "Horse";
				break;
			case 11:
				animal = "Sheep";
				break;
			default:
				System.out.println("You entered incorrectly!");
		}
		System.out.println("Your Chinese Zodiac is : " + animal);

	}

}
