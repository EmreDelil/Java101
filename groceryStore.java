package Giris;
import java.util.Scanner;
public class groceryStore {

	public static void main(String[] args) {
		/*Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını
		 *  ekrana yazdıran programı yazın.
		 */
		Scanner input = new Scanner(System.in);
		double pear, apple, tomato, banana, aubergine, price;
		System.out.print("How many kgs of pear ? : ");
		pear = input.nextDouble();
		System.out.print("How many kgs of apple ? : ");
		apple = input.nextDouble();
		System.out.print("How many kgs of tomato ? : ");
		tomato = input.nextDouble();
		System.out.print("How many kgs of banana ? : ");
		banana = input.nextDouble();
		System.out.print("How many kgs of aubergine ? : ");
		aubergine = input.nextDouble();
		
		price = pear*2.14 + apple*3.67 + tomato*1.11 + banana*0.95 + aubergine*5.00;
		System.out.println("Total prize is : "+price);
	}

}
