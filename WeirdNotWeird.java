package KosulluIfadeler;
import java.util.Scanner;
public class WeirdNotWeird {

	public static void main(String[] args) {
		/*Given an integer, n, perform the following conditional actions:

		If n is odd, print Weird
		If n is even and in the inclusive range of 2 to 5, print Not Weird
		If n is even and in the inclusive range of 6 to 20, print Weird
		If n is even and greater than 20, print Not Weird
		1 <= n <= 100
		 */
		int n,a;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        a = n/2;
        if(n>=1 && n<=100){
            if (!(a+a == n)) {
                System.out.println("Weird");
            }else if (n>=2 && n<=5){
                System.out.println("Not Weird");
            }else if (n>=2 && n<=20){
                System.out.println("Weird");
            }else {
                System.out.println("Not Weird");
            }
        }
	}

}
