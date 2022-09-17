package Loops;
import java.util.Scanner;
public class PowerOf2_3_4 {

	public static void main(String[] args) {
		// Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.
		int i, k;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		k = input.nextInt();
		
		for (i = 1; i <= k; i *= 2) {
				System.out.println(i);
		}
		
		System.out.println("-----------------------");
		//--------------------------------------
		
		//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
		
		int j, l, x, y;
		System.out.print("Enter the top number : ");
		l = input.nextInt();
		
		System.out.println("Power of 4 :");
		for (j = 1; j <= l; j *= 4) {
			System.out.println(j);
		}
		System.out.println("Power of 5 :");
		for (j = 1; j <= l; j *= 5) {
			System.out.println(j);
		}
	}

}
