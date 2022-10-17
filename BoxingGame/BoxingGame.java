package BoxingGame;
import java.util.Scanner;
public class BoxingGame {
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Team = Fighter 1 and Fighter 2\n"
				+ "2. Team = Fighter 2 and Fighter 3");
		System.out.print("Which team do you want to fight? : ");
		a = sc.nextInt();
		
		Fighter f1 = new Fighter("Fighter 1",110,80,35);
		Fighter f2 = new Fighter("Fighter 2",90,60,25);
		Fighter f3 = new Fighter("Fighter 3",100,65,35);
		Fighter f4 = new Fighter("Fighter 4",120,85,30);
		
		Ring start1 = new Ring(f1,f4);
		Ring start2 = new Ring(f2,f3);
		switch(a) {
			case 1:
				start1.run();
				break;
			case 2:
				start2.run();
				break;
			default:
				System.out.println("You entered incorrectly.");
		}
	}
}
