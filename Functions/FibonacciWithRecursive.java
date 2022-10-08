package Functions;
import java.util.Scanner;
public class FibonacciWithRecursive {
	
	static int fibo(int digitNumber) {
		if(digitNumber == 1 || digitNumber == 2) {
			return 1;
		}	
		return fibo(digitNumber - 1) + fibo(digitNumber - 2);
	}
	
	public static void main(String[] args) {
		/* Java'da recursive metotlar ile fibonacci serisi bulan program yapıyoruz.
		 * 1 1 2 3 5 8 13 21...
		 * 
		 * f(1) = 1
		 * f(2) = 2
		 * 
		 * f(n) = f(n - 1) + f(n - 2)
		 * f(6) = f(5) + f(4)
		 * f(5) = f(4) + f(3)
		 * f(4) = f(3) + f(2)
		 * f(3) = f(2) + f(1)
		 */		
		int digitNumber;
		System.out.print("Enter the number of elements : ");
		try(Scanner sc = new Scanner(System.in)){
			digitNumber = sc.nextInt();
		}
		System.out.println(fibo(digitNumber));
	}
}
