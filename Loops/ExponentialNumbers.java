package Loops;
import java.util.Scanner;
public class ExponentialNumbers {

	public static void main(String[] args) {
		// Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı yazıyoruz.
		Scanner scan = new Scanner(System.in);
		int i, j, k, l, total = 1, total1 = 1;
		
		System.out.print("Enter the first number : ");
		i = scan.nextInt();
		System.out.print("Enter the second number : ");
		j = scan.nextInt();
			
		if(j == 0) {
			if(i == 0) {
				System.out.println("Undefined !");
			}else {
				System.out.println("Result : 1");
			}
		}else if(j < 0) {
			for(l = -1; l >= j; l--) {
				total1 *= i;
			}
			System.out.println("Result : 1/" + total1);
		}else {
			for(k = 1; k <= j; k++) {
				total *= i;
			}
			System.out.println("Result : " + total);
		}
		/* int n, k, i = 1, total = 1;
		 * Scanner scan = new Scanner(System.in); 
		 * n = scan.nextInt();
		 * k = scan.nextInt();
		 * while(i <= k){
		 *		total *= n;
		 *		i++;
		 * }
		 * System.out.println("Result : " + total);
		 */
	}

}
