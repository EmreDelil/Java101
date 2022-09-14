package Loops;
import java.util.Scanner;
public class evenNumber {

	public static void main(String[] args) {
		// Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.

		int i, k;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number : ");
		i = input.nextInt();
		
		for(k = 1; k <= i; k++) {
			if(k % 2 == 1) {
				continue;
			}
			System.out.println(k);
		}
		
	}
}
