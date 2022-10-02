package Loops;
import java.util.Scanner;
public class invertedTriangle {

	public static void main(String[] args) {
		/* Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana
		 * ters üçgen çizen programı yazın.
		 */
		Scanner input = new Scanner(System.in);
		int digitNumber, i, j, space, tempNumber;
		
		System.out.print("Enter the number of digits : ");
		digitNumber = input.nextInt();
		
		tempNumber = 1;
		for(i = digitNumber; i > 0; i--) {
			for(space = 1; space < tempNumber; space++) {
				System.out.print(" ");
			}
			tempNumber++;
			for(j = 1; j <= 2*i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
