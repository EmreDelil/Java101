package KosulluIfadeler;
import java.util.Scanner;
public class activity {

	public static void main(String[] args) {
		/*Sıcaklık 5'den küçük ise "Kayak" yapmayı öner.
		 * Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
		 * Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
		 * Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
		 */
		double temperature;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the temperature please : ");
		temperature = input.nextDouble();
		
		if (temperature < 5) {
			System.out.println("Today is ski day.");
		}else if ((temperature >= 5) && (temperature < 10)) {
			System.out.println("Today is cinema day.");
		}else if ((temperature >= 10) && (temperature < 15)) {
			System.out.println("Today is cinema or picnic day.");
		}else if ((temperature >= 15) && (temperature < 25)) {
			System.out.println("Today is picnic day.");
		}else {
			System.out.println("Today is swimming day.");
		}
	}

}
