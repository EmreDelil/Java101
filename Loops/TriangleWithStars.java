package Loops;
import java.util.Scanner;
public class TriangleWithStars {

	public static void main(String[] args) {
		// Java'da döngüler kullanılarak yıldızlar ile üçgen yapıyoruz.
		
		int i, j, k, l = 1, c, tempK;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the heigh of the triangle : ");
		k = scan.nextInt();
		tempK = k;
		for(i = 1; i <= k; i++) {
			for(c = 1; c <= tempK; c++) {
				System.out.print(" ");
			}
			tempK--;
				for(j = 1; j <= l; j++) {
					System.out.print("*");
				}
				l += 2;
				System.out.println("");
		}
		/* int n, i, k, j;
		 * System.out.print("Enter a number : ");
		 * n = scan.nextInt();
		 * for(i = 1; i <= n; i++){
		 * 		for(k = 1; k <= (n-i); k++){
		 * 			System.out.print(" ");
		 * 		}
		 * 		for(j = 1; j <= (2*i) - 1; j++){
		 * 			System.out.print("*");
		 * 		}
		 * 		System.out.println();
		 * }
		 */
		
		//-----------------------------------------------------------------------------------------------
		System.out.println("-------------------------------------------------------------------------");
		//-----------------------------------------------------------------------------------------------
		
		// Java'da döngüler kullanarak yıldızlar ile elmas yapınız.
		
		int number, tempNumber, line, space, star;
		
		System.out.print("Enter a number : ");
		number = scan.nextInt();
		tempNumber = number;
		
		for(line = 1; line <= number; line++) {
			for(space = 1; space <= tempNumber; space++) {
				System.out.print(" ");
			}
			tempNumber--;
			for(star = 1; star <= (2*line)-1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		tempNumber = 2;
		for(line = number-1; line >= 1; line--) {
			for(space = 1; space <= tempNumber; space++) {
				System.out.print(" ");
			}
			tempNumber++;
			for(star = 1; star <= (2*line)-1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
