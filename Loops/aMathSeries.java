package Loops;
import java.util.Scanner;
public class aMathSeries {

	public static void main(String[] args) {
		/* We use the integers a, b, and n to create the following series:
		 * (a + 2^0 * b), (a + 2^0 * b + 2^1 * b),...,(a + 2^0 * b + 2^1 * b +...+ 2^(n-1) * b)
		 * You are given q queries in the form of a, b, and n.
		 * Constraints :
		 * 0 <= q <= 500
		 * 0 <= a,b <= 50
		 * 1 <= n <= 15
		 */
		int a, b, n, q, i, j, s1, total = 0, pwr = 1, k;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the query number : ");
        q = scan.nextInt();
        for(j = 1; j <= q; j++){
        	System.out.print("Enter the a : ");
            a = scan.nextInt();
            System.out.print("Enter the b : ");
            b = scan.nextInt();
            System.out.print("Enter the n : ");
            n = scan.nextInt();
            if(q >= 0 && q <= 500){
                if(a >= 0 && a <= 50){
                    if (b >= 0 && b <= 50){
                        if (n >= 1 && n <= 15){
                            for(i = 0; i <= n-1; i++){
                                for(k = 1; k <= i; k++){
                                    pwr *= 2;
                                }
                                total = total + (pwr * b);
                                System.out.print((a + total) + " ");
                                pwr = 1;
                            }
                            System.out.println();
                            total = 0;
                        }
                    }
                }
            }
        }
	}
}
