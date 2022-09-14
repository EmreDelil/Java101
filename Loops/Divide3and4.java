package Loops;
import java.util.Scanner;
public class Divide3and4 {

	public static void main(String[] args) {
		/* Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların
		 * ortalamasını hesaplayan programı yazınız.
		*/
		
		int i, j = 0, k, total = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		i = input.nextInt();
		
		for (k = 0; k <= i; k++) {
			if ((k % 3 == 0) && (k % 4 == 0)) {
				total += k;
				j++;
			}
		}
		System.out.println("" + total/(j-1));
	}

}
