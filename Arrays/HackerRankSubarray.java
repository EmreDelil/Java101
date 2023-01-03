package Arrays;
import java.util.*;

public class HackerRankSubarray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, sum, negativeCounter = 0;
		
		System.out.print("Enter the matrix's length : ");
		n = scan.nextInt();
		
		int[] matrix = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Enter the matrix's "+ (i+1) +". value : ");
			matrix[i] = scan.nextInt();
		}
		
		for(int j = 0; j < matrix.length; j++) {
			sum = 0;
			for(int k = j; k < matrix.length; k++) {
				sum += matrix[k];				
				if(sum < 0) negativeCounter++;
			}
		}
		System.out.println(negativeCounter);
	}

}
