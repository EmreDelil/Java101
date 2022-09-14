package Loops;
import java.util.Scanner;
public class doWhile {

	public static void main(String[] args) {
		/* Do-while döngüsünün çalışma mantığı while döngüsü ile aynıdır , fakat while döngüsünde parantez
		 * içerisindeki koşul sağlandığı sürece kod bloğu çalışacaktır. Ama Do-while döngüsünde durum false
		 * olsa bile döngü en az bir kere çalışacaktır. Bu tür durumlar için Do-while kullanılır.
		 */
		
		int year = 2022;
		do {
			System.out.println(year);
			year++;
		} while(year < 2022);
		
		// --------------------------------------
		
		int pass;
		boolean askPassword = true;
		Scanner inp = new Scanner(System.in);
		
		do {
			System.out.print("Enter your password : ");
			pass = inp.nextInt();
			if (pass == 123) {
				System.out.println("Correct!");
				askPassword = false;
			}else {
				System.out.println("Wrong!");
			}
		} while(askPassword);
	}
}
