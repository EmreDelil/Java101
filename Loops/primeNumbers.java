package Loops;

import java.util.Scanner;

public class primeNumbers {

	public static void main(String[] args) {
		// Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
		
		Scanner input = new Scanner(System.in);
		int number, j, total = 0, i;
		
		System.out.print("Enter a number : ");
		number = input.nextInt();
		
		System.out.println("Prime numbers are : ");
		for(i = 2; i <= number; i++) {
			for(j = 2; j <= i; j++) {
				if(i % j == 0) {
					total += j;
				}
			}
			if(total == i) {
				System.out.println(i);
			}
			total = 0;
		}
	}
}
