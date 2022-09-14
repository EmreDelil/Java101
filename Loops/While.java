package Loops;
import java.util.Scanner;
public class While {

	public static void main(String[] args) {
		int i = 1, k;
		System.out.println("The program has started.");
		while (i <= 5) {
			System.out.println(i);
			k = 1;
			while(k<= 10) {
				System.out.print(k+",");
				k++;
			}
			System.out.println();
			i++;
		}
		System.out.println("The program has finished.");
		
		// --------------------------------------
		
		int left = 100, right = 200;
		// içerisine kod yazılmayacak while döngüsü için {} yerine ; kullanılabilir.
		while (++left < --right);
		System.out.println(left);
		
		// --------------------------------------

		int password;
		boolean isPasswordSuccess = true;
		Scanner input = new Scanner(System.in);

		while (isPasswordSuccess) {
			System.out.print("Enter your password : ");
			password = input.nextInt();
			if(password == 123) {
				System.out.println("The password is true.");
				isPasswordSuccess = false;
			}else {
				System.out.println("The password is false.");
			}
		}
		// --------------------------------------------------
		
		Scanner scanner = new Scanner(System.in);
		String customerPassword = "12345";
		boolean passwordSuccessfull = false;

		while(!passwordSuccessfull) {
			
			System.out.println("Enter the password : ");
			String typedPassword = scanner.next();
			
		    if(customerPassword.contentEquals(typedPassword)) {
				passwordSuccessfull = true;
				System.out.println("You have login successfully!");
			}
		}
	}

}

