package KosulluIfadeler;
import java.util.Scanner;
public class PassOrFailClass {

	public static void main(String[] args) {
		/*Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
		 * Geçme Notu : 55
		 * Girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
		 */
		int math, physics, turkish, chemistry, music, total = 0, NoL = 0;
		double average;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the math grade : ");
		math = input.nextInt();
		if ((math >= 0) && (math <= 100)) {
			total += math;
			NoL++;
		}
		
		System.out.print("Enter the physics grade : ");
		physics = input.nextInt();
		if ((physics >= 0) && (physics <= 100)) {
			total += physics;
			NoL++;
		}
		
		System.out.print("Enter the turkish grade : ");
		turkish = input.nextInt();
		if ((turkish >= 0) && (turkish <= 100)) {
			total += turkish;
			NoL++;
		}
		
		System.out.print("Enter the chemistry grade : ");
		chemistry = input.nextInt();
		if ((chemistry >= 0) && (chemistry <= 100)) {
			total += chemistry;
			NoL++;
		}
		
		System.out.print("Enter the music grade : ");
		music = input.nextInt();
		if ((music >= 0) && (music <= 100)) {
			total += music;
			NoL++;
		}
		
		average = total / NoL;
		System.out.println("Your average : " + average);
		
		if (average < 55) {
			System.out.println("You failed the class.");
		}else {
			System.out.println("You pass the class.");
		}
	}

}
