package Loops;
import java.util.Scanner;
public class ATM {

	public static void main(String[] args) {
		// Java döngüler ile kullanıcının banka hesabını yönetebildiği bir ATM projesi yapıyoruz.

		String userName, password;
		int i, select, loginCounter = 0, balance = 2000, price;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter your username : ");
		userName = scan.nextLine();
		System.out.print("Please enter your password : ");
		password = scan.nextLine();
		
		for(i = 1; i <= 2; i++) {
			if((userName.equals("EmreDelil")) && (password.equals("1234"))) {
				System.out.println("Login successful. Welcome to Delil Bank.");
				do {
					System.out.println("1-) Deposit\n2-) Withdraw\n3-) Balance Inquiry\n4-) Exit");
					System.out.print("What do you want to do ? : ");
					select = scan.nextInt();
					if((select < 1) || (select > 4)) {
						System.out.println("You entered incorrectly. Please try again.");
					}else if (select == 1) {
						System.out.print("Enter the amount to be deposit : ");
						price = scan.nextInt();
						balance += price;
						System.out.println("At the end of the transaction, the balance is : " + balance);
					}else if (select == 2) {
						System.out.print("Enter the amount to be withdraw : ");
						price = scan.nextInt();
						if(price > balance) {
							System.out.println("Insufficient balance.");
						}else {
							balance -= price;
							System.out.println("At the end of the transaction, the balance is : " + balance);
						}
					}else if (select == 3){
						System.out.println("The balance is : " + balance);
					}
				} while(select != 4);
				System.out.println("Do't forget your card please.\nSee you again.");
				break;
			}else {
				System.out.println("Username or password is false. Please try again.");
				System.out.println("Your remaining right : " + (2-loginCounter));
				System.out.print("Please enter your username : ");
				userName = scan.nextLine();
				System.out.print("Please enter your password : ");
				password = scan.nextLine();
				loginCounter++;
				if(loginCounter == 2) {
					System.out.println("Your account has been blocked. Please contact the bank.");
				}
			}
		}
		
		// With Switch - Case
		
		String UserName, Password;
		int right = 3, Balance = 2000, Select, Price;
		Scanner input = new Scanner(System.in);
		
		while(right > 0) {
			System.out.print("Username : ");
			UserName = input.nextLine();
			System.out.print("Password : ");
			Password = input.nextLine();
			
			if ((UserName.equals("EmreDelil")) && (Password.equals("1234"))) {
				System.out.println("Login succesfull. Welcome to Delil Bank.");
				do {
				System.out.println("1-) Deposit\n2-) Withdraw\n3-) Balance Inquiry\n4-) Exit");
				System.out.print("What you want to do ? : ");
				Select = input.nextInt();
				switch(Select) {
					case 1:
						System.out.print("Enter the amount to be deposit : ");
						Price = input.nextInt();
						Balance += Price;
						break;
					case 2:
						System.out.print("Enter the amount to be withdraw : ");
						Price = input.nextInt();
						if(Price > Balance) {
							System.out.println("Insufficient balance.");
						}else {
							Balance -= Price;							
						}
						break;
					case 3:
						System.out.println("Balance : " + Balance);
						break;
					case 4:
						System.out.println("Don't forget your card please.\nSee you again.");
						break;
					default:
						System.out.println("You entered incorrectly. Please try again.");
				}
				}while(Select != 4);
				break;
			}else {
				right--;
				if(right == 0) {
					System.out.println("Your account has been blocked. Please contact the bank.");
				}else {
					System.out.println("You entered incorrectly. Please try again.");
					System.out.println("Remaining right : " + right);					
				}
			}
		}
	}
}
