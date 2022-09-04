package KosulluIfadeler;
import java.util.Scanner;
public class NumberSorting {

	public static void main(String[] args) {
		// Girilen 3 sayıyı "büyükten küçüğe" sıralayan programı yazınız.
		
		Scanner input = new Scanner(System.in);
		double number1, number2, number3;
		
		System.out.print("Enter the number 1 : ");
		number1 = input.nextDouble();
		System.out.print("Enter the number 2 : ");
		number2 = input.nextDouble();
		System.out.print("Enter the number 3 : ");
		number3 = input.nextDouble();
		
		if ((number1 == number2) && (number1 == number3)) {
			System.out.println("All the numbers are equal.");
		}else if ((number1 >= number2) && (number1 >= number3)) {
			if ((number1 > number2) && (number1 > number3)) {
				if (number2 > number3) {
					System.out.println("Number 1 is the largest, number 2 is larger than number 3.");
				}else if (number3 > number2) {
					System.out.println("Number 1 is the largest, number 3 is larger than number 2.");
				}else {
					System.out.println("Number 1 is the largest, number 2 and number 3 are equal and smaller.");
				}
			}else if (number1 == number2) {
				System.out.println("Number 1 and number 2 are equal and larger, number 3 is the smallest.");
			}else {
				System.out.println("Number 1 and number 3 are equal and larger, number 2 is the smallest.");
			}
		}else if ((number2 >= number1) && (number2 >= number3)) {
			if ((number2 > number1) && (number2 > number3)) {
				if (number1 > number3) {
					System.out.println("Number 2 is the largest, number 1 is larger than number 3.");
				}else if (number3 > number1) {
					System.out.println("Number 2 is the largest, number 3 is larger than number 1.");
				}else {
					System.out.println("Number 2 is the largest, number 1 and number 3 are equal and smaller.");
				}
			}else if (number2 == number1) {
				System.out.println("Number 1 and number 2 are equal and larger, number 3 is the smallest.");
			}else {
				System.out.println("Number 2 and number 3 are equal and larger, number 1 is the smallest.");
			}
		}else {
			if ((number3 > number1) && (number3 > number2)) {
				if (number1 > number2) {
					System.out.println("Number 3 is the largest, number 1 is larger than number 2.");
				}else if (number2 > number1) {
					System.out.println("Number 3 is the largest, number 2 is larger than number 1.");
				}else {
					System.out.println("Number 3 is the largest, number 1 and number 2 are equal and smaller.");
				}
			}else if (number3 == number1) {
				System.out.println("Number 3 and number 1 are equal and larger, number 2 is the smallest.");
			}else {
				System.out.println("Number 3 and number 2 are equal and larger, number 1 is the smallest.");
			}
		}
	}

}
