package PalindromicWords;
import java.util.Scanner;

public class PalindromicWords {
	
	static boolean isPalindromic(String str) {
		int i = 0, j = str.length() - 1;
		
		while(i < j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	// 2. yöntem olarak : 
	
	static boolean isPalindromic2(String str) {
		String reverse = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		return str.equals(reverse);
	}
	
	public static void main(String[] args) {
		/* Kullanıcının girdiği kelimenin "Palindromik" olup olmadığı bulan bir program yazıyoruz.
		 * Eğer bir kelimenin tersten okunuşu yine aynı kelimeyi veriyorsa o kelime "Palindromik Kelime'dir".
		 * Örnek : abba , asa , kavak, kayak
		 */
		Scanner input = new Scanner(System.in);
		String word;
		
		System.out.print("Please enter a word : ");
		word = input.nextLine();
		
		System.out.println(isPalindromic(word));
		System.out.println(isPalindromic2(word));
	}
}
