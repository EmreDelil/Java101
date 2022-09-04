package KosulluIfadeler;
import java.util.Scanner;
public class UserLogIn {

	public static void main(String[] args) {
		
		// Kullanıcı adı ve şifresinin doğruluğunu sorgulayan program.
		String username, password, newPassword;
		int p1;
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Username : ");
		username = inp.nextLine();
		System.out.print("Password : ");
		password = inp.nextLine();
		
		
		/* Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı
		 * sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması
		 * gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre
		 * giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.*/
		
		if(username.equals("emreDelill")) {
			if (password.equals("java123")) {	
				System.out.println("Log in successfull.");
			}else {
				System.out.println("Your password is incorrect.");
				System.out.println("1-Yes\n2-No");
				System.out.print("Would you like to reset your password ? : ");
				p1 = inp.nextInt();
					if(p1 == 1) {
						System.out.print("Please enter the new password : ");
						Scanner input = new Scanner(System.in);
						newPassword = input.nextLine();
							if(newPassword == password) {
								System.out.println("The password could not create, new and old password can not be the same.");
							}else {
								System.out.println("The password was changed !");
							}
					}else if(p1 == 2) {
						System.out.println("The password was not changed.");
					}else {
						System.out.println("You have entered incorrectly!");
					}
			}
		}else {
			System.out.println("Your username is incorrect.");	
		}
		
	}

}
