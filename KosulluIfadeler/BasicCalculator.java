package KosulluIfadeler;
import java.util.Scanner;
public class BasicCalculator {

	public static void main(String[] args) {
		
		//With if-else
		
		int select, s;
		float number1, number2, n1, n2;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		number1 = input.nextFloat();
		System.out.print("Enter the second number : ");
		number2 = input.nextFloat();
		
		System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
		System.out.print("Please choose one : ");
		select = input.nextInt();
		
		if(select == 1) {
			System.out.println("Addition : " +(number1+number2));
		}else if (select == 2) {
			System.out.println("Subtraction : " +(number1-number2));
		}else if (select == 3) {
			System.out.println("Multiplication : " +(number1*number2));
		}else if (select == 4) {
			if(number2 == 0) {
				System.out.println("A number can not be divided by zero !");
			}else {
				System.out.println("Division : " +(number1/number2));
			}
		}else {
			System.out.println("You made wrong choice. Please try again.");
		}
		
		//With Switch-Case
		
		System.out.print("Enter the first number : ");
		n1 = input.nextFloat();
		System.out.print("Enter the second number : ");
		n2 = input.nextFloat();
		
		System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
		System.out.print("Please choose one : ");
		s = input.nextInt();
		
		switch(s) {
			case 1:
				System.out.println("Addition : "+ (n1 + n2));
				break;
			case 2:
				System.out.println("Subtraction : " + (n1 - n2));
				break;
			case 3:
				System.out.println("Multiplication : " + (n1 * n2));
				break;
			case 4:
				if(n2 == 0) {
					System.out.println("A number can not be divided by zero !");
				}else {
					System.out.println("Division : " + (n1 / n2));
				}
				break;
			default:
				System.out.println("You made wrong choise. Please try again.");
		}
	}

}
