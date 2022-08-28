package Giris;
import java.util.Scanner;
public class bodyMassIndex {

	public static void main(String[] args) {
		/* Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre
		 * kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
		 * Kilo (kg) / Boy(m) * Boy(m)
		 */
		Scanner input = new Scanner(System.in);
		double kg, m, index;
		System.out.print("Enter your height(m) : ");
		m = input.nextDouble();
		System.out.print("Enter your weight(kg) : ");
		kg = input.nextDouble();
		
		index = kg/Math.pow(m, 2);
		System.out.println("Your body mass index is : "+index);

	}

}
