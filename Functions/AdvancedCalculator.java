package Functions;
import java.util.Scanner;
public class AdvancedCalculator {
	
	static double add() {
		Scanner sc = new Scanner(System.in);
		double number, total = 0.0;
		int i = 1;
		while(true) {
			System.out.print("Please enter the " + i++ + ". number : ");
 			number = sc.nextDouble();
 			if(number == 0) {
 				break;
 			}
 			total += number;
		}
		return total;
	}

	static double sub() {
		double number, total = 0.0;
		int i = 1;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("Please enter the " + i++ + ". number : ");
			number = sc.nextDouble();
			if(number == 0) {
				break;
			}
			if(i == 2) {
				total = number;
			}else {
				total -= number;
			}
		}
		return total;
	}
	
	static double multi() {
		double number, total = 1.0;
		int i = 1;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("Please enter the " + i++ + ". number : ");
			number = sc.nextDouble();
			if(number == 0) {
				total = 0;
				break;
			}
			if(number == 1) {
				break;
			}
			total *= number;
		}
		return total;
	}
	
	static void div() {
		int i = 1;
		double total = 1.0, number;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("Please enter the " + i++ + ". number : ");
			number = sc.nextDouble();
			if(number == 1) {
				break;
			}else if(number == 0) {
				System.out.println("Undefined result.");
				break;
			}
			if (i == 2) {
				total = number;
			}else {
				total /= number;
			}
		}
		if(number != 0) {
			System.out.println("Division is : " + total);
		}
	}
	
	static void pow() {
		int i, total = 1, baseNumber, expNumber;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the base value : ");
		baseNumber = sc.nextInt();
		System.out.print("Enter the exponent value : ");
		expNumber = sc.nextInt();
		if(baseNumber == 0 && expNumber == 0) {
			System.out.println("Undefined result.");
		}else if (baseNumber == 0) {
			System.out.println("Exponential result is : 0");
		}else if(expNumber == 0) {
			System.out.println("Exponential result is : 1");
		}else {
			for(i = 1; i <= expNumber; i++) {
				total *= baseNumber;
			}
		}
		if(!(baseNumber == 0 || expNumber == 0)) {
			System.out.println("Exponential result is : " + total);
		}
	}

	static void fac() {
		int total = 1, number, tempNumber;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the number : ");
		number = sc.nextInt();
		tempNumber = number;
		if(number < 0) {
			System.out.println("Factorial is undefined.");
		}else if(number == 0 || number == 1) {
			System.out.println("Factorial is : 1");
		}
		while(tempNumber > 1) {
			total *= tempNumber;
			tempNumber--;
		}
		if(number > 1) {
			System.out.println("Factorial is : " + total);
		}
	}
	
	static double mode() {
		double number, modeNumber;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the number : ");
		number = sc.nextDouble();
		System.out.print("Please enter the mode value : ");
		modeNumber = sc.nextDouble();
		
		return number % modeNumber;
	}
	
	static void rect() {
		double length, width, area, perimeter;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the length of the rectangle : ");
		length = sc.nextDouble();
		System.out.print("Please enter the width of the rectangle : ");
		width = sc.nextDouble();
		
		if(length <= 0 || width <= 0) {
			System.out.println("Length or width can not be 0 or less than zero. ");
		}else {
			area = length * width;
			perimeter = (2* length) + (2* width);
			System.out.println("The area is : " + area + " and the perimeter is : " + perimeter);
		}
	}
	
	public static void main(String[] args) {
		/* Java ile kullanıcın seçtiği işlemleri yapan hesap makinesi yapıyoruz.
		 * 
		 * Hesap makinesinin fonksiyonları :
		 * 1- Toplama İşlemi
		 * 2- Çıkarma İşlemi
		 * 3- Çarpma İşlemi
		 * 4- Bölme işlemi
		 * 5- Üslü Sayı Hesaplama
		 * 6- Faktoriyel Hesaplama
		 * 7- Mod Alma
		 * 8- Dikdörtgen Alan ve Çevre Hesabı
		 */
		int choose;
		String menu = "1-Addition\n"
				 + "2-Subtraction\n"
				 + "3-Multiplication\n"
				 + "4-Division\n"
				 + "5-Exponential\n"
				 + "6-Factorial\n"
				 + "7-Mode\n"
				 + "8-Area and perimeter of a rectangle\n"
				 + "0-Exit";
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println(menu);
			System.out.print("What do you want to do ? : ");
			choose = sc.nextInt();
			if(choose == 0) {
				break;
			}
			switch(choose) {
			 	case 1:
			 		System.out.println("Addition is : " + add());
			 		break;
			 	case 2:
			 		System.out.println("Subtraction is : " + sub());
			 		break;
			 	case 3:
			 		System.out.println("Multiplication is : " + multi());
			 		break;
			 	case 4:
			 		div();
			 		break;
			 	case 5:
			 		pow();
			 		break;
			 	case 6:
			 		fac();
			 		break;
			 	case 7:
			 		System.out.println("Mode is : " + mode());
			 		break;
			 	case 8:
			 		rect();
			 		break;
			 	default:
			 		System.out.println("You have entered incorrectly. Please try again.");
			}
		}
	}

}
