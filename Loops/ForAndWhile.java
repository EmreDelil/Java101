package Loops;
import java.util.Scanner;
public class ForAndWhile {

	public static void main(String[] args) {
		// Girilen sayı negatif olduğunda programı bitiren program.
		int i;
		Scanner input = new Scanner(System.in);
		
		// With for :
		// for döngüsü false olmadığı sürece çalışmaya devam edicek. 3. kısım boş bırakılabilir.
		for (boolean run = true; run;) {
			
			System.out.print("Please enter a number : ");
			i = input.nextInt();
			
			if(i < 0) {
				run = false;
			}
		}
		System.out.println("Program has finished. The new program is going to start.");
		
		// With while :
		
		do {
			
			System.out.print("Please enter a number : ");
			i = input.nextInt();
			
		} while(i > 0);
		System.out.println("Program has finished.");
	}

}
