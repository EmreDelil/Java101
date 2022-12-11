package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class MaxAndMinValue {

	public static void main(String[] args) {
		// Dizideki Elemanların Max ve Min Değerlerini Bulan Programı yazınız.
		
		int[] list = {83,182,12,17,523,5,-8,-831,-53,-84,51,4};
		
		int min = list[0], max = list[0];
		
		for(int i: list) {
			if(i < min) { // list[i] < min ? min = list[i] : ''
				min = i;
			}
			if(i > max) { // list[i] > max ? max = list[i] : ''
				max = i;
			}
		}
		System.out.println("Maximum value is : " + max);
		System.out.println("Minimum value is : " + min);
		
		// Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.
		
		int number, Max = list[0], Min = list[0];
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter a number : ");
		number = scan.nextInt();
		
		//{83,182,12,17,523,5,-8,-831,-53,-84,51,4}
		Arrays.sort(list);
		for(int i: list) {
			if(i < number) {
				Min = i;
			}
			if(i > number) {
				Max = i;
				break;
			}
		}
		System.out.println(Arrays.toString(list));
		System.out.println("The smallest value greater than the entered number : " + Max);
		System.out.println("The largest value less than the entered number : " + Min);
	}

}
