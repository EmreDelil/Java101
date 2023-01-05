package NumberGuessingGame;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class NumberGuessing {
	public static void main(String[] args) {
	// Programın 0-100 arasında rastgele seçtiği bir sayıyı kullanıcının tahmin etmesini istediğimiz bir "Sayı Tahmin Oyunu" yapıyoruz.
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int number, guessNumber, minus;
		boolean isWrong = false;
		
		number = rand.nextInt(100);
		System.out.println(number);
		// Aşağıdaki ve yukarıdaki aynı sonuca çıkar.
		/* number = (int) (Math.random() * 100);
		System.out.println(number); */
		
		int[] wrong = new int[5];
		
		for(int i = 5; i > 0; i--) {
			System.out.print("Please guess the number : ");
			guessNumber = scan.nextInt();
			if(guessNumber < 1 || guessNumber > 99) {
				if(i == 1) {
					System.out.println("Your remaining right : "+ (i-1));
					System.out.println("You lost the game.");
					System.out.println("The number is : "+ number);
					break;
				}
				System.out.println("Please enter a number between 0 and 100.");
				if(!isWrong) {
					isWrong = true;
					i++;
					System.out.println("If you enter wrong again, your right will be reduced by one.");
				}
				System.out.println("Your remaining right : "+ (i-1));
				continue;
			}
			if(number == guessNumber) {
				System.out.println("Congratulations! You win the game.");
				System.out.print("Your wrong guesses : ");
				for(int j: wrong) {
					if(j != 0) {
						System.out.print(j + " ");
					}
				}
				break;
			}else {
				wrong[5-i] = guessNumber;
				System.out.println(guessNumber +" is wrong. Please try again.");
				System.out.println("Your remaining right : "+ (i-1));
				if(i == 1) {
					System.out.println("You lost the game.");
					System.out.println("The number is : "+ number);
					System.out.print("Your wrong guesses : ");
					for(int j: wrong) {
						if(j != 0) {
							System.out.print(j + " ");
						}
					}
					break;
				}
				minus = guessNumber - number;
				if(Math.signum(minus) > 0) {
					System.out.println("A hint : "+ guessNumber +" is higher than the number.");
				}else {
					System.out.println("A hint : "+ guessNumber +" is lower than the number.");
				}
				System.out.println();
			}
		}
	}
}
